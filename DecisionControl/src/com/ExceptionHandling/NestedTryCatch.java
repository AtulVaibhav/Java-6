package com.ExceptionHandling;

public class NestedTryCatch {

	public static void main(String[] args) {
		try{
			System.out.println("Inside outer try block");
			String str = null;
		   System.out.println(str.length());//NullPointer
//			try{
//				System.out.println("Inside inner try block");
//				int result = 12/0;//Arithmetic
//				System.out.println(result);
//			}catch(NullPointerException ae){
//				System.out.println("Exception handled in inner catch");
//			}finally{
//				System.out.println("Hello finally block1");
//			}
		}catch(ArithmeticException ae){
			System.out.println("Exception handled in outer catch");
		}
		System.out.println("Outside nested try catch");

	}

}
