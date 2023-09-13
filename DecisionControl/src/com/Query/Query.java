package com.Query;

import java.sql.SQLException;

//Exception :class  ----->Throwable
//Error :system generated:
// CheckedException  and UncheckedException

//CheckedException :SQLException,InterruptedException ,ClassCastException, IOException,FileNotFound,CustomException
// Handling is mandatory.

//UncheckedException :RuntimeException: logic: ArithmaticException, NullPointer,NumberFormatException,Index


class KeyNotFoundException extends Exception{
	
}

public class Query {
	
	
	
	public static  void getData(int key) throws KeyNotFoundException{
		int[] arr = {1,2,3,4,5};
		boolean flag = false;
		for(int data:arr){
			if(key==data){
				flag = true;
			}
		}
		if(flag){
			System.out.println("Found the key");
		}else{
			
			throw new KeyNotFoundException();//checked exception
			
		}
	}

	public static void main(String[] args)   {
	
		try {
			getData(7);
		} catch (KeyNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Key not found");
		}
		
		
		
		
//		String str = "1234efg";
//		int data = Integer.parseInt(str);
//		System.out.println(data);
		
		//try-catch throws:jvm:only throw exception
//		try{
//			//risky code
//			System.out.println(12/0);
//			System.out.println("Statement2");
//			
//		}catch(Exception e){
//			System.out.println("Exception handled");
//		}
//		
//		System.out.println("Outside try-catch");
		
		
//		try{
//			//risky code
//			System.out.println(12/0);//Arithmetic
//			System.out.println("Statement2");
//			
//		}catch(NullPointerException e){
//			System.out.println("Exception handled");
//		}
//		
//		System.out.println("Outside try-catch");
//		
		
		
           
//		String str = "Java";
//		System.out.println(str.length());
//		try{
//			int result = 12/0;
//			System.out.println(result);
//		}catch(NullPointerException npe){
//			System.out.println("Exception handled");
//		}
//		System.out.println("Outside try-catch");
		
		
		
//		String str = null;
//		System.out.println(str.length());//npe
//		try{
//			int result = 12/0;
//			System.out.println(result);
//		}catch(NullPointerException npe){
//			System.out.println("Exception handled");
//		}
//		System.out.println("Outside try-catch");
		
		
		
//		try{
//			String str = null;
//			System.out.println(str.length());
//		}catch(ArithmeticException ae){
//			System.out.println("Exception handled by first catch block");
//		}catch(NullPointerException npe){
//			System.out.println("Exception handled by second catch block");
//		}catch(Exception e){
//			System.out.println("Exception handled by third catch block");
//		}
		
//		
//		try{
//			String str = null;
//			System.out.println(str.length());
//		}catch(ArithmeticException ae){
//			System.out.println("Exception handled by first catch block");
//		}catch(Exception npe){
//			System.out.println("Exception handled by second catch block");
//		}catch(NullPointerException e){
//			System.out.println("Exception handled by third catch block");
//		}
		
		
		//Nested try catch
		
//		try{
//			String str = "Java";
//			System.out.println(str.length());
//			
//			try{
//				int data = 12/0;
//				System.out.println(data);
//			}catch(ArithmeticException ae){
//				System.out.println("exception handled in inner catch");
//			}		
//		}catch(NumberFormatException nfe){
//			System.out.println("Exception handled in outer catch");
//		}
		
		
//		try{
//			String str = "Java";
//			System.out.println(str.length());
//			
//			try{
//				int data = 12/0;
//				System.out.println(data);
//			}catch(NullPointerException ae){
//				System.out.println("exception handled in inner catch");
//			}catch(Exception e){
//				System.out.println("exception handled by parent class");
//			}
//		}catch(ArithmeticException nfe){
//			System.out.println("Exception handled in outer catch");
//		}
		
		
		
//		try{
//			String str = null;
//			System.out.println(str.length());	
//			try{
//				int data = 12/0;
//				System.out.println(data);
//			}catch(NullPointerException ae){
//				System.out.println("exception handled in inner catch");
//			}catch(Exception e){
//				System.out.println("exception handled by parent class");
//			}
//		}catch(NullPointerException nfe){
//			System.out.println("Exception handled in outer catch");
//		}
		
		
		//throw:explicity throwing exception(based on condition) 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
