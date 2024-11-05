package com.proposeday;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateProposeTable {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the proposerId");
		int proposerId = scanner.nextInt();
		System.out.println("Enter the proposerName");
		String proposerName = scanner.next();
		


		System.out.println("Enter the proposerAddress");
		String proposerAddress = scanner.next();
		
		
		System.out.println("Enter the AcceptorsName");
		String acceptorsName = scanner.next();
		scanner.nextLine();


		Class.forName("com.mysql.cj.jdbc.Driver");

		// Establish the connetcion with DB
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/proposedb", "root", "root");

		PreparedStatement preparedStatement = connection
				.prepareStatement("update proposeTable  set proposerName=? ,proposerAddress=?, acceptorName=? where proposerId=?");

		
		preparedStatement.setString(1, proposerName);
		
		
		preparedStatement.setString(2, proposerAddress);
		preparedStatement.setString(3, acceptorsName);
		preparedStatement.setInt(4, proposerId);
		
		
		preparedStatement.execute();

		connection.close();

		System.out.println("successfully update value  inserted ");

	}
}
