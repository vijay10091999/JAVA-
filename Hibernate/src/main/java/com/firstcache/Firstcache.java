package com.firstcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tutorial.Hibernate.Student;

public class Firstcache {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new  Configuration();
	    cfg.configure("hibernate.cfg.xml");
	    SessionFactory factory =cfg.buildSessionFactory();
	    Session s = factory.openSession();
	    //by default enabled
	    //query will be exceuted and cache will be stored into student object
	    Student student = s.get(Student.class,123);
	    System.out.println(student);
	    
	    System.out.println("working something...");
	    
	    //query will not act again and again student1 object will stored cache 
	    Student student1 = s.get(Student.class,123);
	    System.out.println(student1);
	    
	    
	   //if you want to check the session will be stored any cache or not , showing true and false mesaage
	    System.out.println(s.contains(student1));
	    
	    s.close();
	    factory.close();

	}

}
