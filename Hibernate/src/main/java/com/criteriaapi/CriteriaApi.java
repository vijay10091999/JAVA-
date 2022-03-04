package com.criteriaapi;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.tutorial.Hibernate.Student;

public class CriteriaApi {
public static void main(String[] args) {
	SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	Session s = factory.openSession();
	Criteria c = s.createCriteria(Student.class);
	c.add(Restrictions.eq("certi.course","Android"));
	List<Student> students = c.list();
	
	for(Student st : students) {
		System.out.println(st);
	}
	

	s.close();
	factory.close();

}
}
