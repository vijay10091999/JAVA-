package com.states;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Implementation of hibernate object states:
		 * 
		 * transient state
		 * Persistent state
		 * Detached state
		 * Removed state
		 * 
		 * */
		
		System.out.println();
		
		
		SessionFactory s = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		//creating student object:
		Student student = new Student();
		student.setId(101);
		student.setCity("Mumbai");
		student.setName("vijay");
		student.setCerti(new Certificate("java course", "two month"));
		
		
		//student : Transient -> It is not related to the database and the session object.It happed when you create new object
		
		Session f = s.openSession();
		Transaction tx = f.beginTransaction();
		f.save(student);
		
		//student : persistent - It is related to the database and the session object.
		
		student.setName("John");
		
		tx.commit();
		f.close();
		
		//studnet : Detached : prevuois database value cant chnage .dont stored new value after close the session.
		student.setName("Ajay");
		System.out.println(student);
		s.close();
		

	}

}
