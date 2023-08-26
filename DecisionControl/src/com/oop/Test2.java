package com.oop;

public class Test2 {
    Test2(){
    	this(10);
    	System.out.println("Default constructor");
    }
    
    Test2(int a){
    	System.out.println("Parameterized constructor");
    
    }
	public static void main(String[] args) {
		Test2 t = new Test2();

	}

}
