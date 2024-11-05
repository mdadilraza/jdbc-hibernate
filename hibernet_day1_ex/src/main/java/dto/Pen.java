package dto;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity //schema create 
public class Pen {
	@Id//primary key 
	private int penId;
	private String penBrand;
	private String penColour;
	private double penPrice;
	public int getPenId() {
		return penId;
	}
	public void setPenId(int penId) {
		this.penId = penId;
	}
	public String getPenBrand() {
		return penBrand;
	}
	public void setPenBrand(String penBrand) {
		this.penBrand = penBrand;
	}
	public String getPenColour() {
		return penColour;
	}
	public void setPenColour(String penColour) {
		this.penColour = penColour;
	}
	public double getPenPrice() {
		return penPrice;
	}
	public void setPenPrice(double penPrice) {
		this.penPrice = penPrice;
	}
	@Override
	public String toString() {
		return "Pen [penId=" + penId + ", penBrand=" + penBrand + ", penColour=" + penColour + ", penPrice=" + penPrice
				+ "]";
	}
	

}
