package com.oop;

//Functional Interface: interface having exactly one abstract method
// eg: Runnable, Comparator
//Lambda Expression can be only written for functionalInterface
//@

@FunctionalInterface
interface MyInterface{
	void m1();
	
}

public class Test14 {

	public static void main(String[] args) {
		MyInterface myInterface = ()->System.out.println("Hello");//Arrow function
		myInterface.m1();
		
		Test14 t = new Test14();

	}

}
