package com.javaLearning.SpringCore.Intro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

	public static void main(String[] args) {
		ApplicationContext context = new 
				ClassPathXmlApplicationContext("com/javaLearning/SpringCore/Intro/Bean.xml");
		
		Greeting obj = context.getBean("greetObj",Greeting.class); 
		obj.greet();
	}

}
