package com.userservice.controller;

import java.util.Collections;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.userservice.dto.LoginCredentials;
import com.userservice.dto.UserDTO;
import com.userservice.exceptions.UserNotFoundException;
import com.userservice.service.JWTUtil;
//import com.userservice.entity.User;
import com.userservice.service.UserService;

import jakarta.validation.Valid;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@RequestMapping("/api")
public class AuthController {

	@Autowired
	private JWTUtil jwtUtil;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private AuthenticationManager authenticationManager;

	@PostMapping("/addUser")
	public ResponseEntity<Map<String, Object>> registerHandler(@Valid @RequestBody UserDTO user)
			throws UserNotFoundException {
		String encodedPass = passwordEncoder.encode(user.getPassword());
		user.setPassword(encodedPass);
		UserDTO userDTO = userService.registerUser(user);
		String token = jwtUtil.generateToken(userDTO.getEmail());
		return new ResponseEntity<Map<String, Object>>(Collections.singletonMap("jwt-token", token),
				HttpStatus.CREATED);
	}
	
	@PostMapping("/loginUser")
	public ResponseEntity<String> loginHandler(@Valid @RequestBody LoginCredentials credentials) {

		UsernamePasswordAuthenticationToken authCredentials = new UsernamePasswordAuthenticationToken(
				credentials.getEmail(), credentials.getPassword());
		authenticationManager.authenticate(authCredentials);
		String token = jwtUtil.generateToken(credentials.getEmail());
		return ResponseEntity.ok().body(token);
		
	}
}
