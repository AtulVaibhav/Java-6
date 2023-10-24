package ManyToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Student s1 = new Student();
		s1.setStudentName("Raghav");
		
		Student s2 = new Student();
		s2.setStudentName("Ankit");
		
		Subject sb1 = new Subject();
		sb1.setSubjectName("Java");
		
		Subject sb2 = new Subject();
		sb2.setSubjectName("JavaEE");
		
		Subject sb3 = new Subject();
		sb3.setSubjectName("Python");
		
		List<Subject> subjectsForStudent1 = new ArrayList<>();
		subjectsForStudent1.add(sb1);
		subjectsForStudent1.add(sb2);
		subjectsForStudent1.add(sb3);
		
		s1.setSubject(subjectsForStudent1);
		
		
		List<Subject> subjectsForStudent2 = new ArrayList<>();
		subjectsForStudent2.add(sb1);
		subjectsForStudent2.add(sb2);
		
		
		s2.setSubject(subjectsForStudent2);
		
		
		session.beginTransaction();
		session.save(s1);
		session.save(s2);
		
		session.getTransaction().commit();
		System.out.println("Data saved successfully");
		session.close();

	}

}
