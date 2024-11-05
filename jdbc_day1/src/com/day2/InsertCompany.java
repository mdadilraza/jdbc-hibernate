package com.day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertCompany {
//    int cId;
//    String  cName;
//    String  cAddress;
//    long cPhone;
//    String cEmail;

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Enter the Company id ");

		int cId = scanner.nextInt();
		System.out.println("Enter the Company Name ");

		String cName = scanner.next();
		System.out.println("Enter the Company Address");

		String cAddress = scanner.next();
		System.out.println("Enter the Company phone ");

		long cPhone = scanner.nextLong();
		System.out.println("Enter the Company email ");

		String cEmail = scanner.next();
		
		String query="insert into company values("+cId +",'"+cName+"','"+cAddress+"',"+cPhone+",'"+cEmail+"')";

		
		 Class.forName("com.mysql.cj.jdbc.Driver");
		  
		  //Establish the connetcion with DB
		Connection connection  =DriverManager.getConnection("jdbc:mysql://localhost:3306/companydb","root","root");
		
		//create the statement 
		
		Statement statement = connection.createStatement();
		
		//execute the statement 
		
		statement.execute(query);
		
		
		//close the connection
		
		connection.close();
		
		System.out.println("successfully  inserted into table  ");

	}

}
