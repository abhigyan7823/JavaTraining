package com.springsecurity.service;

import org.springframework.stereotype.Component;

import com.springsecurity.entity.UserInfo;

@Component
public interface UserService {
	public void addNewUser(UserInfo userInfo);
}
