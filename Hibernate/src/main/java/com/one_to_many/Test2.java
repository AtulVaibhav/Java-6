package com.one_to_many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        
        System.out.println("Fetching data based on candidate");
        Candidate candidate = session.get(Candidate.class, 1);
        System.out.println(candidate.getCandidateName());
        //System.out.println(candidate.getCourse().get(0).getCourseName());
        for(Course course:candidate.getCourse()){
        	System.out.println(course.getCourseName());
        }
        
        System.out.println("____________________________________________");
        
        System.out.println("Fetching data based on course");
        Course course = session.get(Course.class, 1);
        System.out.println(course.getCourseName()+" "+course.getCandidate().getCandidateName());
        
	}

}
