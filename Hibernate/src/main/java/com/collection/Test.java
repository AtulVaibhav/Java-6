package com.collection;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		List<Integer> listOfContactsforUser1 = new ArrayList<>();
		listOfContactsforUser1.add(1234);
		listOfContactsforUser1.add(4567);
		
		List<Integer> listOfContactsforUser2 = new ArrayList<>();
		listOfContactsforUser2.add(9876);
		listOfContactsforUser2.add(5643);
		
		User user1 = new User();
		user1.setUserName("Raghav");
		user1.setContactNumbers(listOfContactsforUser1);
		
		User user2 = new User();
		user2.setUserName("Vivek");
		user2.setContactNumbers(listOfContactsforUser2);
		
		session.beginTransaction();
		session.save(user1);
		session.save(user2);
		session.getTransaction().commit();
		System.out.println("User stored successfully");
		session.close();
		

	}

}
