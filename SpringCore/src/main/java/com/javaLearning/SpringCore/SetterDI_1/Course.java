package com.javaLearning.SpringCore.SetterDI_1;

public class Course {
  private String courseName;

@Override
public String toString() {
	return "Course [courseName=" + courseName + "]";
}

public String getCourseName() {
	return courseName;
}

public void setCourseName(String courseName) {
	this.courseName = courseName;
}
  
  
}
