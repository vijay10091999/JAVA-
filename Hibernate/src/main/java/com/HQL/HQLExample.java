package com.HQL;

import java.util.Arrays;
import java.util.List;

import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tutorial.Hibernate.Student;

public class HQLExample {
public static void main(String[] args) {
	Configuration cfg = new  Configuration();
    cfg.configure("hibernate.cfg.xml");
    SessionFactory factory =cfg.buildSessionFactory();
    Session s = factory.openSession();
    //HQL
    //syntax:
    //
    String query = "from Student as s where s.city=:x and s.name=:n";
    Query q = s.createQuery(query);
   
    q.setParameter("x", "Mumbai");
    q.setParameter("n", "Ajay Ingle");
    // if you want single result -> unique result
    
    List<Student>list = q.list();
    for(Student student : list) {
    	System.out.println(student.getName()+":"+student.getCity());
    }
    
    System.out.println("........................................................................");
    
    
    Transaction tx = s.beginTransaction();
//    Query q1 = s.createQuery("delete from Student as s where s.city=:c");
//    q1.setParameter("c", "Delhi");
//    
//    int r = q1.executeUpdate();
//    System.out.println("Deleted:");
//    System.out.println(r);
    
//    System.out.println("........................................................................");
//    Query q2= s.createQuery("update Student set city=:c where name=:n");
//    q2.setParameter("c", "Mumbai");
//    q2.setParameter("n", "vijay Ingle");
//    int r = q2.executeUpdate();
//   System.out.println(r+"objects updated");
    tx.commit();
 System.out.println("........................................................................");

   //How to excute Join query
//   Query q3 = s.createQuery("select q.question,q.questionId, a.answer from Question as q INNER JOIN q.answers as a");
//   List <Object[]>list3 = q3.getResultList();
//   for(Object[] arr:list3) {
//	   System.out.println(Arrays.toString(arr));
//   }
//    
    
    s.close();
    factory.close();



}
}
