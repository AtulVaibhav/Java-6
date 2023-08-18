package com.java.decisionControl;

public class Program3 {
    int data=100;
    static int data2 = 200;
    
    public void m1(){
    	System.out.println(this.data);
    	System.out.println(Program3.data2);
    }
    public static void m2(){
    	System.out.println(data2);
    }
	public static void main(String[] args) {
		new Program3().m1();
	}

}



