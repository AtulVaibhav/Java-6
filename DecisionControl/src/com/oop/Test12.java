package com.oop;


class EmployeeData{
	int id;
	String name;
	Address address;
	public EmployeeData(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "EmployeeData [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
}

class Address{
	String state;
	String country;
	Address(String state,String country){
		this.state = state;
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [state=" + state + ", country=" + country + "]";
	}
	
}

public class Test12 {

	public static void main(String[] args) {
		Address address = new Address("Karnataka","India");
		EmployeeData data = new EmployeeData(101,"Arun",address);
		System.out.println(data);

	}

}
