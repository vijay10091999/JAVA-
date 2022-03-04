package com.tutorial.Hibernate;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "project statrted...!" );
        
        Configuration cfg = new  Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory =cfg.buildSessionFactory();
        
        //creating student
        Student st = new Student();
        st.setId(102);
        st.setName("ajay");
        st.setCity("Delhi");
       
        System.out.println(st);
        
        
        //ceating object of address class
        
        Address ad = new Address();
        ad.setStreet("morave");
        ad.setCity("delhi");
        ad.setOpen(true);
        ad.setAddedDate(new Date());
        ad.setX(1234.3);
        
        //reading image
        
        FileInputStream fis= new FileInputStream("src/main/java/img.png");
        byte[] data = new byte[fis.available()];
        fis.read(data);
        ad.setImage(data);
        
        //want current session
        
        Session session =  factory.openSession();
        
        //start transcation
        Transaction tx =session.beginTransaction();
        
        //save st object
        session.save(st);
        session.save(ad);
        
        //comitted tx object
        tx.commit();
       
        //session closed
        session.close();
        System.out.println("Done...");
        
    }
}
