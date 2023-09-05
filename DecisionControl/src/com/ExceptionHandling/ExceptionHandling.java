package com.ExceptionHandling;
//try,catch,finally,throw ,throws
public class ExceptionHandling {
   public void show(){
	 //catch will get executed only if try block has some exception
	   try{
		  System.out.println("Stat1"); 
		  System.out.println("Stat2");
		  System.out.println("Stat3"); 
	   }catch(Exception ex){
		   System.out.println("Exception handled successfully");
		   
	   }
	   
	  //case 2
//	   try{
//			  System.out.println("Stat1"); 
//			  System.out.println(12/0);
//			  System.out.println("Stat3"); 
//		   }catch(Exception ex){
//			   System.out.println("Exception handled successfully");
//			   
//		   }
	   
	   
	   // case3
	   
//	   String str = null;
//	   System.out.println(str.length());//Exception
//	     try{
//	    	 System.out.println("Stat1");
//	    	 System.out.println(12/0);
//	     }catch(Exception ex){
//	    	 System.out.println("Exception handled successfully");
//	     }
	   
	   
	   // case 4
	   
//	   try{
//		   String str = null;
//		   System.out.println(str.length());
//	   }catch(ArithmeticException ae){
//		   System.out.println("Exception handled successfully");
//	   }
	   
	   
	   
	   // finally block: code will execute even when exception is not handled
	   
	   try{
		   System.out.println(12/0);
		  
	   }finally{
		   System.out.println("important code");
	   }
	   
	   
	   
	   
	   
   }
	public static void main(String[] args) {
		new ExceptionHandling().show();

	}

}
