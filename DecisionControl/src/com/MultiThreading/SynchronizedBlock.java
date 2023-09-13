package com.MultiThreading;
class Operation{
	public void print(){
		for(int i=1;i<=10;i++){
			System.out.println("Inside block"+Thread.currentThread().getName()+" "+i);
			
		}
	}
}
class Testing extends Thread{
	Operation operation; 
	Testing(Operation op){
		this.operation = op;
	}
	
	@Override
	public void run(){
		synchronized (operation) {
			operation.print();//restriction only 1 thread: A -1-10
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=100;i<=110;i++){
			System.out.println(Thread.currentThread().getName()+" +is executing");
			System.out.println(Thread.currentThread().getName()+" happy coding");
			
			
		}
	}
}


public class SynchronizedBlock {

	public static void main(String[] args) {
		Operation operation = new Operation();
		Testing t1 = new Testing(operation);
		Testing t2 = new Testing(operation);
		Testing t3 = new Testing(operation);
		t1.setName("A");
		t2.setName("B");
		t3.setName("C");
		t1.start();
		t2.start();
		t3.start();

	}

}
