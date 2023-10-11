package com.Collection.ComparableInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
	int id;
	String name;
	String course;
	
	Student(int id,String name,String course){
		this.id = id;
		this.name = name;
		this.course = course;
	}
	
	public String toString(){
		return "Student( id:"+id+" name:"+name+" course:"+course+" )";
	}

	@Override
	public int compareTo(Student st) {
		//return name.compareTo(st.name);
		if(id==st.id)return 0;
		else if(id> st.id) return 1;
		else return -1;
	}
}

public class Test {

	public static void main(String[] args) {
		Student s1 = new Student(104,"Vinay","Java");
		Student s2 = new Student(102,"Shantanu","C++");
		Student s3 = new Student(105,"Vivek","C");
		Student s4 = new Student(101,"Harsh","Web Development");
		Student s5 = new Student(103,"Amit","CCNA");
		
		List<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		

	}

}
// obj1.age  and obj2.age

//obj1.age > obj2.age 1
//obj1.age == obj2.age 0
//obj1.age <  obj2.age -1