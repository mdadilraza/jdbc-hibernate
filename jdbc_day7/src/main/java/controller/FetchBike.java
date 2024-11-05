package controller;

import java.sql.SQLException;

import dao.BikeDao;

public class FetchBike {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
     BikeDao bikeDao = new BikeDao();
     bikeDao.fetchBike();
	}

}
