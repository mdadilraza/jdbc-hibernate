package com.proposeday;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteProposeTable {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the proposerId");
		int proposerId = scanner.nextInt();
		

		Class.forName("com.mysql.cj.jdbc.Driver");

		// Establish the connetcion with DB
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/proposedb", "root", "root");

		PreparedStatement preparedStatement = connection
				.prepareStatement("delete from proposeTable where proposerId=?");

		preparedStatement.setInt(1, proposerId);

		preparedStatement.execute();

		connection.close();

		System.out.println("successfully  value  deleted ");

	}
}
