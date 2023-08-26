package com.oop;


interface Info{
	void m1();
}

class  ClassA implements Info{
	 public void m1(){
		 System.out.println("Hello");
	 }
}

class ClassB implements Info{
	public void m1(){
		 System.out.println("Hi");
	 }
}

class ClassC implements Info{
	public void m1(){
		 System.out.println("Hey");
	 }
}
public class Test9 {
    public void doSomething(Info obj){
    	obj.m1();
    }
	public static void main(String[] args) {
		Test9 obj = new Test9();
//		ClassB b = new ClassB();
//		obj.doSomething(new ClassC());
        obj.doSomething(new ClassC());
	}

}
