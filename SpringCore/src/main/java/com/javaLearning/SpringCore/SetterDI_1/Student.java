package com.javaLearning.SpringCore.SetterDI_1;

public class Student {
   private int id;
   private String name;
   private Course course;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Course getCourse() {
	return course;
}
public void setCourse(Course course) {
	this.course = course;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", course=" + course + "]";
}


   
   
}
