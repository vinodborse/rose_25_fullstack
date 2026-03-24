package com.skillio;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    	Configuration cf = new Configuration().configure("hibernate.cfg.xml")
					.addAnnotatedClass(User.class)
					.addAnnotatedClass(Aadhar.class);
		SessionFactory sf = cf.buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		//----------------
		
		Aadhar a1 = new Aadhar();
		a1.setId(101);
		a1.setAadhar_number(333444);
		
		User u = new User();
		
		u.setId(1);
		u.setName("Vinod");
		u.setAddress("Pune");
		u.setAadhar(a1);
		
		session.persist(u);
		session.persist(a1);
		
		//---------------
		session.getTransaction().commit();
		session.close();
    }
}
