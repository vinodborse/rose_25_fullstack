package com.skillio;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
      Configuration cf = new Configuration().configure("hibernate.cfg.xml")
    		  									.addAnnotatedClass(Student.class)
    		  									.addAnnotatedClass(Employee.class);
      SessionFactory sf = cf.buildSessionFactory();
      Session session = sf.openSession();
      session.beginTransaction();
       //-------------
       		// INSERT INTO student VALUE (1, 'Vinod', 'Pune');
      	
      	Student s1 = new Student();
      	s1.setAddress("Mumbai");
      	s1.setName("Aliya");
      	
      	// Student s2 = new Student(6, "Anarkali", "Salim ki gali");
      	Student s2 = new Student();
      	s2.setAddress("Pune");
      	s2.setName("Salmon");
      	
      	session.persist(s1);
      	session.persist(s2);
      	
      
      
      /*
      	Student s3 = session.get(Student.class, 6); //SELECT * FROM student WHERE rollno = 3;
      	System.out.println("Student Name:- "+ s3.getName());
      */	
      
      /*
       Student s4 = session.get(Student.class, 5);
       s4.setName("Salmon");
      */
      /*
      Student s5 =  session.get(Student.class, 5);
      session.remove(s5);
      */
      
       //---------------
      session.getTransaction().commit();
      session.close();
    }
}
