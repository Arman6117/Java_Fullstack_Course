package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DAO {
	public static Connection getConnection() {
		Connection con = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nacs1", "root", "arman2005");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return con;
	}

	
	public int signUp(Data d) {
		int status = 0;
		try {
			Connection con = DAO.getConnection();
		
			String sql = "insert into JEE_MVC1 values(?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
		    ps.setInt(1, d.getUid());
		    ps.setString(2, d.getUsername());
		    ps.setString(3, d.getFullname());
		    ps.setString(4, d.getEmail());
		    ps.setString(5, d.getPassword());

			status = ps.executeUpdate();
			con.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return status;
	}
	
}
