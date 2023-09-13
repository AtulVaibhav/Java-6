//Establishing communication between two thread using wait() and notify().
//Also,if buffer is filled completely,then producer thread needs to wait until consumer thread consume it
//if buffer is empty,then consumer thread needs to wait until producer thread produce an item.


package com.MultiThreading;

import java.util.ArrayList;
import java.util.List;

class SharedBuffer{
	private final int Capacity = 10;
	private List<Integer> buffer = new ArrayList<>();
	
	public synchronized  void produce(int item) throws InterruptedException{
		while(buffer.size()==Capacity){
			wait();
		}
		buffer.add(item);
		System.out.println(Thread.currentThread().getName()+" produced "+item);
		notify();
	}
	public synchronized void consume() throws InterruptedException{
		while(buffer.isEmpty()){
			wait();
		}
		int item = buffer.remove(0);
		System.out.println(Thread.currentThread().getName()+" consumed "+item);
		notify();
	}
}

class Producer extends Thread{
	SharedBuffer sharedBuffer;
	Producer(SharedBuffer sharedBuffer){
		this.sharedBuffer = sharedBuffer;
	}
	
	public void run(){
		for(int i=1;i<=10;i++){
			try {
				sharedBuffer.produce(i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


class Consumer extends Thread{
	SharedBuffer sharedBuffer;
	Consumer(SharedBuffer sharedBuffer){
		this.sharedBuffer = sharedBuffer;
	}
	
	public void run(){
		for(int i=1;i<=10;i++){
			try {
				sharedBuffer.consume();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Consumer tried to consume empty buffer");
			}
			
		}
	}
}





public class ProducerConsumerProblem {

	public static void main(String[] args) {
		SharedBuffer buffer = new SharedBuffer();
		Producer producer = new Producer(buffer);
		Consumer consumer = new Consumer(buffer);
		
		producer.setName("Producer");
		consumer.setName("Consumer");
		
		producer.start();
		consumer.start();

	}

}

//  List<Integer> list = new ArrayList<>();


