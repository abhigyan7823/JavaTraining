package com.springsecurity.dto;

public class AuthRequest {
	private String username;
	private String pass;
	
	
	@Override
	public String toString() {
		return "AuthRequest [username=" + username + ", pass=" + pass + "]";
	}
	public AuthRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AuthRequest(String username, String pass) {
		super();
		this.username = username;
		this.pass = pass;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
}
