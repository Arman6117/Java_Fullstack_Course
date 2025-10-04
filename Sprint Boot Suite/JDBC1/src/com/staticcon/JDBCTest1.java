package com.staticcon;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver  ;
public class JDBCTest1 {

	public static void main(String[] args) {
		/*
		 * Static Connection
		 * Step 1 := Create object of driver class
		 * Step 2 := Register with DriverManager class
		 *           (p.s.v.reguisterDriver(Driver object))
		 * Step 3 := DriverManager class will return con
		 * 
		 */
		
		  try {
			Driver obj = new Driver();
			
			DriverManager.registerDriver(obj);
			//URL -> jdbc:mysql://localhost:3306/mydb
			//Username: root
			//Password:*******
			String url = "jdbc:mysql://localhost:3306/NACS1";
			String username = "root";
			String password = "arman2005";
			Connection con = DriverManager.getConnection(url,username,password );
			
		    Statement st = con.createStatement();
		   
		    System.out.println("1] Insert into table");
		    System.out.println("2] Update employee name");
		    System.out.println("3] Delete from table");
		    System.out.println("4] Get all data from table");
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Choose an operation: ");
		    int ch = sc.nextInt();
		   
		   switch (ch) {
		case 1: {
			    String q  = "insert into new_employee values(101, 'Jhon', 1, '50000'), (102, 'Amitab', 1, '50000'), (103, 'Bobby', 2, '60000')";
			    int res = st.executeUpdate(q);
			    System.out.println("Record inserted: "+ res);
			
			    break;
		}
		case 2: {
		    String q  = "upadte new_employee set name = 'Ram' where employee_id=101";
		    int res = st.executeUpdate(q);
		    System.out.println("Record updated: "+ res);
		
		    break;
	    }    
		case 3: {
		    String q  = "delete from new_employee where employee_id=101";
		    int res = st.executeUpdate(q);
		    System.out.println("Record updated: "+ res);
	
	    break;
      }
		case 4: {
		    String q  = "select * from new_employee";
		    ResultSet result = st.executeQuery(q);
		    while(result.next()) {
	    	System.out.println("Employee id: " +  result.getInt("employee_id"));
	    	System.out.println("Employee name: " +  result.getString("name"));
	    	System.out.println("Employee deparment: " +  result.getInt("department_id"));
	    	System.out.println("Employee salary: " +  result.getInt("salary"));
	    	System.out.println();
    }

        break;
}
		default:
			throw new IllegalArgumentException("Unexpected value: " + ch);
		}
		  } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		  }

	}

}
