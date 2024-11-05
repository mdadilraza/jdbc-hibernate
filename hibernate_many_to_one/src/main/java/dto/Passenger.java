package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Passenger {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int passengerId;
	private String passengerName;
	private int passengerAge;
	private String passengerGender;
	
	private String passengerAdd;
	private long passengerPhone;
	@ManyToOne
	private Bus bus;
	public int getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public int getPassengerAge() {
		return passengerAge;
	}
	public void setPassengerAge(int passengerAge) {
		this.passengerAge = passengerAge;
	}
	public String getPassengerGender() {
		return passengerGender;
	}
	public void setPassengerGender(String passengerGender) {
		this.passengerGender = passengerGender;
	}
	public String getPassengerAdd() {
		return passengerAdd;
	}
	public void setPassengerAdd(String passengerAdd) {
		this.passengerAdd = passengerAdd;
	}
	public long getPassengerPhone() {
		return passengerPhone;
	}
	public void setPassengerPhone(long passengerPhone) {
		this.passengerPhone = passengerPhone;
	}
	public Bus getBus() {
		return bus;
	}
	public void setBus(Bus bus) {
		this.bus = bus;
	}
	@Override
	public String toString() {
		return "Passenger [passengerId=" + passengerId + ", passengerName=" + passengerName + ", passengerAge="
				+ passengerAge + ", passengerGender=" + passengerGender + ", passengerAdd=" + passengerAdd
				+ ", passengerPhone=" + passengerPhone + "]";
	}
	
	
	

}
