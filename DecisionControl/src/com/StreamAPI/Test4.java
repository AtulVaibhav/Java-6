package com.StreamAPI;

import java.util.Arrays;
import java.util.List;

class Employee{
	int id;
	String name;
	int yoe;
	int salary;
	public Employee(){
		
	}
	public Employee(int id, String name, int yoe, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.yoe = yoe;
		this.salary = salary;
	}
	
	
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


	public int getYoe() {
		return yoe;
	}


	public void setYoe(int yoe) {
		this.yoe = yoe;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", yoe=" + yoe + ", salary=" + salary + "]";
	}
	
	
}

public class Test4 {

	public static void main(String[] args) {
		Employee e1 = new Employee(101,"Akash",6,78000);
		Employee e2 = new Employee(102,"Harsh",4,45000);
		Employee e3 = new Employee(103,"Yogesh",7,80000);
		Employee e4 = new Employee(104,"Vinit",3,20000);
		Employee e5 = new Employee(105,"Nimesh",4,50000);

		List<Employee> list = Arrays.asList(e1,e2,e3,e4,e5);
		
		//1. get all employee whose yoe greater than 5
		//2. get all employee whose salary is less than 50000
		//3. get employee whose name is "Vinit"
		//4. get employees whose yoe is between 4-8 years
		
		
		
		
		
		
		
	}

}
