package com.ExceptionHandling;

public class ThrowDemo {
	public static void show(){
		for(int i=1;i<=5;i++){
		  if(i==3){
			throw new ArithmeticException();
		}
		  System.out.println(i);
		}
	}

	public static void main(String[] args) {
		show();

	}

}
