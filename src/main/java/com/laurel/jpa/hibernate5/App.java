package com.laurel.jpa.hibernate5;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


public class App {
   public static void main( String[] args ){
    	
       
    	Fruit fruit = null;
    	
    	
    	Configuration con = new Configuration().configure().addAnnotatedClass(Fruit.class);
    	
    	ServiceRegistry reg =  new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
    	SessionFactory sf = con.buildSessionFactory(reg);
    	
    	Session session = sf.openSession();
    	
    	Transaction tx = session.beginTransaction();
    	fruit = (Fruit)session.get(Fruit.class,1);
        	
    	tx.commit();
    	
    	System.out.println(fruit);
   }
}
