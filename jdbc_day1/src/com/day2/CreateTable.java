package com.day2;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		 //load and register the driver
		  
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  
		  //Establish the connetcion with DB
		Connection connection  =DriverManager.getConnection("jdbc:mysql://localhost:3306/companydb","root","root");
		
		//create the statement 
		
		Statement statement = connection.createStatement();
		
		//execute the statement 
		
		statement.execute("create table company (companyId int primary key , companyName varchar(20), companyAddress varchar(25), companyPhone Bigint(10),companyEmail varchar(30 ))");
		
		
		//close the connection
		
		connection.close();
		
		System.out.println("successfully  table created  in db");

	  } 

	}


