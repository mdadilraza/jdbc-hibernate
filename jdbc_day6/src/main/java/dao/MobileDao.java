
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

import dto.Mobile;

public class MobileDao {
	
	String className="com.mysql.cj.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/mobileDB";
	String userName="root";
	String password="root";
	
	//Method for Create schema 
	public void createSchema() throws ClassNotFoundException, SQLException {
	Class.forName(className);
		
	Connection connection	=DriverManager.getConnection("jdbc:mysql://localhost:3306/", userName, password);
	
	 Statement statement=connection.createStatement();
	 
	 statement.execute("create schema mobileDB");
	 connection.close();
	 
	 System.out.println("Successfully Schema Created ");
	}

	//Method for creating table 
	
	public void createTable() throws ClassNotFoundException, SQLException {
		Class.forName(className);
		
	Connection connection	=DriverManager.getConnection(url, userName, password);
	
	 Statement statement=connection.createStatement();
	 
	 statement.execute("create table mobile (mobileId int primary key, mobileBrand varchar(30), mobilePrice double, mobileRam int , mobileColor varchar(30),mobileStorage int )");
	 connection.close();
	 
	 System.out.println("Successfully table Created ");
	}
	
	
	//method for insertMobile 
	
	public void insertMobile(Mobile mobile) throws ClassNotFoundException, SQLException {
		Class.forName(className);
		
	Connection connection	=DriverManager.getConnection(url, userName, password);
	
	 Statement statement=connection.createStatement();
	 
	PreparedStatement preparedStatement   =connection.prepareStatement("insert into mobile values(?,?,?,?,?,?)");
	
	preparedStatement.setInt(1, mobile.getMobileId());
	preparedStatement.setString(2, mobile.getMobileBrand());
	preparedStatement.setDouble(3, mobile.getMobilePrice());
	preparedStatement.setInt(4, mobile.getMobileRam());
	preparedStatement.setString(5, mobile.getMobileColor());
	preparedStatement.setInt(6, mobile.getMobileStorage());
	  
	preparedStatement.execute();
	
	 connection.close();
	 
	 System.out.println("Successfully Schema Created ");
	}
	
	//Update table method 
	
	public void updateTable(Mobile mobile) throws ClassNotFoundException, SQLException {
		
		Class.forName(className);
		
	Connection connection	=DriverManager.getConnection(url, userName, password);
		
		Statement statement   = connection.createStatement();
	PreparedStatement preparedStatement	 =connection.prepareStatement("update mobile set mobileBrand=?,mobilePrice=? where mobileId=?");
	
	preparedStatement.setString(1, mobile.getMobileBrand());
	preparedStatement.setDouble(2, mobile.getMobilePrice());
	preparedStatement.setInt(3, mobile.getMobileId());
	
	preparedStatement.execute();
	connection.close();
	
	System.out.println("Successfully values updated ");
	
	}

	//Fetch Method for AllThe table
	public void fetchAllTable() throws ClassNotFoundException, SQLException {
		
		Class.forName(className);
	Connection connection 	=DriverManager.getConnection(url,userName,password);
	Statement statement	=connection.createStatement();
    PreparedStatement preparedStatement   =connection.prepareStatement("select * from mobile");
     ResultSet resultset    =preparedStatement.executeQuery();
	
	while(resultset.next()) {
		System.out.println(resultset.getInt(1));
		System.out.println(resultset.getString(2));
		System.out.println(resultset.getDouble(3));
		System.out.println(resultset.getInt(4));
		System.out.println(resultset.getString(5));
		System.out.println(resultset.getInt(6));
	}
		
	 connection.close();
		
	}
	
	//Fetch Method By price
		public void fetchTableByPrice(Mobile mobile) throws ClassNotFoundException, SQLException {
			
			Class.forName(className);
		Connection connection 	=DriverManager.getConnection(url,userName,password);
	       connection.createStatement();
	   PreparedStatement preparedStatement    =connection.prepareStatement("select * from mobile where mobilePrice=?");
	   preparedStatement.setDouble(1,mobile.getMobilePrice() );
		ResultSet resultset   =preparedStatement.executeQuery();
		
		while(resultset.next()) {
			System.out.println(resultset.getInt(1));
			System.out.println(resultset.getString(2));
			System.out.println(resultset.getDouble(3));
			System.out.println(resultset.getInt(4));
			System.out.println(resultset.getString(5));
			System.out.println(resultset.getInt(6));
		}
			
		 connection.close();
			
		}
		
		//Method for delete mobiletable
		
		public void deleteMobile(Mobile mobile) throws ClassNotFoundException, SQLException {
			Class.forName(className);
			
			Connection connection	=DriverManager.getConnection(url, userName, password);
				
				Statement statement   = connection.createStatement();
			PreparedStatement preparedStatement	 =connection.prepareStatement("delete from mobile where mobileId=?");
			
			
			preparedStatement.setInt(1, mobile.getMobileId());
			
			preparedStatement.execute();
			connection.close();
			
			System.out.println("Successfully values deleted  ");
			
		}
	
}
