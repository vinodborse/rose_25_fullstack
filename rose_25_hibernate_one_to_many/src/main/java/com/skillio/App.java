package com.skillio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    	Configuration cf = new Configuration().configure("hibernate.cfg.xml")
					.addAnnotatedClass(User.class)
					.addAnnotatedClass(Document.class);
		SessionFactory sf = cf.buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		//----------------
		
		User u = new User();
		
		u.setId(2);
		u.setName("Don");
		u.setAddress("Pune");

		
		
		Document d1 = new Document();
		d1.setId(103);
		d1.setType("PAN");
		d1.setDoc_number("DON007");
		
		Document d2 = new Document();
		d2.setId(104);
		d2.setType("AADHAR");
		d2.setDoc_number("0077");
		
		List<Document> docs = new ArrayList<>();
		
		docs.add(d1);
		docs.add(d2);

		
		u.setDocuments(docs);		
		
		
		User u2 = new User(3, "Pappu", "Pune", docs);
		
		session.persist(d1);
		session.persist(d2);
		session.persist(u);
		session.persist(u2);
		//---------------
		session.getTransaction().commit();
		session.close();
    }
}
