package com.cascade;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mapping.Answer;
import com.mapping.Question;

public class CascadeHQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new  Configuration();
	    cfg.configure("hibernate.cfg.xml");
	    SessionFactory factory =cfg.buildSessionFactory();
	    Session s = factory.openSession();
	    
	    Question q1 = new Question();
	    q1.setQuestionId(451);
	    q1.setQuestion("What is swing ?");
	    
	    
	    Answer a1 = new Answer(23122,"It is Important first concept");
	    Answer a2 = new Answer(53567,"It is Important Second concept");
	    Answer a3 = new Answer(65356,"It is Important third concept");

	    List<Answer> list = new ArrayList<>();
	    
	    list.add(a1);
	    list.add(a2);
	    list.add(a3);
	    
	    q1.setAnswers(list);
	    Transaction tx = s.beginTransaction();
	    
	    s.save(q1);
	    
	    
	   
	    tx.commit();
	    s.close();
	    factory.close();
	}

}
