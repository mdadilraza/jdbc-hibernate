package controller;

import dao.PassengerDao;
import dto.Bus;
import dto.Passenger;

public class UpdateBoth {

	public static void main(String[] args) {
		Passenger passenger= new Passenger();
		passenger.setPassengerAdd("Nepal");
		passenger.setPassengerAge(25);
		passenger.setPassengerName("Tabish");
		passenger.setPassengerGender("male");
		passenger.setPassengerPhone(9728288722L);
		passenger.setPassengerId(1);
		
		
		Passenger passenger2= new Passenger();
		passenger2.setPassengerAge(25);
		passenger2.setPassengerName("Farhan");
		passenger2.setPassengerGender("male");
		passenger2.setPassengerAdd("Indore");
		passenger2.setPassengerPhone(9728288722L);
		passenger2.setPassengerId(2);
		
		Passenger passenger3= new Passenger();
		passenger3.setPassengerAdd("UP");
		passenger3.setPassengerAge(25);
		passenger3.setPassengerName("Kashif ");
		passenger3.setPassengerGender("male");
		passenger3.setPassengerPhone(9728288722L);
		passenger3.setPassengerId(3);
		
		
		
		Bus bus= new Bus();
		bus.setBusColour("Black");
		bus.setBusDestiantion("Delhi");
		bus.setBusName("Rajdhani express");
		bus.setBusType("Ac");
		bus.setBusId(1);
		passenger.setBus(bus);
		passenger2.setBus(bus);
		passenger3.setBus(bus);
		
		PassengerDao passengerDao= new PassengerDao();
		passengerDao.updateBoth(1, passenger);
		passengerDao.updateBoth(2, passenger2);
	    passengerDao.updateBoth(3, passenger3);

	}

}
