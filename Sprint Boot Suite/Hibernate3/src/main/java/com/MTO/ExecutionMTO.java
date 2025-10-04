package com.MTO;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import com.OTO.Account;
import com.OTO.Employee;

public class ExecutionMTO {

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
		   cfg.addAnnotatedClass(Department.class);
		   cfg.addAnnotatedClass(Student.class);
		   SessionFactory  sf  = cfg.buildSessionFactory();
		   
		   Session ses = sf.openSession();
		   Transaction tr = ses.beginTransaction();
		   
		   
		   Department d1 = new Department(1010, "CSE", "NACS-CS");
		   Department d2 = new Department(1011, "DS", "NACS-DS");
		   ses.persist(d1);
		   ses.persist(d2);

		   
		   
		   Student st1 =  new Student(101, "Bob", 1, d1);
		   Student st2 =  new Student(102, "Rahul", 2, d1);
		   Student st3 =  new Student(103, "Raj", 3, d2);
		   Student st4 =  new Student(104, "Rajendra", 2, d2);
		   Student st5 =  new Student(105, "Rajesh", 1, d1);
		   Student st6 =  new Student(106, "Ranu", 2, d2);
		   Student st7 =  new Student(107, "Ram", 1, d1);
		   
		   ses.persist(st1);
		   ses.persist(st2);
		   ses.persist(st3);
		   ses.persist(st4);
		   ses.persist(st5);

		   ses.persist(st6);
		   ses.persist(st7);


		   tr.commit();
		   ses.clear();
		   sf.close();


	}

}
