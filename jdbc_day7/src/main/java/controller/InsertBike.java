package controller;

import java.sql.SQLException;
import java.util.Scanner;

import dao.BikeDao;
import dto.Bike;

public class InsertBike {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		 
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter the bike id ");
		int id= scanner.nextInt();
		System.out.println("enter the bike Name ");
		String name= scanner.next();
		System.out.println("enter the bike Brand ");
		String brand= scanner.next();
		
		System.out.println("enter the bike CC");
		double  bikeCC= scanner.nextDouble();
		System.out.println("enter the bike Price");
		double  price= scanner.nextDouble();
		
		System.out.println("enter the bike Colour");
		String   colour= scanner.next();
		
		
		Bike bike = new Bike();
		bike.setBikeId(id);
		bike.setBikeName(name);
		bike.setBikeBrand(brand);
		bike.setBikeCC(bikeCC);
		bike.setBikePrice(price);
		bike.setBikeColour(colour);
		
		BikeDao bikeDao = new BikeDao();
		bikeDao.insertBike(bike);
		
		
		
	}

}
