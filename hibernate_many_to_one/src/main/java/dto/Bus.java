package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bus {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int busId;
	private String busName;
	private String busDestiantion;
	private String busColour;
	private String busType;
	public int getBusId() {
		return busId;
	}
	public void setBusId(int busId) {
		this.busId = busId;
	}
	public String getBusName() {
		return busName;
	}
	public void setBusName(String busName) {
		this.busName = busName;
	}
	public String getBusDestiantion() {
		return busDestiantion;
	}
	public void setBusDestiantion(String busDestiantion) {
		this.busDestiantion = busDestiantion;
	}
	public String getBusColour() {
		return busColour;
	}
	public void setBusColour(String busColour) {
		this.busColour = busColour;
	}
	public String getBusType() {
		return busType;
	}
	public void setBusType(String busType) {
		this.busType = busType;
	}
	@Override
	public String toString() {
		return "Bus [busId=" + busId + ", busName=" + busName + ", busDestiantion=" + busDestiantion + ", busColour="
				+ busColour + ", busType=" + busType + "]";
	}
	
	

}
