package com.javaLearning.SpringCore.autowiring.byName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new
				ClassPathXmlApplicationContext("com/javaLearning/SpringCore/autowiring/byName/Bean.xml");
       Employee bean = context.getBean("emp",Employee.class);
       System.out.println(bean);
	}

}
