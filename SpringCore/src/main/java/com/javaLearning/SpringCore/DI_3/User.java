package com.javaLearning.SpringCore.DI_3;

import java.util.List;

public class User {
	
	private int userId;
	private String userName;
	private List<Integer> contacts;
	public User(int userId, String userName, List<Integer> contacts) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.contacts = contacts;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", contacts=" + contacts + "]";
	}
	
	
	

}
