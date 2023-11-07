package com.springsecurity.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springsecurity.entity.User;
import com.springsecurity.service.UserService;
import com.springsecurity.userrepo.UserRepo;

@Service
public class UserServiceImp implements UserService {
	
	@Autowired
	UserRepo repo;
	
	@Override
	public List<User> getAllUsers() {
		List<User> userlist = repo.findAll();
		return userlist;
	}
	
	public void addUserService(User user) {
		repo.save(user);
	}
	
	@Override
	public User getUserByUname(String name) {
		User user = repo.findByUsername(name);
		return user;
	}
}
