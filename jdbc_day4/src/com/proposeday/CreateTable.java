package com.proposeday;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// load and register the driver

		Class.forName("com.mysql.cj.jdbc.Driver");

		// Establish the connetcion with DB
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/proposedb", "root", "root");

		// create the statement

		Statement statement = connection.createStatement();

		// execute the statement

		statement.execute("create table proposeTable (proposerId int primary key , proposerName varchar(20),proposerGender varchar(25),proposerAge int, proposerAddress varchar(25), acceptorName varchar(30), remarks varchar(30))");

		// close the connection

		connection.close();

		System.out.println("successfully  table created  in db");

	}
}
