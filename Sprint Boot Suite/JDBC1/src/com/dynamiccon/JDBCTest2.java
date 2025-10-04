package com.dynamiccon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCTest2 {

	public static void main(String[] args) {
	
		/*
		 * Step1: Create Object to Driver
		 * Step2: Register with DriverManager class
		 * Step3: DriverManager will return Connection
		 */
		
		
		
		try {
			//Dynamic Connection
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nacs1", "root", "vine96");
			
			System.out.println(con);
			
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr);
			
			System.out.println("Click 1 for Insert");
			System.out.println("Click 2 for Update");
			System.out.println("Click 3 for Delete");
			System.out.println("Click 4 for Fetch/Retrive");
			
			int option=Integer.parseInt( br.readLine());
					
			switch(option) {
			
			case 1:{
			System.out.println("Enter Employee Id: ");
			int e_id=Integer.parseInt(br.readLine());
			
			System.out.println("Enter Employee Name: ");
			String e_name=br.readLine();
			
			System.out.println("Enter Department Id: ");
			int d_id=Integer.parseInt(br.readLine());
			
			System.out.println("Enter Employee Salary: ");
			double e_sal=Double.parseDouble(br.readLine());
			
			String sql1="insert into new_employee values(?,?,?,?)";
			PreparedStatement pst=con.prepareStatement(sql1);
			pst.setInt(1, e_id);
			pst.setString(2, e_name);
			pst.setInt(3, d_id);
			pst.setDouble(4, e_sal);
			
			int ii=pst.executeUpdate();
			
			System.out.println("Record Inserted Successfully: "+ ii);
			 break;
			}
			case 2:{
				
				
				System.out.println("Enter Employee Id: ");
				int e_id=Integer.parseInt(br.readLine());
				
				System.out.println("Enter Employee Name: ");
				String e_name=br.readLine();
						
				String sql2="update new_employee set name = ?  where employee_id = ?";
				
				PreparedStatement pst=con.prepareStatement(sql2);
				pst.setInt(2, e_id);
				pst.setString(1, e_name);
				
				int ii=pst.executeUpdate();
				
				System.out.println("Record Updated Successfully: "+ ii);
				
				break;
			}
			case 3:{
				System.out.println("Enter Employee Id: ");
				int e_id=Integer.parseInt(br.readLine());
				
				String sql3="delete from new_employee where employee_id = ?";
				
				PreparedStatement pst=con.prepareStatement(sql3);
				pst.setInt(1, e_id);
				
				int ii=pst.executeUpdate();
				
				System.out.println("Record Deleted Successfully: "+ ii);
				
				break;
				
				
			}
			case 4:{
				
				System.out.println("Enter Employee Id: ");
				int e_id=Integer.parseInt(br.readLine());
				
				String sql4="select * from new_employee where employee_id = ?";
				
				PreparedStatement pst=con.prepareStatement(sql4);
				pst.setInt(1, e_id);
				
				ResultSet rs=pst.executeQuery();
				
				while(rs.next()) {
					System.out.println("Employee Id: "+ rs.getInt("employee_id"));
					System.out.println("Employee Name: "+ rs.getString("name"));
					System.out.println("Department Id: "+ rs.getInt("department_id"));
					System.out.println("Employee Salary: "+ rs.getDouble("salary"));
				}
				
				break;
			}
			default:{
				System.out.println("Enter Valid Input");
			}
			
			
			
			
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}