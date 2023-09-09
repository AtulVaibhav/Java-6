package com.ExceptionHandling.part2;

import java.sql.SQLException;

public class Demo {
	
	public static void tableCreation() throws ArithmeticException {
		System.out.println(12/0);
	}
	
	public static void operation() throws ArithmeticException{
		tableCreation();
	}
}
