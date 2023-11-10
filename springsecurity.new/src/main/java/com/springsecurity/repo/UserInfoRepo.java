package com.springsecurity.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springsecurity.entity.UserInfo;

@Repository
public interface UserInfoRepo extends JpaRepository<UserInfo, Integer> {
	public Optional<UserInfo> findByName(String name);
}
