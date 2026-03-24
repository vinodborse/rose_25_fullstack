package com.skillio;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
    	
//    		Common s1 = ac.getBean("cmn", Common.class);
//    		s1.name();

 /*   	
    	User u1 = ac.getBean("u1", User.class);
    	System.out.println(u1.getName());
    	
    	System.out.println("------------");
    	
    	User u2 = ac.getBean("u2", User.class);
    	System.out.println(u2.getName());
*/
    	
    	Employee emp = ac.getBean("emp", Employee.class);
    	
    	emp.empData();
    }
}


