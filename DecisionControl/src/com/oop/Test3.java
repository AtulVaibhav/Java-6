package com.oop;

class A{
	A(){
		System.out.println("Parent constructor");
	}
}
 class B extends A{
	 B(){
		 //this(10);
		 super();
		 System.out.println("Child constructor");
	 }
	 B(int a){
		 System.out.println("child parameterized constructor");
	 }
 }

public class Test3 {

	public static void main(String[] args) {
		B b = new B();

	}

}
