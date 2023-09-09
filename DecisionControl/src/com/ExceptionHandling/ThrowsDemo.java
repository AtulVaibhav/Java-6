package com.ExceptionHandling;

import com.ExceptionHandling.part2.Demo;

//Exception Propagation
//final ,finally, finalize


public class ThrowsDemo {


	public static void main(String[] args) {
		try{
			Demo.operation();
		}catch(ArithmeticException ae){
			System.out.println("Exception handled");
		}

	}

}
