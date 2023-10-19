package com.one_to_one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		Consumer consumer = session.get(Consumer.class, 1);
		System.out.println(consumer.getCousumerName());
		System.out.println(consumer.getVehicle().getVehicleRegistrationNumber());
		session.close();

	}

}
