package com.lti.jdbcEx;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionClass {

	static Connection con=null;
	public static Connection getCon(){
		System.out.println("Database Example Connection");
		try {
		Class.forName("oracle.jdbc.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:orcl", "system", "hr");
		return con;
	}
		catch (Exception e) {
				e.printStackTrace();
		}
		return con;
	}
	}

