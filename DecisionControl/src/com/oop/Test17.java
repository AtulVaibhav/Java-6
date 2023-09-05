package com.oop;

//Binding: linking method call with method definition
//static :if linking happnd during compile time :Static Polymorphism :overloading
//dynamic : if linking happnd during runtime-time : Dynamic Polymorphism: overriding

//Overloading :
//Within same class
//Name of functions should be same
//Number of arguments must be different
//If number of arguments are same,then their datatypes must be different

class Dimension{
	public void area(int radius){
		System.out.println("Area of circle");
		System.out.println(Math.PI*radius*radius);
	}
	public void area(int length,int breadth){
		System.out.println("Area of rectangle");
		System.out.println(length*breadth);
	}
	public void area(float side){
		System.out.println("Area of square");
		System.out.println(side*side);
	}
	
	
}

public class Test17 {
    public static void main(Integer[] args){
    	System.out.println("Userdefined main method");
    }
	public static void main(String[] args) {
//		Dimension d = new Dimension();
//		d.area(12.2f);
		System.out.println("Required main() by JVM");
		Integer[] arr = {1,2,3,4};
		main(arr);

	}

}
