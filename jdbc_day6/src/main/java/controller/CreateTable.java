package controller;

import java.sql.SQLException;

import dao.MobileDao;

public class CreateTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
    MobileDao mobileDao = new MobileDao();
    mobileDao.createTable();
	}

}
