package com.aggregation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session  = factory.openSession();
		
		Address addr = new Address();
		addr.setCity("Bangalore");
		addr.setState("Karnataka");
		addr.setCountry("India");
		
		
		Student student = new Student();
		student.setName("Rahul");
		student.setCourse("Java");
		student.setAddress(addr);
		
		session.beginTransaction();
		session.save(student);
		session.getTransaction().commit();
		
		System.out.println("Student saved successfully");
		session.close();

	}

}
