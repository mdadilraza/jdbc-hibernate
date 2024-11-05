package controller;

import java.sql.SQLException;
import java.util.Scanner;

import dao.BikeDao;
import dto.Bike;

public class UpdateBike {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Bike id ");
		
		int id = scanner.nextInt();
		
		System.out.println("enter The bike Name");
		String name = scanner.next();
		
		Bike bike = new Bike();
		bike.setBikeId(id);
		bike.setBikeName(name);
		
		BikeDao bikeDao = new  BikeDao();
		bikeDao.updateBike(bike);
				
	}

}
