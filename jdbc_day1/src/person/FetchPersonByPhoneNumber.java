package person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchPersonByPhoneNumber {
	 public static void main(String[] args) throws ClassNotFoundException, SQLException {
		 
		 String className = "com.mysql.cj.jdbc.Driver";

			String url = "jdbc:mysql://localhost:3306/persondb";
			String userName = "root";
			String password = "root";
		 
		//load and register the driver
			
			Class.forName(className);
			
			//establish a connection
			
		Connection connection	=DriverManager.getConnection(url, userName, password);
		
		//create a statement 
		
	Statement statement	= connection.createStatement();
	
	//execute a statement
	  String query ="select * from person where personphone=7561959536";
	   ResultSet resultSet = statement.executeQuery(query);
	     
	   while(resultSet.next()) {
		   System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getInt(3));
	   }
			
			
	}

}
