package com.Collection.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeCode {

	public static void main(String[] args) {
		Deque<Integer> deque = new ArrayDeque<>();
		deque.add(10);
		deque.add(20);
		deque.add(30);
		deque.add(40);
		deque.add(50);
		deque.add(60);
		
		System.out.println(deque);
		
		deque.addFirst(100);
		System.out.println(deque);
		
		
		deque.addLast(200);
		System.out.println(deque);
		
		System.out.println(deque.peek());
		System.out.println(deque.peekFirst());
		
		
		System.out.println(deque.peekLast());
		
		
		
		
		
		
		

	}

}
