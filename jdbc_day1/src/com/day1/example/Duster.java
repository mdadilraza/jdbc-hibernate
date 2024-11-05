package com.day1.example;



public class Duster {
   int id;
   String brand;
   String color;
   int  price;
   int gst;
public Duster(int id, String brand, String color, int price, int gst) {
	super();
	this.id = id;
	this.brand = brand;
	this.color = color;
	this.price = price;
	this.gst = gst;
}
@Override
public String toString() {
	return "Duster [id=" + id + ", brand=" + brand + ", color=" + color + ", price=" + price + ", gst=" + gst + "]";
}
   
   
   
	
		

}
