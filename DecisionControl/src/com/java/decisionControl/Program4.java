package com.java.decisionControl;

public class Program4 {

	public static void main(String[] args) {
		/*if(condition 1){
		 * }else if(condition 2){
		 * 
		 * }....n
		 * else{} 
		 */
      int marks = 68;
      if(marks>=80){
    	  System.out.println("Distinction");
      }else if(marks>=60 && marks<80){
    	  System.out.println("First class");
      }else if(marks>=35 && marks<60){
    	  System.out.println("Second class");
      }else{
    	  System.out.println("Better luck next time");
      }
	}

}
