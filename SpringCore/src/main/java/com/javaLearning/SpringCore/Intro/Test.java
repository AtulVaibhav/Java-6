package com.javaLearning.SpringCore.Intro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
//		Transport transport = new Transport(new Bike());
//		transport.getSpeed();
		
		ApplicationContext context = new 
				ClassPathXmlApplicationContext("com/javaLearning/SpringCore/Intro/Bean.xml");
		
		Transport bean = context.getBean("transport",Transport.class);
		bean.getSpeed();

	}

}
