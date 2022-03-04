package com.executingnative;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import com.tutorial.Hibernate.Student;

public class ExecutingNative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new  Configuration();
	    cfg.configure("hibernate.cfg.xml");
	    SessionFactory factory =cfg.buildSessionFactory();
	    Session s = factory.openSession();
	    
	    //sql query
	    String q = "select * from student";
	    NativeQuery nq = s.createSQLQuery(q);
	   List<Object []>list =  nq.list();
	    for(Object[] student : list) {
	    	System.out.println(Arrays.deepToString(student));
	    	//System.out.println(student[0]+":"+student[1]);

	    }
	    s.close();
	    factory.close();
	}

}
