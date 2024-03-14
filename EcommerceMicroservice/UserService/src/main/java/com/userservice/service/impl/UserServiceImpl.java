package com.userservice.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.userservice.config.AppConstants;
import com.userservice.dto.AddressDTO;
import com.userservice.dto.UserDTO;
import com.userservice.entity.Address;
import com.userservice.entity.Role;
import com.userservice.entity.User;
import com.userservice.exceptions.APIException;
import com.userservice.exceptions.ResourceNotFoundException;
import com.userservice.repo.AddressRepo;
import com.userservice.repo.RoleRepo;
import com.userservice.repo.UserRepo;
import com.userservice.service.UserService;

import jakarta.transaction.Transactional;
import lombok.extern.log4j.Log4j2;

@Transactional
@Log4j2
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo userRepo;

	@Autowired
	private ModelMapper mapper;

	@Autowired
	private RoleRepo roleRepo;

	@Autowired
	private AddressRepo addressRepo;

	private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

	@Override
	public List<UserDTO> getAllUsers() {
		log.info("UserServiceImpl's getAllUsers method is Called ");
		List<User> users = userRepo.findAll();
		List<UserDTO> userDTOs = users.stream().map(u -> mapper.map(u, UserDTO.class)).collect(Collectors.toList());
		return userDTOs;
	}

	@Override
	public UserDTO getUserById(Long userId) {
		log.info("UserServiceImpl's getUserById method is Called ");
//		User user = userRepo.getById(userId);
//		UserDTO userDTO = mapper.map(user, UserDTO.class);
//		return userDTO;
		User user = userRepo.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("User", "userId", userId));
		UserDTO userDTO = mapper.map(user, UserDTO.class);
		userDTO.setAddress(mapper.map(user.getAddresses().stream().findFirst().get(), AddressDTO.class));

		return userDTO;

	}

	@Override
	public UserDTO updateUser(Long userId, UserDTO userDTO) {
		log.info("UserServiceImpl's updateUser method is Called ");
		User user = userRepo.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("User", "userId", userId));

		String encodedPass = passwordEncoder.encode(userDTO.getPassword());
		user.setEmail(userDTO.getEmail());
		user.setFirstName(user.getFirstName());
		user.setLastName(userDTO.getLastName());
		user.setMobilePhone(userDTO.getMobileNumber());
		user.setPassword(encodedPass);

		return null;
	}

	@Override
	public String deleteUser(Long userId) {
		log.info("UserServiceImpl's deleteUser method is Called ");
		User user = userRepo.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("User", "userId", userId));
		userRepo.delete(user);
		return "User with userId " + userId + " deleted successfully!!!";
	}

	@Override
	public UserDTO registerUser(UserDTO userDTO) {
		log.info("UserServiceImpl's registerUser method is Called ");
		try {
			User user = mapper.map(userDTO, User.class);

			Role role = roleRepo.findById(AppConstants.USER_ID).get();
			user.getRoles().add(role);

			String country = userDTO.getAddress().getCountry();
			String state = userDTO.getAddress().getState();
			String city = userDTO.getAddress().getCity();
			String pincode = userDTO.getAddress().getPincode();
			String street = userDTO.getAddress().getStreet();
			String buildingName = userDTO.getAddress().getBuildingName();

			Address address = addressRepo.findByCountryAndStateAndCityAndPincodeAndStreetAndBuildingName(country, state,
					city, pincode, street, buildingName);

			if (address == null) {
				address = new Address(country, state, city, pincode, street, buildingName);

				address = addressRepo.save(address);
			}

			user.setAddresses(List.of(address));

			User registeredUser = userRepo.save(user);

			userDTO = mapper.map(registeredUser, UserDTO.class);

			userDTO.setAddress(mapper.map(user.getAddresses().stream().findFirst().get(), AddressDTO.class));

			return userDTO;
		} catch (DataIntegrityViolationException e) {
			throw new APIException("User already exists with emailId: " + userDTO.getEmail());
		}
	}

	@Override
	public boolean emailExists(String email) {
		return userRepo.existsByEmail(email);
	}

}
