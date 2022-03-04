package com.manytomany.mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToManyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Configuration cfg = new  Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory =cfg.buildSessionFactory();
		
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();

        
        e1.setEmp_id(101);
        e1.setEmp_name("Vijay");
        
        e2.setEmp_id(102);
        e2.setEmp_name("Ajay");
        
        e3.setEmp_id(103);
        e3.setEmp_name("Sanjay");
        
   
        
        List<Employee> list1 = new ArrayList<Employee>();
        list1.add(e1);
        list1.add(e2);
        list1.add(e3);
        
        
        Project p1 = new Project();
        Project p2 = new Project();
        
        p1.setProject_id(123);
        p1.setP_name("Hibernate configuration");
        
        p2.setProject_id(456);
        p2.setP_name("Hibernate mapping");
        
        List<Project> list2 = new ArrayList<Project>();
        list2.add(p1);
        list2.add(p2);
        
        e1.setProjects(list2);
        p2.setEmp(list1);
        
        e2.setProjects(list2);
        p1.setEmp(list1);
        
        e3.setProjects(list2);
        p1.setEmp(list1);
        
        Session s = factory.openSession();
        Transaction tx = s.beginTransaction();
        
        
        //object save answer:
         s.save(e1);
         s.save(e2);
         s.save(e3);
         s.save(p1);
         s.save(p2);
         
         
       
         
	     tx.commit();
	     s.close();
        
        factory.close();
		
		
	}

}
