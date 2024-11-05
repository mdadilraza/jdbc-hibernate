package controller;

import dao.PassengerDao;

public class DeletePerson {

	public static void main(String[] args) {
		 PassengerDao passengerDao= new PassengerDao();
		 passengerDao.deletePassenger(10);
	}

}
