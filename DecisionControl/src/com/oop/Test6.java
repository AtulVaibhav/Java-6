package com.oop;

abstract class Account{
	int a = 10;
	abstract public void calculateSalary();
}

class PTE extends Account{
    int a = 20;
	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
		
	}
}

class FTE extends Account{
	@Override
	public void calculateSalary(){
		System.out.println("FTE salary calculation");
	}
}

public class Test6 {

	public static void main(String[] args) {		
      PTE obj = new PTE();
      obj.calculateSalary();
      System.out.println(obj.a);
      
      FTE obj2 = new FTE();
      obj2.calculateSalary();
      
      Account a1 = new PTE(); //Runtime Polymorphism
      System.out.println(a1.a);
      
	}

}
