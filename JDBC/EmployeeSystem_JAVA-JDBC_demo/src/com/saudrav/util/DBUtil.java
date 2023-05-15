package com.saudrav.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	public static Connection getConnection() {
		
		String url = "jdbc:mysql://localhost:3306/my_db" ;
		Connection conn=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			System.out.println("Driver Not Found");
		}
		
		try {
			conn = DriverManager.getConnection(url, "root", "mySql@1234");
			//Statement stm = conn.createStatement();
			//ResultSet rs = stm.executeQuery("select * from employees_tbl");
			return conn;
		} catch (SQLException e) {
			System.out.println("Connection failed... Check Username & Password");
		}
		
		return conn;
		
	}

}
