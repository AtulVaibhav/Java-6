package com.ExceptionHandling;

import java.util.Scanner;

class StudentDataNotFound extends Exception{
	
}
class StudentInfo{
	int id;
	String name;
	String course;
	public StudentInfo(int id, String name, String course) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
	}
	@Override
	public String toString() {
		return "StudentData [id=" + id + ", name=" + name + ", course=" + course + "]";
	}
}

class StudentData{
	public static void getStudent(StudentInfo[] students){
		StudentInfo student = null;
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of student");
		String username = sc.next();
		for(int i=0;i<students.length;i++){
			if(students[i].name.equals(username)){
				
				student = students[i];
				flag = true;
				break;
			}
		}
		
		if(flag){
			System.out.println("Student found");
			System.out.println(student);
		}else{
			try {
				throw new StudentDataNotFound();
			} catch (StudentDataNotFound e) {
				System.out.println("Student not found with given name");
			}
		}	
		
	}
}

public class Test {

	public static void main(String[] args) {
		StudentInfo s1 = new StudentInfo(101, "Harsh", "Java");
		StudentInfo s2 = new StudentInfo(102, "Aman", "Java2EE");
		StudentInfo s3 = new StudentInfo(103, "Amar", "SpringBoot");
		StudentInfo s4 = new StudentInfo(104, "Kashyap", "Hibernate");
		StudentInfo[] students = {s1,s2,s3,s4};
		StudentData.getStudent(students);

	}

}
