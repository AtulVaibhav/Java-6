package com.Collection.List;

import java.util.ArrayList;
import java.util.List;

class Employee{
	int id;
	String name;
	String dept;
	public Employee(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}
	
}

public class EmployeeManagement {
	static List<Employee> list;
	static{
		 list = new ArrayList<>();
	}
	
	public static String addEmployee(Employee emp){
		if(emp!=null){
			list.add(emp);
			return "Employee added successfully";
		}
		return "Something went wrong";
	}
	
	
	public static String getEmployeeById(int empId){
		boolean flag = false;
		
			for(Employee obj:list){
				if(obj.id==empId){
					System.out.println(obj);
					flag = true;
					break;
				}
			}
			if(flag){
				return "Employee found";
			}
			
			return "Employee doesn't exist";
	}
	
	public static List<Employee> getAllEmployee(){
		return list;
		
	}

	public static void main(String[] args) {
		Employee e1 = new Employee(101,"Harsh","R&D");
		Employee e2 = new Employee(102,"Ankit","Testing");
		Employee e3 = new Employee(103,"Raghav","Accounts");
		Employee e4 = new Employee(104,"Sahil","Java Development");
		
		System.out.println(addEmployee(e1));
		System.out.println(addEmployee(e2));
		System.out.println(addEmployee(e3));
		System.out.println(addEmployee(e4));
		
		System.out.println(getAllEmployee());
		
		System.out.println(getEmployeeById(106));
		
	}

}
