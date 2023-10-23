package com.one_to_many;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="course_data")
public class Course {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int courseId;
    private String courseName;
    
    @ManyToOne
    @JoinColumn(name="user_id")
    private Candidate candidate;

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(int courseId, String courseName, Candidate candidate) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.candidate = candidate;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Candidate getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}
    
    
    
}
