package controller;

import java.util.ArrayList;
import java.util.List;

import dao.PassengerDao;
import dto.Bus;
import dto.Passenger;

public class AddNewPassengerToBus {

	public static void main(String[] args) {
		Passenger passenger= new Passenger();
		passenger.setPassengerName("Arfin");
		passenger.setPassengerGender("male");
		passenger.setPassengerPhone(7882726627L);
		passenger.setPassengerAge(23);
		passenger.setPassengerAdd("Hyd");
		
		Passenger passenger2= new Passenger();
		passenger2.setPassengerName("Lalit");
		passenger2.setPassengerGender("male");
		passenger2.setPassengerPhone(7882726627L);
		passenger2.setPassengerAge(24);
		passenger2.setPassengerAdd("Hyd");
		
		
		
		
		
		
		PassengerDao passengerDao= new PassengerDao();
		passengerDao.addNewPassnegerToExistingBus(2,passenger );
		
		

	}

}
