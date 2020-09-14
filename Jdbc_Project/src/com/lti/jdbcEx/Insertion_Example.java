package com.lti.jdbcEx;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Insertion_Example {

	public static void main(String[] args)  {
		try {
		Connection con=ConnectionClass.getCon();
		Statement st=con.createStatement();
		String str="insert into job1 values(19,'designer',990)";
		st.execute(str);
		con.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
