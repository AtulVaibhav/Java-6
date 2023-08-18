package com.java.decisionControl;

public class DigitSum {
   public static void sumOfDigits(int num){
	   int sum=0;
	  while(num>0){
		  int rem = num%10;//123456%10 = 6
		  num = num/10;//123456/10 = 12345
		  sum = sum+rem;
	  }
	  System.out.println(sum);
   }
	public static void main(String[] args) {
		int num = 123456;// 1+2+3+4+5+6
		sumOfDigits(num);
         
	}

}
