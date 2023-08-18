package com.java.decisionControl;

import java.util.Scanner;

public class ATM {
    public static void withdraw(){
    	System.out.println("Withdraw executed");
    }
    public static void deposit(){
    	System.out.println("deposit executed");
    }
    public static void balEnquiry(){
    	System.out.println("balEnquiry executed");
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch;
	    do{
	    	 System.out.println("1.withdraw  2.deposit  3.bal");
	   	  System.out.println("Enter your option");
	   	  int option = sc.nextInt();
	   	  switch(option){
	   	  case 1:withdraw();
	   	         break;
	   	  case 2:deposit();
	   	         break;
	   	  case 3:balEnquiry();
	   	         break;
	   	  default:System.out.println("Try again");
	   	  }
	   	  System.out.println("Do you want to continue?");
	       ch = sc.next().charAt(0); 
	    }while(ch=='y');
	    
	    System.out.println("Thanks for using SBI ATM");
	}

}
