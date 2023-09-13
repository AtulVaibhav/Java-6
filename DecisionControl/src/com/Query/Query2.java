package com.Query;


class Address{
	String state;
	Address(String state){
		this.state = state;
	}
}


class Employee{
	int id;
	Address a2; // aggregation
	Employee(int id,Address a2){
		this.id = id;
		this.a2 = a2;
	}
	public void show(){
		System.out.println(id+ " "+a2.state);
	}
	
}

public class Query2 {

	public static void main(String[] args) {
	Address a1 = new Address("Karnataka");//1234
	System.out.println(a1.hashCode());
	Employee emp = new Employee(101,a1);//1234
	emp.show();

	}

}
