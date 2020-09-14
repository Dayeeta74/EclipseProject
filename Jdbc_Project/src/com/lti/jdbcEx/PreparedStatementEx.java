package com.lti.jdbcEx;


import java.sql.*;  
import java.io.*;  
public class PreparedStatementEx {
	
	public static void main(String args[])throws Exception{  
	 
	Connection con=ConnectionClass.getCon();
	  
	PreparedStatement ps=con.prepareStatement("insert into job1 values(?,?,?)");  
	  
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
	  
	do{  
	System.out.println("enter job_id:");  
	int id=Integer.parseInt(br.readLine());  
	System.out.println("enter job_name:");  
	String name=br.readLine();  
	System.out.println("enter salary:");  
	int salary=Integer.parseInt(br.readLine());
	ps.setInt(1,id);  
	ps.setString(2,name);  
	ps.setInt(3,salary);
	int i=ps.executeUpdate();  
	System.out.println(i+" records affected");  
	  
	System.out.println("Do you want to continue: y/n");  
	String s=br.readLine();  
	if(s.startsWith("n")){  
	break;  
	}  
	}while(true);  
	con.close();  
	}
}