package com.proposeday;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.DatabaseMetaData;

public class FetchProposeTable {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		

		String className = "com.mysql.cj.jdbc.Driver";

		String url = "jdbc:mysql://localhost:3306/proposedb";
		String userName = "root";
		String password = "root";

		// create and load the driver

		Class.forName(className);

		Connection connection = DriverManager.getConnection(url, userName, password);

		// create statement

		Statement statement = connection.createStatement();

		// execute the statement

		// execute the statement
		ResultSet resultSet = statement.executeQuery("select * from proposeTable ");
		ResultSetMetaData metaData=resultSet.getMetaData();
		int columnCount=metaData.getColumnCount();
		System.out.println("Number of Columns :" +columnCount);
		
		for(int i=1; i <=columnCount; i++) {
			System.out.println(metaData.getTableName(i));
			String columnName= metaData.getColumnName(i);
			String columnType=metaData.getColumnTypeName(i);
			System.out.println(metaData.getCatalogName(i));
			System.out.println(metaData.getColumnClassName(i));
			System.out.println(metaData.getColumnType(i));
			System.out.println("Column "+ i+ ":"+ columnName + "( "+columnType +" )");
			 
		}

		

		// process the result set
		while (resultSet.next()) {
			
			System.out.println(resultSet.getInt(1));
			System.out.println(resultSet.getString(2));
			System.out.println(resultSet.getString(3));
			System.out.println(resultSet.getInt(4));
			System.out.println(resultSet.getString(5));
			System.out.println(resultSet.getString(6));
			System.out.println(resultSet.getString(7));
			

		}
		
		java.sql.DatabaseMetaData databaseMetaData=connection.getMetaData();
		String user_Name=databaseMetaData.getUserName();
		System.out.println(user_Name);
		System.out.println(databaseMetaData.getDriverName());
		System.out.println(databaseMetaData.getDatabaseProductName());
		System.out.println(databaseMetaData.getDatabaseProductVersion());
		
		connection.close();
		
		
		
	}
}
