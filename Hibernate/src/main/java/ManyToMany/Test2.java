package ManyToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		System.out.println("Loading student object and fetching subject");
		Student s = session.get(Student.class, 1);
		System.out.println(s.getStudentName());
		for(Subject sub:s.getSubject()){
			System.out.println(sub.getSubjectName());
		}
		
		System.out.println("__________________________________________");
		
		System.out.println("Loading subject object and fetching student");
		Subject sub = session.get(Subject.class, 1);
		System.out.println(sub.getSubjectName());
		for(Student st:sub.getStudents()){
			System.out.println(st.getStudentName());
		}
		
		session.close();

	}

}
