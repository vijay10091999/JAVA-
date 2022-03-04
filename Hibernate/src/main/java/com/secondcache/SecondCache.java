package com.secondcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tutorial.Hibernate.Student;

public class SecondCache {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new  Configuration();
	    cfg.configure("hibernate.cfg.xml");
	    SessionFactory factory =cfg.buildSessionFactory();
	    
	    //first session
	    Session s1 = factory.openSession();
	    
	    Student student1= s1.get(Student.class, 123);
	    System.out.println(student1);
	    
	    s1.close();
	    
	   
	    //second session
	    Session s2 = factory.openSession();
	    
	    Student student2= s2.get(Student.class, 123);
	    System.out.println(student2);
	    
	    s2.close();
	}

}
