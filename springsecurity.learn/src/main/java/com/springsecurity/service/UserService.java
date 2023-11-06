package com.springsecurity.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.springsecurity.entity.User;

@Component
public interface UserService {
	public List<User> getAllUsers();
	public void addUserService(User user);
	public User getUserByUname(String name);
}
