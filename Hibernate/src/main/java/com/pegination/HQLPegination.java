package com.pegination;

import org.hibernate.query.*;

import com.tutorial.Hibernate.Student;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HQLPegination {
public static void main(String[] args) {
	Configuration cfg = new  Configuration();
    cfg.configure("hibernate.cfg.xml");
    SessionFactory factory =cfg.buildSessionFactory();
    Session s = factory.openSession();
    
    Query query = s.createQuery("from Student");
    query.setFirstResult(0);
    query.setMaxResults(1);
  List<Student>list= query.list();
  for(Student st: list) {
	  System.out.println(st.getId()+":"+st.getName()+":"+st.getCity());
  }
    
    
    s.close();
    factory.close();
}
}
