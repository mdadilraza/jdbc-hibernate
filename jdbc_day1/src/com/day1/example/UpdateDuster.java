package com.day1.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDuster {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String className = "com.mysql.cj.jdbc.Driver";

		String url = "jdbc:mysql://localhost:3306/dusterdb";
		String userName = "root";
		String password = "root";
		
		//load and register the driver
		
		   Class.forName(className);
		   
		   //establish the connection
		   
	Connection connection	   =DriverManager.getConnection(url, userName, password);
	
	     //create statement 
	
	  Statement statement  = connection.createStatement();
	  
	  // execute statement 
	  
	  String query="update duster set duster_color='brown' where duster_color='green'";
	       statement.execute(query);
	  
	 connection.close();
	 
	 System.out.println("Successfull");
		
	}

}
