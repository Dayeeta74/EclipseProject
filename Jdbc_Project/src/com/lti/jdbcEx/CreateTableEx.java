package com.lti.jdbcEx;
import java.sql.Connection;
import java.sql.Statement;
public class CreateTableEx 
{
	public static void main(String args[]) {
	Connection con=null;
	Statement st=null;
	{
	try {
		con=ConnectionClass.getCon();
		st=con.createStatement();
		String str="create table job1(job_id number primary key,job_name varchar2(40),salary number(7))";
		st.execute(str);
		System.out.println("Table created");
		}
	
	catch(Exception e) 
		{
		e.printStackTrace();
		}
	
	finally
		{
		try {
			st.close();
			con.close();			
			}
		catch(Exception e) 
			{
			e.printStackTrace();
			}
		}
	}
	}
}