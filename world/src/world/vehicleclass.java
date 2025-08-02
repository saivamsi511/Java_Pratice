package world;

class Vehicle {
	int id;
	String model;
	String brand;
	String color;
	int price;
	
	public Vehicle(int id) {
		this.id = id;
	}
	
	public Vehicle(String model, String brand) {
		this.model = model;
		this.brand = brand;
	}
	
	public Vehicle(String color, int price) {
		this.color = color;
		this.price = price;
	}
	
	public Vehicle(int price,String brand) {
		this.brand = brand;
		this.price = price;
	}

	public Vehicle(String model, String brand, String color, int price) {
		this.model = model;
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
}
public class vehicleclass {
	public static void main(String[]  args) {
		
	}
}