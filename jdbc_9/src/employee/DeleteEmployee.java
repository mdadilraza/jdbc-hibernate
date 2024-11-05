package employee;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class DeleteEmployee {

	public static void main(String[] args) throws SQLException, IOException {
    
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		FileInputStream fileInputStream = new FileInputStream("configuration.properties");
		Properties properties = new Properties();
		properties.load(fileInputStream);
		
Connection  connection		=DriverManager.getConnection(properties.getProperty("url"),properties.getProperty("username"),properties.getProperty("password"));
		
	Statement statement	=connection.createStatement();
	statement.execute("delete from employee where employeeId=1");
	connection.close();
	System.out.println("deleted ");
	}

}
