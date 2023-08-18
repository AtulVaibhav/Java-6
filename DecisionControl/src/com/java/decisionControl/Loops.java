package com.java.decisionControl;

public class Loops {
    /*for: number of iteration
    while  pre-check = 0 
    do-while post-check = 1
    */
	public static void printTable(int num){
		for(int i=1;i<=10;i++){
			System.out.println(num+" * "+i+"="+(num*i));
		}	
	}
	
	public static int getSum(int n1,int n2){
		int sum=0;
		for(int i=n1;i<=n2;i++){
			sum = sum+i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		//printTable(19);
		System.out.println(getSum(1,10));
	}
}
