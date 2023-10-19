package com.one_to_one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		Vehicle v = new Vehicle();
		v.setVehicleRegistrationNumber("12ef45rt");
		
		Consumer consumer = new Consumer();
		consumer.setCousumerName("Akash");
		consumer.setVehicle(v);
		
		
		session.beginTransaction();
		session.save(v);
		session.save(consumer);
		session.getTransaction().commit();
		System.out.println("Conumber saved successfully");
		session.close();
		
		
		

	}

}
