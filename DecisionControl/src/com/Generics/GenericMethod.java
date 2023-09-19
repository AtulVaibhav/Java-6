package com.Generics;

//generic method
public class GenericMethod {
	
	public static <T> void displayData(T[] arr){
		for(T data:arr){
			System.out.print(data+" ");
		}
		System.out.println();
	}
	
	
//Bounded type:restrictive
	public static <T extends Number> void getSum(T obj,T obj2){
		 
		  if(obj.getClass().getName().contains("Integer")){
			 // System.out.println(obj.getClass().getName());
			  int sum = obj.intValue() + obj2.intValue();
			  System.out.println(sum);
		  }else if(obj.getClass().getName().contains("Double")){
			  double sum = obj.doubleValue() +obj2.doubleValue();
			  System.out.println("Double "+ sum);
		  }else{
			  float sum = obj.floatValue() + obj2.floatValue();
			  System.out.println("Float "+sum);
		  }
		
	}
	
 public static <T extends Number> void getElementSum(T[] arr){
	    double sum = 0.0;
	    for(T data :arr){
	    	sum += data.doubleValue();   // 1.0  2.0 3.0  1--> 1.0
	    }
	    System.out.println(sum);
 }

	public static void main(String[] args) {
		Integer[] intArr = {1,2,3,4,5,6};
		Double[] doubleArr = {1.1,2.2,3.3};
		String[] strArr = {"AB","BC","CD","DE"};
		
		displayData(intArr);
		displayData(doubleArr);
		displayData(strArr);
      
		Integer obj = new Integer(10);
		Integer obj2 = new Integer(20);
		
		Double obj3 = new Double(20.456);
		Double obj4 = new Double(21.434);
		
		Float obj5 = new Float(23.45f);
		Float obj6 = new Float(23.45f);
		
		String str = "Hello";
		String str1 = "Java";
		
		getSum(obj,obj2);
		getSum(obj3,obj4);
		getSum(obj5,obj6);
		
		//getSum(str,str1);
		
		Integer[] arr = {1,2,3,4};//10
		Double[] arr2 = {1.2,1.3,1.4};//3.9
		
		getElementSum(arr);
		getElementSum(arr2);
		
		
		
	}

}
