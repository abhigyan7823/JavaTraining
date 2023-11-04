package com.learnhibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Strawhat s1 = new Strawhat();
    	s1.setId(1);
    	s1.setName("Luffy");
    	s1.setRole("Captin");
    	Configuration cfg = new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory = cfg.buildSessionFactory();
    	Session session = factory.openSession();
    	Transaction tx = session.beginTransaction();
    	session.save(s1);
    	tx.commit();
    	session.close();
    }
}
