package com.springsecurity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springsecurity.entity.User;
import com.springsecurity.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	UserService userService;
	
	@PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/allusers")
	public List<User> getAll() {
		List<User> userlist = userService.getAllUsers();
		return userlist;
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@PostMapping("/user")
	public void addUser(@RequestBody User user) {
		userService.addUserService(user);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/user/{username}")
	public User getUser(@PathVariable("username") String username) {
		User user = userService.getUserByUname(username);
		return user;
	}
	
}
