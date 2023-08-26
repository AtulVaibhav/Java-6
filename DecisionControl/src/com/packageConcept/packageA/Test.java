package com.packageConcept.packageA;



public class Test {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		System.out.println(e1.empId);
		Child ch = new Child();
		System.out.println(ch.empId);
		System.out.println(Employee.data);
		
	}

}
//default : within package
//public  : within package , outside package
//private : within same class,not accessible even by sub-class
//protected : within same package same class object as well as child class
// obj 