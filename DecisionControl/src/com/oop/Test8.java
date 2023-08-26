package com.oop;


class AInfo{
	public void m1(){
		System.out.println("Hello");
	}
}
class BInfo{
	public void m1(){
		System.out.println("Hi");
	}
}
public class Test8 {
   
	public void doSomething(BInfo b){
		b.m1();
	}
	public static void main(String[] args) {
		Test8 t = new Test8();
		AInfo a  = new AInfo();
		BInfo b = new BInfo();
		//t.doSomething(a);
		t.doSomething(b);

	}

}
