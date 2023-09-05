package com.ExceptionHandling;

public class ExceptionDemo {
   
	public static void main(String[] args) {
		//Exception(recover) , Error(irrecoverable)
		
		//Checked Exception : Handling is mandatory:ClassNotFoundException,SQLException,IOException,CustomException    
		//Unchecked Exception : Handling is optional(Runtime Exception):logic=>NullPointer,ArithmeticEx,NumberFormat,IndexBoundException
       
		//NullPointerException
		//String str =null;
		//System.out.println(str.length());
		
		//ArithmeticException
		//System.out.println(12/0);
		//double data = Math.sqrt(-4);
		//System.out.println(data);
		
		//NumberFormatException
//		String str = "1234efg";
//		int data = Integer.parseInt(str);
//		System.out.println(str);
		
		//ArrayIndexOutOfBoundException
//		int[] arr = {1,2,3};
//		System.out.println(arr[4]);
		
		//StringIndexOutOfBoundException
//		String str = "hello";
//		System.out.println(str.charAt(7));
		
//		char[] charArr = str.toCharArray();
//		System.out.println(charArr[7]);
		
		
		//Thread.sleep(2000);
		//new Thread().join();
		
	}

}
