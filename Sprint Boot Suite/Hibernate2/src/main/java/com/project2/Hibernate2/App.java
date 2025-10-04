package com.project2.Hibernate2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class App {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		SessionFactory sf = HBConfig.getSessionFact();
		System.out.println(sf);
		Session ses = sf.openSession();
		Transaction tr = ses.beginTransaction();

		InputStreamReader irs = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(irs);
		System.out.println("Click 1 for Inserting Records");
		System.out.println("Click 2 for Updating Records");
		System.out.println("Click 3 for Delete Records");
		System.out.println("Click 4 for Fetch Records");
		System.out.println("Choose: ");
		int option = Integer.parseInt(br.readLine());

		switch (option) {
		case 1:
			System.out.println("Enter teacher id: ");
			int t_id = Integer.parseInt(br.readLine());

			System.out.println("Enter teacher name: ");
			String t_name = br.readLine();

			System.out.println("Enter teacher subject: ");
			String t_sub = (br.readLine());

			System.out.println("Enter teacher salary: ");
			float t_sal = Float.parseFloat(br.readLine());

			Teachers t = new Teachers(t_id, t_name, t_sub, t_sal);

			ses.persist(t);
			tr.commit();
			ses.clear();
			sf.close();
			break;

		case 2:
			System.out.println("Enter teacher id to update: ");
			int t_id1 = Integer.parseInt(br.readLine());

			System.out.println("Enter new name: ");
			String t_name1 = br.readLine();

			System.out.println("Enter new subject: ");
			String t_sub1 = (br.readLine());

			Teachers t1 = ses.find(Teachers.class, t_id1);

			t1.setT_name(t_name1);
			t1.setT_sub(t_sub1);

			tr.commit();
			ses.clear();
			sf.close();
		case 3:
			System.out.println("Enter teacher id to delete: ");
			int t_id2 = Integer.parseInt(br.readLine());

			Teachers t2 = ses.find(Teachers.class, t_id2);
			ses.remove(t2);
			tr.commit();
			ses.clear();
			sf.close();
			break;
		case 4:
			System.out.println("Enter teacher id to fetch: ");
			int t_id3 = Integer.parseInt(br.readLine());

			Teachers t3 = ses.find(Teachers.class, t_id3);
			System.out.println(t3.getT_id());
			System.out.println(t3.getT_name());
			System.out.println(t3.getT_sub());
			System.out.println(t3.getT_sal());
		default:
			break;
		}
	}

}
