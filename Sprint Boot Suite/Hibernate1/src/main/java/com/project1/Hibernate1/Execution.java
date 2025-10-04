package com.project1.Hibernate1;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Execution {
	public static void main(String[] args) {
		// Scanner to take user input
		Scanner sc = new Scanner(System.in);

		// ==================== Hibernate Setup ====================

		// 1. Create Configuration object and load hibernate.cfg.xml file
		//    This file contains DB connection settings + Hibernate configs.
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		// 2. Tell Hibernate which class (entity) to manage (User.class)
		cfg.addAnnotatedClass(User.class);

		// 3. Build a SessionFactory (heavy object, ideally one per app)
		SessionFactory sf = cfg.buildSessionFactory();

		// 4. Open a new Session (lightweight, used for a single unit of work)
		Session ses = sf.openSession();

		// 5. Begin a transaction (all DB operations must happen inside a transaction)
		Transaction tr = ses.beginTransaction();

		// ==================== Example: Create a User ====================
		// Creating an object of User and setting values
		User u2 = new User();
		u2.setId(103);
		u2.setDepartment("CS");
		u2.setName("Ram");
		u2.setSal(54000.53f);

		// Persist (save) the user into the database
		// Uncomment below line to actually save
		// ses.persist(u2);

		// ==================== Example: Fetch a User by ID ====================
		System.out.println("Enter id to fetch the user: ");
		int id = sc.nextInt();

		// Fetch user from DB by primary key (id)
		// load() = lazy loading (proxy object, throws exception if not found)
		// get()  = eager loading (returns null if not found)
		User u = ses.byId(User.class).load(id);

		// Print fetched user details
		System.out.println("User id: " + u.getId() + "\n"
				+ "User name: " + u.getName() + "\n"
				+ "User department: " + u.getDepartment() + "\n"
				+ "User salary: " + u.getSal());

		// ==================== Commit Transaction ====================
		// Finalize changes (write to DB)
		tr.commit();

		// Always close resources (good practice)
		ses.close();
		sf.close();
		sc.close();
	}
}
