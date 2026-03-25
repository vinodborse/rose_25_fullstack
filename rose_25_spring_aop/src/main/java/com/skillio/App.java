package com.skillio;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
    	
    	Employee emp = ac.getBean("emp", Employee.class);
    	emp.empData();
    	emp.empSalary();
    }
}
