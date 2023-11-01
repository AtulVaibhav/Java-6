package com.javaLearning.SpringCore.DI_4;

import java.util.List;
public class User {
	
	private int userId;
	private String userName;
	private List<Address> addr;
	public User(int userId, String userName, List<Address> addr) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", addr=" + addr + "]";
	}
	
	
	
	

}
