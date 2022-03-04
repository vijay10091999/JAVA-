package com.tutorial.Hibernate;

import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmDemo {

	public static void main(String[] args) {
		    Configuration cfg = new  Configuration();
	        cfg.configure("hibernate.cfg.xml");
	        SessionFactory factory =cfg.buildSessionFactory();
	        
	        Student student1 = new Student();
	        student1.setId(123);
	        student1.setName("Vijay Ingle");
	        student1.setCity("Delhi");
	        
	        Certificate certificate1 =new Certificate();
	        certificate1.setCourse("Android");
	        certificate1.setDuration("Two month");
	        student1.setCerti(certificate1);
	        
	        Student student2 = new Student();
	        student2.setId(456);
	        student2.setName("Ajay Ingle");
	        student2.setCity("Mumbai");
	        
	        Certificate certificate2 =new Certificate();
	        certificate2.setCourse("Hibernate");
	        certificate2.setDuration("One month");
	        student2.setCerti(certificate2);
	        
	        
	        Session s = factory.openSession();
	        Transaction tx = s.beginTransaction();
	        
	        
	        //object save :
	        s.save(student1);
	        s.save(student2);
	        
	        
		     tx.commit();
		     s.close();
		     factory.close();
	}

}
