package com.StreamAPI;


@FunctionalInterface
interface Sum{
	int sumOfElements(int[] arr);
}

class ArrayUtils{
	public static int elementsSum(int[] arr){
		int sum=0;
		for(int data:arr){
			sum += data;
		}
		return sum;
	}
}
public class Test6 {
  
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
       Sum sum = ArrayUtils::elementsSum;
       System.out.println(sum.sumOfElements(arr));
	}

}
