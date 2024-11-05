package com.proposeday;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateSchema {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Establish the connetcion with DB
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "root");

		// create the statement

		Statement statement = connection.createStatement();

		// execute the statement

		statement.execute("create schema proposedb");

		// close the connection

		connection.close();
		System.out.println("successfully created schema");

	}

}
