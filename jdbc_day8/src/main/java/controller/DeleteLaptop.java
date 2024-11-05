package controller;

import java.sql.SQLException;
import java.util.Scanner;

import dao.LaptopDao;
import dto.Laptop;

public class DeleteLaptop {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the laptopId");
    int id= scanner.nextInt();
    
    Laptop laptop = new Laptop();
    laptop.setLaptopId(id);
    LaptopDao laptopDao = new LaptopDao();
    laptopDao.deleteLaptop(laptop);
	}

}
