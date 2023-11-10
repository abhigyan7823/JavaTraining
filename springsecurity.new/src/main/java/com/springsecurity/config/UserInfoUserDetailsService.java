package com.springsecurity.config;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.springsecurity.entity.UserInfo;
import com.springsecurity.repo.UserInfoRepo;

@Component
public class UserInfoUserDetailsService implements UserDetailsService {
	@Autowired
	private UserInfoRepo userrepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println("Username is : " + username);
		
		
		Optional<UserInfo> userInfo = userrepo.findByName(username);
		
		System.out.println(userInfo.toString());
		return userInfo.map(UserInfoDetails::new)
                .orElseThrow(() -> new UsernameNotFoundException("user not found " + username));
//		UserInfo info = this.userrepo.findByName(username);
//		return new UserInfoDetails(info);
	}

}
