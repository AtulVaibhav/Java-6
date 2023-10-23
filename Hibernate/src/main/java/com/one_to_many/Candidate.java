package com.one_to_many;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="candidate_data")
public class Candidate {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int candidateId;
	private String candidateName;
	
	@OneToMany(mappedBy="candidate")
	private List<Course> course;
	public Candidate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Candidate(int candidateId, String candidateName, List<Course> course) {
		super();
		this.candidateId = candidateId;
		this.candidateName = candidateName;
		this.course = course;
	}
	public int getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(int candidateId) {
		this.candidateId = candidateId;
	}
	public String getCandidateName() {
		return candidateName;
	}
	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}
	public List<Course> getCourse() {
		return course;
	}
	public void setCourse(List<Course> course) {
		this.course = course;
	}
	
	
    
}
