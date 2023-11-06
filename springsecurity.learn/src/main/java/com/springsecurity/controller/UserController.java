package com.springsecurity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springsecurity.entity.User;
import com.springsecurity.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;
	
	@GetMapping("/users")
	public List<User> getAll() {
		List<User> userlist = userService.getAllUsers();
		return userlist;
	}
	
	@PostMapping("/user")
	public void addUser(@RequestBody User user) {
		userService.addUserService(user);
	}
	
	@GetMapping("/user/{username}")
	public User getUser(@PathVariable("username") String username) {
		User user = userService.getUserByUname(username);
		return user;
	}
	
}
