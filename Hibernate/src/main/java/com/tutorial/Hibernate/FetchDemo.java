package com.tutorial.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {

	public static void main(String[] args) {
		
		
		//get
		//load
		Configuration cfg = new  Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory =cfg.buildSessionFactory();
        Session session =  factory.openSession();
        
        //get-student: 102
        Student student = (Student)session.load(Student.class, 103);
        System.out.println(student);
        
        Address ad = (Address)session.load(Address.class,2);
        System.out.println(ad);
        System.out.println(ad.getStreet()+":"+ad.getCity());
        
        
        
        session.close();
        factory.close();
        
        
	}
	
}
