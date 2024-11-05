


	package com.day1.example;

	import java.sql.CallableStatement;
import java.sql.Connection;

	import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
	import java.sql.Statement;
	
    
	
	public class InsertDuster {
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			
			 Class.forName("com.mysql.cj.jdbc.Driver");
			  
			  //Establish the connetcion with DB
			Connection connection  =DriverManager.getConnection("jdbc:mysql://localhost:3306/dusterdb","root","root");
			
			//create the statement 
			
			CallableStatement statement = connection.createStatement();
			
			//execute the statement 
			
			statement.execute("insert into duster values (5,'cello10','green',35,10)");
			
			
			
			//close the connection
			
			connection.close();
	 
			System.out.println("Successfull");

		}

	}


