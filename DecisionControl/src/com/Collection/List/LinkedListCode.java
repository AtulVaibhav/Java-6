package com.Collection.List;

import java.util.LinkedList;

public class LinkedListCode {
	public static void operations(){
		LinkedList<Integer> linkedList = new LinkedList<>();
		//add()
		linkedList.add(100);
		linkedList.add(200);
		linkedList.add(300);
		
		System.out.println(linkedList);
		
		//add(index,object)
		linkedList.add(2, 1000);
		System.out.println(linkedList);
		
		//addFirst()
		linkedList.addFirst(500);
		System.out.println(linkedList);
		
		//addLast()
		linkedList.addLast(1500);
		System.out.println(linkedList);
		
		//clear() : remove all node
		//linkedList.clear();
		//System.out.println(linkedList);
		
		//element() : if called on empty linkedList:throw exception
		System.out.println(linkedList.element());
		System.out.println(linkedList);
		
		//peek() : null if linkedList is empty
		System.out.println(linkedList.peek());
		System.out.println(linkedList);
		
		//poll()
		System.out.println(linkedList.poll());//500
		System.out.println(linkedList);
		
		
	}

	public static void main(String[] args) {
		operations();

	}

}
