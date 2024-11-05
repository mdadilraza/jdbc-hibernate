package person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class UpdatePerson {
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

		 statement.executeUpdate("update person set personname='Shahrukh ',personage=60,personcity='Mum' ,personphone=7535422536 where personid=4");

		// close the connection

		connection.close();
		System.out.println(" successfully deleted from DB");

	}
}
