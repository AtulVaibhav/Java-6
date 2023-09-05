package com.oop;

//Method Overriding:giving new implemetation
//Inheritance relation
//Signature of method in parent class must be same in child class


class ParentA{
	int i=10;
//	public void m1(){
//		System.out.println("Calling from ParentA");
//	}
}

class ChildA extends ParentA{
	int i=20;
   
	public void m1(){
		System.out.println("Calling from ChildA");
	}
}
class ChildB extends ParentA{
	int i =30;
}
public class Test18 {

	public static void main(String[] args) {
//	ParentA p1 = new ParentA();
//	p1.m1();
//	System.out.println(p1.i);
//	ParentA p = new ChildA();
//	p.m1();
//	System.out.println(p.i);
//	
//	//ref type: ParentA   object type =ChildA
		
		ParentA p3 = new ChildA();
		//p3.m1();
	    
	}

}





