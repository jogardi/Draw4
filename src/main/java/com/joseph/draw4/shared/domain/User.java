package com.joseph.draw4.shared.domain;

import java.io.Serializable;

//@Entity
public class User implements Serializable {
	//@Id @GeneratedValue
	private long id;
	
	private String email;
	
	public User(String email) {
		this.email = email;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public long getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + "]";
	}
}