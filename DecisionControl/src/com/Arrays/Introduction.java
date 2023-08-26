//wap to find the sum of even numbers from given array
package com.Arrays;

public class Introduction {
   public static int sumOfEven(int[] arr){
	   int sum=0;
	   for(int i=0;i<arr.length;i++){
		   if(arr[i]%2==0){ //arr[0] = 1%2 =1
			   sum = sum+arr[i];
		   }
	   }
	   return sum;
   }
	public static void main(String[] args) {
		int[] arr = {11,1,14,16,2,17};
		int result = sumOfEven(arr);
		System.out.println(result);
	}

}
