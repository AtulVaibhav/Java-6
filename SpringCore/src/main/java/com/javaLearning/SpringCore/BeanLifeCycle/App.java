package com.javaLearning.SpringCore.BeanLifeCycle;

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
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/javaLearning/SpringCore/BeanLifeCycle/Bean.xml");
        Box bean = context.getBean("box",Box.class);
        //bean.doSomeTask();
        context.close();
        System.out.println("code completed..");
    
    
    
    }
}
