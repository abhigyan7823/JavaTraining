package com.MultiDb.mysql.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MultiDb.mysql.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
