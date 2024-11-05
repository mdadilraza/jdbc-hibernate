package com.day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateSchemas {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// load and register the driver

		Class.forName("com.mysql.cj.jdbc.Driver");

		// Establish the connetcion with DB
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "root");

		// create the statement

		Statement statement = connection.createStatement();

		// execute the statement

		statement.execute("create schema companydb");

		// close the connection

		connection.close();
		System.out.println("successfully created ");
	}

}
