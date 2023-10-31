package com.javaLearning.SpringCore.DI_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new 
				ClassPathXmlApplicationContext("com/javaLearning/SpringCore/DI_1/Bean.xml");
        Student bean = context.getBean("obj",Student.class);
        System.out.println(bean);
	}

}
