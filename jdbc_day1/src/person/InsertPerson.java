package person;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertPerson {
  public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	  //load and register the driver
	  
	  Class.forName("com.mysql.cj.jdbc.Driver");
	  
	  //Establish the connetcion with DB
	Connection connection  =DriverManager.getConnection("jdbc:mysql://localhost:3306/persondb","root","root");
	
	//create the statement 
	
	Statement statement = connection.createStatement();
	
	//execute the statement 
	
	statement.execute("insert into person values (6,'Tabish',45,'HYD',9973588866)");
	
	
	//close the connection
	
	connection.close();

  } 
}
