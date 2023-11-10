package com.springsecurity.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.ToString;

@Entity
@ToString
public class UserInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int userId;
	private String name;
	private String email;
	private String pass;
	private String roles;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	public UserInfo(int userId, String name, String email, String pass, String roles) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.pass = pass;
		this.roles = roles;
	}
	
	 public UserInfo() {
		 
	 }
	
}
