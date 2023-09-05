package com.oop;

interface Testing{
	//variable: public static final
	//methods : public abstract
	
	void showData();

	
	default void displayData(){
		System.out.println("hi");
	}
	
	public static void msg(){
		System.out.println("Hello");
	}
	
	
}

class AInfo1 implements Testing{

	@Override
	public void showData() {
		// TODO Auto-generated method stub
		
	}
	
}

class BInfo1 implements Testing{

	@Override
	public void showData() {
		// TODO Auto-generated method stub
		
	}
	
}
public class Test13 {
   
	public static void main(String[] args) {
		AInfo1 obj = new AInfo1();
	    obj.displayData();

	}

}
