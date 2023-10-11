package com.LambdaExpression;

@FunctionalInterface
interface Calculation2{
	
	void sumOfElement(int[] arr);
	//void  sortedNames(String[] arr);
}
class CalculationImpl implements Calculation2{

	@Override
	public void sumOfElement(int[] arr) {
		int sum= 0;
		for(int data: arr){
			sum = sum+data;
		}
		System.out.println(sum);
	}
	
}

public class Test2 {

	public static void main(String[] args) {
		//using lambda expression
//		Calculation2 calc = (arr)->{
//			int sum= 0;
//			for(int data: arr){
//				sum = sum+data;
//			}
//			System.out.println(sum);
//			
//		};
//		int[] arr = {1,2,3,4};
//		calc.sumOfElement(arr);
		
		//String[] arr = {"Harsh","Vivek","Rajesh","Amit"};
		
		
		Calculation2 calc = new CalculationImpl();
		int[] arr = {1,2,3,4};
		calc.sumOfElement(arr);
		
		
		
		
	}

}
//A function without name
//A function without access modifier
//A function without return type