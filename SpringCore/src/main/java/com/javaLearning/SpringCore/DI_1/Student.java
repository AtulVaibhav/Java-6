package com.javaLearning.SpringCore.DI_1;

public class Student {
    private int studentId;
    private String studentName;
    private String courseEnrolled;
	public Student(int studentId, String studentName, String courseEnrolled) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.courseEnrolled = courseEnrolled;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", courseEnrolled=" + courseEnrolled
				+ "]";
	}
    
    
    
}
