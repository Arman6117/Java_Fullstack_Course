package com.pureDynamic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class JDBCTest3 {
  public static void main(String[] args) {
	  try {
		FileInputStream fis = new FileInputStream("D:\\Java\\Course\\Sprint Boot Suite\\JDBC1\\src\\JDBC.properties");
		Properties p = new Properties();
		p.load(fis);
		
		
		Class.forName(p.getProperty("jdbc.driver"));
		Connection con = DriverManager.getConnection(p.getProperty("jdbc.url"), p.getProperty("jdbc.user"), p.getProperty("jdbc.password"));
		System.out.println(con);
	  } catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	  }
	  
  }
}
