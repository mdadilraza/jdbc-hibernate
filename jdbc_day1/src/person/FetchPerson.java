package person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchPerson {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String className = "com.mysql.cj.jdbc.Driver";

		String url = "jdbc:mysql://localhost:3306/persondb";
		String userName = "root";
		String password = "root";

		// create and load the driver

		Class.forName(className);

		Connection connection = DriverManager.getConnection(url, userName, password);

		// create statement

		Statement statement = connection.createStatement();

		// execute the statement

		// execute the statement
		ResultSet resultSet = statement.executeQuery("select * from person ");

		// process the result set 
		while (resultSet.next()) {
//		    int personId = resultSet.getInt("personid");
//		    String personName = resultSet.getString("personname");
//		    int personAge=resultSet.getInt("personage");
//		    String personCity=resultSet.getString("personcity");
//		    long personPhone=resultSet.getLong("personphone");
//		    // Process other columns as needed
//
//		    System.out.println("Person ID: " + personId + ", Person Name: " + personName + ", Person Age:"+ personAge+ ", Person City:"+personCity+", Person PhoneNo: "+personPhone);
		  System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getInt(3)+" "+ resultSet.getString(4)+" "+resultSet.getLong(5));
		}

		// close the connection

		connection.close();
		System.out.println("successfully Fetched  from DB");

	}
}
