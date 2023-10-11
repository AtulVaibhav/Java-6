package com.Collection.Queue;

import java.util.PriorityQueue;

public class PriorityQueueCode {

	public static void main(String[] args) {
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		
		priorityQueue.add(7);
		priorityQueue.add(6);
		priorityQueue.add(5);
		priorityQueue.add(4);
		priorityQueue.add(3);
		priorityQueue.add(2);
		priorityQueue.add(1);
		
		int count=1;
		for(int i=0;i<8;i++){
			priorityQueue.add(count++);
		}
		
		
		
		
		
		
		for(int i=0;i<priorityQueue.size();i++){
			System.out.println(priorityQueue.peek());
	    	System.out.println(priorityQueue.poll());
		}
		
//		System.out.println(priorityQueue);
//		//peek()
//		System.out.println(priorityQueue.peek());
//		
//		System.out.println(priorityQueue.poll());
//		
//		System.out.println(priorityQueue.peek());
//		System.out.println(priorityQueue.poll());
//		
//		System.out.println(priorityQueue.peek());
//		System.out.println(priorityQueue.poll());
//		
//		System.out.println(priorityQueue);
//		System.out.println(priorityQueue.peek());
//		System.out.println(priorityQueue.poll());
//		
//		System.out.println(priorityQueue.peek());
//		System.out.println(priorityQueue.poll());
//		
//		System.out.println(priorityQueue.peek());
//		System.out.println(priorityQueue.poll());
//		
//		
		
		//lowest number :highest priority
		
		
	//hashset works iternally	

	}

}
