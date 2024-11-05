package person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeletePerson {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	//load and Register the driver
	String className="com.mysql.cj.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/persondb";
	String userName="root";
	String password="root";
	
	Class.forName(className);
	
	//Establish the connection
	
	Connection connection= DriverManager.getConnection(url, userName, password);
	
	//create statement 
	
	Statement statement  =connection.createStatement();
	
	//execute the statement 
	
	statement.execute("delete from person where personid=1");
	
	//close the connection
	
	connection.close();
	System.out.println("successfully deleted from DB");
}
}
