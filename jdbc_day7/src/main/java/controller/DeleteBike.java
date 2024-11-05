package controller;

import java.sql.SQLException;
import java.util.Scanner;

import dao.BikeDao;
import dto.Bike;

public class DeleteBike {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
     Scanner scanner = new  Scanner(System.in);
     System.out.println("Enter the bike id");
     int bikeId= scanner.nextInt();
     
     Bike bike = new Bike();
     bike.setBikeId(bikeId);
     
     BikeDao bikeDao = new BikeDao();
     bikeDao.deleteBike(bike);
   
	}

}
