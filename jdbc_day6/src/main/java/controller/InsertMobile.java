package controller;

import java.sql.SQLException;
import java.util.Scanner;

import dao.MobileDao;
import dto.Mobile;

public class InsertMobile {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
       
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enetr the mobile id ");
		int id= scanner.nextInt();
		
		System.out.println("Enter the Mobile Brand");
		String brand=scanner.next();
		
		System.out.println("Enter the Mobile Price");
		double price=scanner.nextDouble();
		
		System.out.println("Enter the Mobile Ram");
		int  ram=scanner.nextInt();
		
		
		System.out.println("Enter the Mobile color");
		String color =scanner.next();
		
		System.out.println("Enter the Mobile Storage");
		int storage=scanner.nextInt();
		
		Mobile  mobile = new Mobile(id,brand,price,ram,color,storage);
		
		MobileDao mobileDao= new MobileDao();
		mobileDao.insertMobile(mobile);
		
		
		System.out.println(mobile.getMobileBrand());
		System.out.println(mobile.getMobileColor());
		
		
	}

}
