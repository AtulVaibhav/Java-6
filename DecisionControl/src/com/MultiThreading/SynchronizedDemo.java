package com.MultiThreading;

class Datainfo{
	public synchronized void m1(){
		for(int i=1;i<=5;i++){
			System.out.println(Thread.currentThread().getName()+" ->"+i);
		}
	}
}


class Resources extends Thread{
	Datainfo dataInfo;
	Resources(Datainfo dataInfo){
		this.dataInfo = dataInfo;
	}
	public void run(){
		dataInfo.m1();
	}
}


public class SynchronizedDemo {

	public static void main(String[] args) {
		Datainfo obj = new Datainfo();
		Resources r1 = new Resources(obj);
		Resources r2 = new Resources(obj);
		r1.start();
		r2.start();

	}

}

