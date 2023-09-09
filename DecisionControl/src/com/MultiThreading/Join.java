package com.MultiThreading;

class TA extends Thread{
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println(Thread.currentThread().getName()+" ->"+i);
		}
	}
}
public class Join {

	public static void main(String[] args) {
		//System.out.println(Thread.currentThread().getName()+" started working");
       TA t = new TA();
       TA t2 = new TA(); 
        t.start();
        try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        t2.start();
       
		
      // System.out.println(Thread.currentThread().getName()+" completed");
       
       
	}

}
