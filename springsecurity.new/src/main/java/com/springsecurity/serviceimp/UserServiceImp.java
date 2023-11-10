package com.springsecurity.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.springsecurity.entity.UserInfo;
import com.springsecurity.repo.UserInfoRepo;
import com.springsecurity.service.UserService;

@Service
public class UserServiceImp implements UserService {
	
	@Autowired
	private UserInfoRepo userInfoRepo;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public void addNewUser(UserInfo userInfo) {
        userInfo.setPass(passwordEncoder.encode(userInfo.getPass()));
		this.userInfoRepo.save(userInfo);
		
	}

}
