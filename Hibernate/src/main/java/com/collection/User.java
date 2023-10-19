package com.collection;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "user_data")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	private String userName;
	
	@ElementCollection
	@CollectionTable(name="user_contact", joinColumns = @JoinColumn(name="uid"))
	private List<Integer> contactNumbers;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int userId, String userName, List<Integer> contactNumbers) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.contactNumbers = contactNumbers;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<Integer> getContactNumbers() {
		return contactNumbers;
	}

	public void setContactNumbers(List<Integer> contactNumbers) {
		this.contactNumbers = contactNumbers;
	}

}
