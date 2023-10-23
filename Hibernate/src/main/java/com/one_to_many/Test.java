package com.one_to_many;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Candidate candidate = new Candidate();
		candidate.setCandidateName("Rahul");
		
		Course course = new Course();
		course.setCourseName("WebDevelopment");
		course.setCandidate(candidate);
		
		Course course2 = new Course();
		course2.setCourseName("Java Development");
		course2.setCandidate(candidate);
		
		List<Course> listOfCourse = new ArrayList<>();
		listOfCourse.add(course);
		listOfCourse.add(course2);
		candidate.setCourse(listOfCourse);
		
	
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		session.beginTransaction();
		session.save(course);
		session.save(course2);
		session.save(candidate);
		
		session.getTransaction().commit();
		System.out.println("Data saved successfully");
		

	}

}
