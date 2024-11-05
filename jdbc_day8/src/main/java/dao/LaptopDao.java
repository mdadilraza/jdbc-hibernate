package dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dto.Laptop;

public class LaptopDao {
	String className = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/laptopDB";
	String userName = "root";
	String password = "root";

	// create schema() method
	public void createSchema() throws ClassNotFoundException, SQLException {

		Class.forName(className);

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/", userName, password);
		Statement statement = connection.createStatement();
		statement.execute("create schema laptopDB");
		connection.close();
		System.out.println("successfully schema created  ");

	}

	// createTbale () method

	public void createTable() throws ClassNotFoundException, SQLException {
		Class.forName(className);

		Connection connection = DriverManager.getConnection(url, userName, password);
		Statement statement = connection.createStatement();
		statement.execute(
				"create table laptop(laptopId int primary key , laptopName varchar(45), laptopPrice double , laptopRam int )");
		connection.close();
		System.out.println("successfully table  created  ");

	}

	// insert Laptop()

	public void insertLaptop() throws ClassNotFoundException, SQLException {

		Class.forName(className);
		Connection connection = DriverManager.getConnection(url, userName, password);
		Statement statement = connection.createStatement();
		statement.addBatch("insert into laptop values(1,'Dell',62000,6)");
		statement.addBatch("insert into laptop values(2,'HP',50000,6)");
		statement.addBatch("insert into laptop values(3,'Dell',62000,6)");
		statement.addBatch("insert into laptop values(4,'Lenovo',45000,8)");
		statement.addBatch("insert into laptop values(5,'Macbook',100000,16)");
		statement.executeBatch();

		System.out.println("successfully data inserted  into table ");

	}

	// deleteLaptop()
	public void deleteLaptop(Laptop laptop) throws ClassNotFoundException, SQLException {
		Class.forName(className);
		Connection connection = DriverManager.getConnection(url, userName, password);
		CallableStatement callableStatement = connection.prepareCall("call laptopDB.deleteLaptop(?)");
		callableStatement.setInt(1, laptop.getLaptopId());

		callableStatement.execute();
		connection.close();
		System.out.println("successfully data deleted from table");

	}

	// update laptopTable

	public void updateTable(Laptop laptop) throws ClassNotFoundException, SQLException {
		Class.forName(className);
		Connection connection = DriverManager.getConnection(url, userName, password);
		PreparedStatement preparedStatement = connection
				.prepareStatement("update laptop set laptopName=?, laptopPrice=? where laptopId=?");
		preparedStatement.setString(1, laptop.getLaptopName());
		preparedStatement.setDouble(2, laptop.getLaptopPrice());
		preparedStatement.setInt(3, laptop.getLaptopId());

		preparedStatement.execute();
		connection.close();

		System.out.println("Successfully value updated from laptop");
	}
	// fetch laptopDetalis method

	public void fetchLaptop() throws ClassNotFoundException, SQLException {
		Class.forName(className);
		Connection connection = DriverManager.getConnection(url, userName, password);
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from laptop");

		while (resultSet.next()) {
			System.out.println(resultSet.getInt(1));
			System.out.println(resultSet.getString(2));
			System.out.println(resultSet.getDouble(3));
			System.out.println(resultSet.getInt(4));
		}
		
		connection.close();

	}

}
