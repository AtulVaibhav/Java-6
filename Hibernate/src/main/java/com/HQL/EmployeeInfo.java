package com.HQL;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp_info")
public class EmployeeInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	private String emapName;
	private int empAge;
	private double empSalary;

	public EmployeeInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeInfo(int empId, String emapName, int empAge, double empSalary) {
		super();
		this.empId = empId;
		this.emapName = emapName;
		this.empAge = empAge;
		this.empSalary = empSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmapName() {
		return emapName;
	}

	public void setEmapName(String emapName) {
		this.emapName = emapName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

}
