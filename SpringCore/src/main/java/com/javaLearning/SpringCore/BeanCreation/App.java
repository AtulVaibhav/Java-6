package com.javaLearning.SpringCore.BeanCreation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/javaLearning/SpringCore/BeanCreation/Bean.xml");
         Box2 bean = (Box2)context.getBean("box2");
         context.getBean("box2",Box2.class);
    }
}
