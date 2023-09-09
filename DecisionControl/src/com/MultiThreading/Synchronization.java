package com.MultiThreading;

class SharedResource{

	public synchronized void getDetails(){
		//System.out.println("is "+Thread.currentThread().getName()+" has a lock :"+Thread.holdsLock(this));
		for(int i=1;i<=5;i++){
			System.out.println(Thread.currentThread().getName()+" ->"+i);
			try {
				Thread.sleep(2000);//waiting
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


class Thread1A extends Thread{
	SharedResource sharedResource;
	Thread1A(SharedResource sharedResource){
		this.sharedResource = sharedResource;
	}
	
	public void run(){
		sharedResource.getDetails();
	}
}


class Thread2B extends Thread{
	SharedResource sharedResource;
	Thread2B(SharedResource sharedResource){
		this.sharedResource = sharedResource;
	}
	
	public void run(){
		sharedResource.getDetails();
	}
}




public class Synchronization {

	public static void main(String[] args) {
		SharedResource resource = new SharedResource();
		Thread1A t = new Thread1A(resource);
		Thread2B t2 = new Thread2B(resource);
		
		t.start();
		t2.start();
		
		
		
		

	}

}
