package com.oop;

//toString() : Object

class StudentData{
	int id;
	String name;
	AddressData address;
	public StudentData(int id, String name, AddressData address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "StudentData "
				+ "[id=" + id + ", name=" + name + ","
						+ " address=" + address + "]";
	}
	
	
	
	
	
	
}

class AddressData{
	String city;
	String state;
	public AddressData(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}
	@Override
	public String toString() {
		return "AddressData [city=" + city + ", state=" + state + "]";
	}
	
	
	
}


public class Test15 {

	public static void main(String[] args) {
		AddressData obj = new AddressData("Bangalore","Karnataka");
		System.out.println(obj);
		StudentData s1 = new StudentData(10,"ABC",obj);
		System.out.println(s1);
		
		

	}

}


