package com.userservice.service;

import java.util.List;

import com.userservice.dto.UserDTO;
import com.userservice.entity.User;

public interface UserService {

	List<UserDTO> getAllUsers();

	UserDTO getUserById(Long userId);

	UserDTO updateUser(Long userId, UserDTO userDTO);

	String deleteUser(Long userId);

	UserDTO registerUser(UserDTO user);

	boolean emailExists(String email);

}
