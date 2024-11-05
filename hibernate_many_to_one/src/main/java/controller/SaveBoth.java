package controller;

import dao.PassengerDao;
import dto.Bus;
import dto.Passenger;

public class SaveBoth {
	public static void main(String[] args) {
		
		Bus bus= new Bus();
		bus.setBusName("Volvo");
		bus.setBusColour("Red");
		bus.setBusDestiantion("Goa");
		bus.setBusType("Ac");
		
		Passenger passenger1= new Passenger();
		passenger1.setPassengerName("Rahul");
		passenger1.setPassengerAdd("hyd");
		passenger1.setPassengerGender("male");
		passenger1.setPassengerAge(23);
		passenger1.setPassengerPhone(980970765L);
		passenger1.setBus(bus);
		
		Passenger passenger2= new Passenger();
		passenger2.setPassengerName("Rahul");
		passenger2.setPassengerAdd("hyd");
		passenger2.setPassengerGender("male");
		passenger2.setPassengerAge(23);
		passenger2.setPassengerPhone(980970765L);
		passenger2.setBus(bus);
		
		Passenger passenger3= new Passenger();
		passenger3.setPassengerName("Rahul");
		passenger3.setPassengerAdd("hyd");
		passenger3.setPassengerGender("male");
		passenger3.setPassengerAge(23);
		passenger3.setPassengerPhone(980970765L);
		passenger3.setBus(bus);
		
		PassengerDao passengerDao= new PassengerDao();
		passengerDao.saveBoth(passenger1);
		passengerDao.saveBoth(passenger2);
		passengerDao.saveBoth(passenger3);
		
				
	}

}
