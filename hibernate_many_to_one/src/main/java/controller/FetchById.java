package controller;

import dao.PassengerDao;

public class FetchById {

	public static void main(String[] args) {
		PassengerDao passengerDao= new PassengerDao();
		passengerDao.fetchById(2);

	}

}
