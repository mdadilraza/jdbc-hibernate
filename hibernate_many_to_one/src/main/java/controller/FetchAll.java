package controller;

import dao.PassengerDao;

public class FetchAll {

	public static void main(String[] args) {
		PassengerDao passengerDao= new PassengerDao();
		passengerDao.fetchAll();

	}

}
