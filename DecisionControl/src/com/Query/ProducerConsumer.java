package com.Query;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumer {

	public static void main(String[] args) {
		Object key = new Object();
		Queue<Integer> queue = new LinkedList<>();
		int size=10;
		Thread producer = new Thread(new Runnable(){
			int count = 0;
			@Override
			public void run() {
				while(true){
				synchronized(key){
					try {
					 while(queue.size()==size){
						 key.wait();
					 }
				     	queue.offer(count++);
					    key.notifyAll();
						Thread.sleep(1000);
						System.out.println("Product produced "+queue.size());
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				}
			}
			
		});
		
		Thread consumer = new Thread(new Runnable(){

			@Override
			public void run() {
				while(true){
				synchronized(key){
					 try {
						 while(queue.size()==0){
							 key.wait();
						 }
					    queue.poll();
					     key.notifyAll();
						Thread.sleep(800);
						System.out.println("Consumer consumed "+queue.size());
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				 }
				}
				
			}
			
		});
		
		producer.start();
		consumer.start();

	}

}
