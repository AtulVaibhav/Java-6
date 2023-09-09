package com.MultiThreading;


class XYZ implements Runnable{
 
 @Override
  public void run(){
	  System.out.println(Thread.currentThread().getName()+" is working");
  }
}

public class RunnbleClass {

	public static void main(String[] args) {
		Runnable t = new XYZ();
	    Thread th = new Thread(t,"ThreadA");
	    th.start();

	}

}
