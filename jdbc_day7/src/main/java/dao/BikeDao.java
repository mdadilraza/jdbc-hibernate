package dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import dto.Bike;

public class BikeDao {
	String className = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/bikeDB";
	String userName = "root";
	String password = "root";

	// insertBike() Method
	public void insertBike(Bike bike) throws ClassNotFoundException, SQLException {

		Class.forName(className);

		Connection connection = DriverManager.getConnection(url, userName, password);
		CallableStatement callableStatement = connection.prepareCall("call bikeDB.insertBike(?,?,?,?,?,?)");

		callableStatement.setInt(1, bike.getBikeId());
		callableStatement.setString(2, bike.getBikeName());
		callableStatement.setString(3, bike.getBikeBrand());

		callableStatement.setDouble(4, bike.getBikeCC());
		callableStatement.setDouble(5, bike.getBikePrice());
		callableStatement.setString(6, bike.getBikeColour());

		callableStatement.execute();

		connection.close();
		System.out.println("successfully stored procedure has been called and data inserted ");

	}

	// updateBike method

	public void updateBike(Bike bike) throws ClassNotFoundException, SQLException {

		Class.forName(className);

		Connection connection = DriverManager.getConnection(url, userName, password);
		CallableStatement callableStatement = connection.prepareCall("{call bikeDB.updateBike(?,?)}");
		callableStatement.setString(1, bike.getBikeName());
		callableStatement.setInt(2, bike.getBikeId());
		
		
		callableStatement.execute();

		connection.close();
		System.out.println("successfully stored procedure has been called and data updated  ");

	}
	
	//Delete Bike Method 
	
	public void deleteBike(Bike bike) throws ClassNotFoundException, SQLException {
		Class.forName(className);

		Connection connection = DriverManager.getConnection(url, userName, password);
		CallableStatement callableStatement = connection.prepareCall("{call bikeDB.deleteBike(?)}");
		callableStatement.setInt(1, bike.getBikeId());
		
		
		callableStatement.execute();

		connection.close();
		System.out.println("successfully stored procedure has been called and data deleted   ");

	}
	
	//Fetch bike method
	public void fetchBike() throws SQLException, ClassNotFoundException {
		Class.forName(className);

		Connection connection = DriverManager.getConnection(url, userName, password);
		CallableStatement callableStatement = connection.prepareCall("{call bikeDB.fetchBike()}");
ResultSet resultSet		 =callableStatement.executeQuery();

		while(resultSet.next()) {
			System.out.println(resultSet.getInt(1));
			System.out.println(resultSet.getString(2));
			System.out.println(resultSet.getString(3));
			System.out.println(resultSet.getDouble(4));
			System.out.println(resultSet.getDouble(5));
			System.out.println(resultSet.getString(6));
			
		}
		
		

		connection.close();
		

	}

}
