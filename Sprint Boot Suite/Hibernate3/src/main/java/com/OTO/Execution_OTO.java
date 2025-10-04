package com.OTO;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;



public class Execution_OTO {

	public static void main(String[] args) {
		   Configuration cfg = new Configuration();
		   Properties p = new Properties();
		   p.setProperty(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
		   p.setProperty(Environment.URL,"jdbc:mysql://localhost:3306/nacs1" );
		   p.setProperty(Environment.USER, "root");
		   p.setProperty(Environment.PASS, "arman2005");
		   p.setProperty(Environment.HBM2DDL_AUTO, "update");
		   p.setProperty(Environment.SHOW_SQL, "true");
		   
		   cfg.setProperties(p);
		   cfg.addAnnotatedClass(Employee.class);
		   cfg.addAnnotatedClass(Account.class);
		   SessionFactory  sf  = cfg.buildSessionFactory();
		   
		   Session ses = sf.openSession();
		   Transaction tr = ses.beginTransaction();
		   
		   
		   Employee e1 = new Employee(101,"Rahul", 300005.3f);
		   Employee e2 = new Employee(102,"Ram", 344405.3f);

		   Employee e3 = new Employee(103,"Raj", 30555.3f);
		   
		   ses.persist(e1);
		   ses.persist(e2);
		   ses.persist(e3);
		   
		   
		   Account ac1 =  new Account(1010, "Savings", "Nagar", e1);
		   Account ac2 =  new Account(1011, "Savings", "Pune", e2);
		   Account ac3 =  new Account(1012, "Current", "Mumbai", e3);
		   
		   ses.persist(ac1);
		   ses.persist(ac2);
		   ses.persist(ac3);
		   
		   tr.commit();
		   ses.clear();
		   sf.close();

	}

}
