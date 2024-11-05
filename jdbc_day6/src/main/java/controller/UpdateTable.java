package controller;

import java.sql.SQLException;
import java.util.Scanner;

import dao.MobileDao;
import dto.Mobile;

public class UpdateTable {
 
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the mobile id ");
		int id= scanner.nextInt();
		
		System.out.println("Enter the mobile brand");
		String brand= scanner.next();
		
		System.out.println("Enter the mobile price ");
		double price = scanner.nextDouble();
		
		Mobile mobile = new Mobile();
		
		mobile.setMobileId(id);
		mobile.setMobileBrand(brand);
		mobile.setMobilePrice(price);
		
		MobileDao mobileDao = new MobileDao();
		mobileDao.updateTable(mobile);
	}
   
}
