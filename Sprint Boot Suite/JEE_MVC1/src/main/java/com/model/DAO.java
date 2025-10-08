package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.FilteredRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.JoinRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import javax.sql.rowset.WebRowSet;

import com.mysql.cj.xdevapi.RowFactory;

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

	public boolean validate(String username, String password) {
		boolean status = false;
		try {
			Connection con = DAO.getConnection();
			PreparedStatement ps = con
					.prepareStatement("select username,password from JEE_MVC1 where username=? and password=?");
			ps.setString(1, username);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				status = true;
			}

		} catch (Exception e) {
			e.addSuppressed(e);
		}

		return status;
	}

	public List fetch(Data d) {
		List li = new Vector();

		try {
			RowSetFactory rf = RowSetProvider.newFactory();
			JdbcRowSet jrs = rf.createJdbcRowSet();
			jrs.setUrl("jdbc:mysql://localhost:3306/nacs1");
			jrs.setUsername("root");
			jrs.setPassword("arman2005");

			jrs.setCommand("select * from JEE_MVC1 where username=? and password=?");
			jrs.setString(1, d.getUsername());
			jrs.setString(2, d.getPassword());
			jrs.execute();

			Data d1 = new Data();

			while (jrs.next()) {
				d1.setUid(jrs.getInt("uid"));
				d1.setUsername(jrs.getString("username"));
				d1.setFullname(jrs.getString("fullname"));
				d1.setEmail(jrs.getString("email"));
				d1.setPassword(jrs.getString("password"));

				li.add(d1);
			}

		} catch (Exception e) {
			e.printStackTrace();

		}
		return li;
	}

	public List fetchUserById(String id) {
		System.out.println("ID Got: " +id);
		List li = new Vector();
        int uid = Integer.parseInt(id);
		try {
			Connection con = DAO.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from JEE_MVC1 where uid=?");

			ps.setInt(1, uid);

			ResultSet rs = ps.executeQuery();
			Data d = new Data();

			while (rs.next()) {
				d.setUid(rs.getInt("uid"));
				d.setUsername(rs.getString("username"));
				d.setFullname(rs.getString("fullname"));
				d.setEmail(rs.getString("email"));
				d.setPassword(rs.getString("password"));
				li.add(d);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return li;
	}

	public int update(Data d) {
		int status = 0;
    System.out.println("Update DAO Called");
    System.out.println("ID: " +d.getUid());
		try {
			Connection con = DAO.getConnection();

			PreparedStatement ps = con
					.prepareStatement("update  JEE_MVC1 set userName=? ,fullName=?, password=?, email=? where uid=?");

			ps.setString(1, d.getUsername());
			ps.setString(2, d.getFullname());
			ps.setString(3, d.getPassword());
			ps.setString(4, d.getEmail());
			ps.setInt(5, d.getUid());
			
			status = ps.executeUpdate();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
}
