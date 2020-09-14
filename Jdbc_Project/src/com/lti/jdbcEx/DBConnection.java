package com.lti.jdbcEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

	public  static void main(String args[]) throws SQLException{
		Connection con=null;
		ResultSet rs=null;
		Statement st=null;
		try {
			System.out.println("Checking DB connection");
			Class.forName("oracle.jdbc.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:orcl","system","hr");
			st=con.createStatement();
			String str="Select * from employee";
			rs=st.executeQuery(str);
			while(rs.next()) {
				System.out.println("Id"+rs.getInt(1)+"Name"+rs.getString(2)+"Loaction"+rs.getString(3));
			}
			System.out.println("Database Connected");
			con.close();
			System.out.println("Database Disconnected");
		}
		catch(ClassNotFoundException c) {
			c.printStackTrace();
		}
		finally {
			st.close();
			rs.close();
			con.close();
		}
	}
}
