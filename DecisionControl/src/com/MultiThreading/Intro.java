package com.MultiThreading;

class PrintTable{
	public void print(int num){
		for(int i=1;i<=10;i++){
			
			System.out.println(num+" X "+i+" = "+(num*i)+" ->"+Thread.currentThread().getName());
		}
	}
}

//First thread
class Thread1 extends Thread{
	PrintTable printTable;//null
	Thread1(PrintTable printTable){
		this.printTable = printTable;
	}
	public void run(){
		printTable.print(3);
	}
}
//Second thread
class Thread2 extends Thread{
	PrintTable p;//null
	Thread2(PrintTable a){
		p = a;
	}
	public void run(){
		p.print(5);
	}
}


public class Intro extends Thread {

	public static void main(String[] args) {
		//Thread.currentThread().getName()
		System.out.println(Thread.currentThread().getName());//parent thread
//		Intro t = new Intro();
//		Intro t2 = new Intro();
//		t.start();//first phase -Thread0
//		t2.start();  //ThreadScheduler : preemptive,time-slicing Thread1
		
		PrintTable table = new PrintTable();
		Thread1 t1 = new Thread1(table);
		Thread2 t2 = new Thread2(table);
		
		t1.setName("ThreadA");
		t2.setName("ThreadB");
		
		
		 t1.start();
		 t2.start();
		//t1.start();

	}

}
//Life cycle 
//1.New  2.Runnable   3.Running      4.Blocked           5.Terminated