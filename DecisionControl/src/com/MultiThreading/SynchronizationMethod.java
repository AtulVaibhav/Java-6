package com.MultiThreading;
class Operation2{
	public synchronized void print(){
		for(int i=1;i<=10;i++){
			System.out.println("Inside block"+Thread.currentThread().getName()+" "+i);
			
		}
		
		for(int i=10;i<=15;i++){
			System.out.println(Thread.currentThread().getName()+" happy coding");
		}
	}
}
class Testing2 extends Thread{
	Operation2 operation; 
	Testing2(Operation2 op){
		this.operation = op;
	}
	
	@Override
	public void run(){
		this.operation.print();
		
}
}
public class SynchronizationMethod {

	public static void main(String[] args) {
		Operation2 operation = new Operation2();
		Testing2 t1 = new Testing2(operation);
		Testing2 t2 = new Testing2(operation);
		Testing2 t3 = new Testing2(operation);
		t1.setName("A");
		t2.setName("B");
		t3.setName("C");
		t1.start();
		t2.start();
		t3.start();


	}

}
// int[] arr=[1,5,4,3,6,0,11,12,10]: peak element
//
