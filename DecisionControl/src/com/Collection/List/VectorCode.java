package com.Collection.List;

import java.util.Vector;

public class VectorCode {
	public static void operations(){
		Vector<String> vector = new Vector<>();
		
		//capacity
		System.out.println(vector.capacity());
		
		//add
		vector.add("Hi");
		vector.add("Hello");
		System.out.println(vector);
		
		//add(index,element)
		vector.add(1,"Good evening");
		System.out.println(vector);
		
		//size()
		System.out.println(vector.size());
		
		//copyInto
		Object[] arr = new Object[vector.size()];
		vector.copyInto(arr);
		for(Object data:arr){
			System.out.print(data+" ");
		}
		
	}

	public static void main(String[] args) {
		operations();

	}

}
