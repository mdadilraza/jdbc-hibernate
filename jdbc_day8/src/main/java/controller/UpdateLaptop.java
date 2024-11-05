package controller;

import java.sql.SQLException;
import java.util.Scanner;

import dao.LaptopDao;
import dto.Laptop;

public class UpdateLaptop {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the laptopName");
		String name = scanner.next();
		System.out.println("Enter the laptop price");
		double price = scanner.nextDouble();
		System.out.println("Enter the laptop id ");
		int id = scanner.nextInt();
		Laptop laptop = new Laptop();
		laptop.setLaptopName(name);
		laptop.setLaptopPrice(price);
		laptop.setLaptopId(id);
		LaptopDao laptopDao= new LaptopDao();
		laptopDao.updateTable(laptop);

	}
}
