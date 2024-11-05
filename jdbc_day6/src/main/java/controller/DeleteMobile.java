package controller;

import java.sql.SQLException;
import java.util.Scanner;

import dao.MobileDao;
import dto.Mobile;

public class DeleteMobile {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the MobileId");
    int id= scanner.nextInt();
    
    Mobile mobile = new Mobile();
    mobile.setMobileId(id);
    MobileDao mobileDao = new MobileDao();
    mobileDao.deleteMobile(mobile);
    	
	}

}
