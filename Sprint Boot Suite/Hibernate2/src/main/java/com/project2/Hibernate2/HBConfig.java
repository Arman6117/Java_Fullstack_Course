package com.project2.Hibernate2;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

public class HBConfig {
   private SessionFactory sf;
   
   public static SessionFactory getSessionFact() {
	   SessionFactory sf = null;
	   
	   if(sf == null) {
		   Configuration cfg = new Configuration();
		   Properties p = new Properties();
		   p.setProperty(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
		   p.setProperty(Environment.URL,"jdbc:mysql://localhost:3306/nacs1" );
		   p.setProperty(Environment.USER, "root");
		   p.setProperty(Environment.PASS, "arman2005");
		   p.setProperty(Environment.HBM2DDL_AUTO, "update");
		   p.setProperty(Environment.SHOW_SQL, "true");
		   
		   cfg.setProperties(p);
		   cfg.addAnnotatedClass(Teachers.class);
		   sf = cfg.buildSessionFactory();
		   
	   }
	   return sf;
   }
}
