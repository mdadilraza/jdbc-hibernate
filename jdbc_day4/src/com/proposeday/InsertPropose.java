package com.proposeday;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertPropose {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the proposerId");
		int proposerId = scanner.nextInt();
		System.out.println("Enter the proposerName");
		String proposerName = scanner.next();
		

		System.out.println("Enter the proposergender");
		String proposerGender = scanner.next();

		System.out.println("Enter the proposerAge");
		int proposerAge = scanner.nextInt();
		System.out.println("Enter the proposerAddress");
		String proposerAddress = scanner.next();
		
		
		System.out.println("Enter the AcceptorsName");
		String acceptorsName = scanner.next();
		scanner.nextLine();
		System.out.println("Enter the Reamrks");
		String remarks = scanner.nextLine();

		Class.forName("com.mysql.cj.jdbc.Driver");

		// Establish the connetcion with DB
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/proposedb", "root", "root");

		PreparedStatement preparedStatement = connection
				.prepareStatement("insert into proposeTable values(?,?,?,?,?,?,?)");

		preparedStatement.setInt(1, proposerId);
		preparedStatement.setString(2, proposerName);
		preparedStatement.setString(3, proposerGender);
		preparedStatement.setInt(4, proposerAge);
		preparedStatement.setString(5, proposerAddress);
		preparedStatement.setString(6, acceptorsName);
		preparedStatement.setString(7, remarks);

		preparedStatement.execute();

		connection.close();

		System.out.println("successfully value  inserted ");

	}

}
