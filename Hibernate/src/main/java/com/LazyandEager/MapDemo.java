package com.LazyandEager;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration; 

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		    Configuration cfg = new  Configuration();
	        cfg.configure("hibernate.cfg.xml");
	        SessionFactory factory =cfg.buildSessionFactory();
	
	        //creating qustion
	       /* Question q1 = new Question();
	        q1.setQuestionId(101);
	        q1.setQuestion("What is hibernate ?");

	        //creatting answer
	        Answer ans = new Answer();
	        ans.setAnswer("Hibernate is ORM (Object Relational Mapping) tool. ");
	        ans.setAnswer_id(123);
	        ans.setQuestion(q1);
	        
	        Answer ans1 = new Answer();
	        ans1.setAnswer("Hibernate has Fast Performance.");
	        ans1.setAnswer_id(456);
	        ans1.setQuestion(q1);

	        Answer ans2 = new Answer();
	        ans2.setAnswer("Hibernate has Automatic Table Creation");
	        ans2.setAnswer_id(789);
	        ans2.setQuestion(q1);
	        
	        List<Answer> list = new ArrayList<Answer>();
	        list.add(ans);
	        list.add(ans1);
	        list.add(ans2);
	        
	        q1.setAnswers(list); */

	        Session s = factory.openSession();
	        Transaction tx = s.beginTransaction();
        
	        //object save answer:
	         /*s.save(q1);
	         s.save(ans);
	         s.save(ans1);
	         s.save(ans2); */
	        
	      //if you want to fetch your answer and print on console 
	         
	         Question q = (Question)s.get(Question.class,101);
	         System.out.println(q.getQuestionId());
	         System.out.println(q.getQuestion());
	         
	         //Lazy
	         System.out.println(q.getAnswers().size()); 
	       
		     tx.commit();
		     s.close();
		     factory.close();

     
	}

}
