package com.StringBuffer;

public class StringBufferDemo {

	public static void main(String[] args) {
		//Mutable
		StringBuffer sb = new StringBuffer("Java");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		
		sb.append("World");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		
		//synchronized : thread-safe
		StringBuffer sb1 = new StringBuffer();
		
		//capacity()
		System.out.println(sb1.capacity());//16 =(oldCapacity *2)+2
		sb1.append("agagaagahajajajakka");
		System.out.println(sb1.capacity());
		
		StringBuffer sb2 = new StringBuffer(50);
		System.out.println(sb2.capacity());
		sb2.append("Hello");
		
		//insert()
		sb2.insert(1, "World");
		System.out.println(sb2);
		
		//replace()
		sb2.replace(1, 4, "#");
		System.out.println(sb2);
		
		//reverse
		sb2.reverse();
		System.out.println(sb2);

	}

}
