package com.lti.jdbcEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Jdbc_Example {

	public static void main(String[] args) throws SQLException {
		Connection con=null;
		try{
			System.out.println("Database Example Connection");
			con=ConnectionClass.getCon();
			Statement st=con.createStatement();
			String [] queries = {
					"insert into job1 values (11, 'X', 2000)",
					"insert into job1 values (12, 'Y', 8000)",
					"insert into job1 values (13, 'Z', 4500)",
				};
							
				for (String query : queries) {
					st.execute(query);
				}
			System.out.println("Value Inserted");
			
			System.out.println("Database Disconnected");
			
			//trying git
			System.out.println("This line is just to learn git");
			
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		con.close();
	}

}
