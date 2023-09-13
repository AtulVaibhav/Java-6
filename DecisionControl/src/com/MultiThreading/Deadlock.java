package com.MultiThreading;

class ResourceData{
	static final String resource1 = "pen";
	static final String resource2 = "paper";
}

class Thread1Data implements Runnable{
	@Override
	public void run(){
		synchronized(ResourceData.resource1){
			System.out.println("Thread1 got pen");
			System.out.println("Waiting for paper");
			synchronized (ResourceData.resource2) {
				System.out.println("Thread1 got paper");
			}
		}
		
	}
}

class Thread2Data implements Runnable{
	@Override
	public void run(){
		synchronized(ResourceData.resource2){
			System.out.println("Thread2 got paper");
			System.out.println("Waiting for pen");
			synchronized (ResourceData.resource1) {
				System.out.println("Thread2 got pen");
			}
		}
	}
}
public class Deadlock {

	public static void main(String[] args) {
		
		Thread1Data t1 = new Thread1Data();
		Thread2Data t2 = new Thread2Data();
		Thread obj1 = new Thread(t1);
		Thread obj2 = new Thread(t2);
		obj1.start();
		obj2.start();
		

	}

}
//synchronized method  synchronized block
//Inter thread communication: wait() notify()
//Producer-Consumer problem : write a code to solve Producer-consumer problem

