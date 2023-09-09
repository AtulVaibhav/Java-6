package com.MultiThreading;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

class Resource{
	public void show(){
		System.out.println(Thread.currentThread().getName()+" using resource");
	}
}

class T1 extends Thread{
	Resource resource;
	T1(Resource resource){
		this.resource = resource;
	}
	public void run(){
		this.resource.show();
	}
}

class T2 extends Thread{
	Resource resource;
	T2(Resource resource){
		this.resource = resource;
	}
	public void run(){
		this.resource.show();
	}
}

public class ThreadPriority {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+
				" Priority =>"+Thread.currentThread().getPriority());
		Resource resource = new Resource();
        T1 t1 = new T1(resource);
        T2 t2 = new T2(resource);
        
        t1.setName("A");
        t2.setName("B");
        
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        
        t1.start();
        t2.start();
        
        
        
	}

}
