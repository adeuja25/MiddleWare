package com.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestMySLQL {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// jdbc driver name for mysql
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://127.0.0.1:3306?useSSL=false";
		Connection con = DriverManager.getConnection(url,"root", "deuja123");
		System.out.println("Connection established Successfully!");
		
	}

}
