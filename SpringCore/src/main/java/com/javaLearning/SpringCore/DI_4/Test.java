package com.javaLearning.SpringCore.DI_4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/javaLearning/SpringCore/DI_4/Bean.xml");
	    User bean = context.getBean("user",User.class);
	    System.out.println(bean);
	
	
	}

}
