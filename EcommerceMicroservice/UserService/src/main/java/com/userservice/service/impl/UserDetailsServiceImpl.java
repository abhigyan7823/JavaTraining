package com.userservice.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.userservice.config.UserInfoConfig;
import com.userservice.entity.User;
import com.userservice.exceptions.ResourceNotFoundException;
import com.userservice.repo.UserRepo;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepo userRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> user = userRepo.findByEmail(username);

		return user.map(UserInfoConfig::new)
				.orElseThrow(() -> new ResourceNotFoundException("User", "email", username));
	}

}
