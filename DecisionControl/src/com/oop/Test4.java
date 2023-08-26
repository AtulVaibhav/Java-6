package com.oop;

class Parent{
	int a = 10;
}

class Child extends Parent{
	int a = 20;
	
	public void display(){
		System.out.println(this.a);
		System.out.println(super.a);
	}
}

public class Test4 {

	public static void main(String[] args) {
		new Child().display();

	}

}
