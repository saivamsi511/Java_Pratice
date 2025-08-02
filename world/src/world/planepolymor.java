package world;

class plane {
	void takeoff() {
		System.out.println("plane is takingoff");		
	}
	void fly() {
		System.out.println("plane is flying");		
	}
	void land() {
		System.out.println("plane is landing");		
	}
}
class CargoPlane extends plane {
	void takeoff() {
		System.out.println("Cargo plane is takingoff");		
	}
	void fly() {
		System.out.println("Cargo plane is flying in low speed");		
	}
	void land() {
		System.out.println("cargoplane is landing on huge runway");		
	}
}
class PassengerPlane extends plane {
	void takeoff() {
		System.out.println("Passenger plane is takingoff");		
	}
	void fly() {
		System.out.println("passenger plane is flying in medium speed");		
	}
	void land() {
		System.out.println("Passenger plane is landing on small runway");		
	}
}
public class planepolymor {
	public static void main(String[] args) {
		plane p1 = new plane();
		airport(p1);
		CargoPlane p2 = new CargoPlane();
		airport(p2);
		PassengerPlane p3 = new PassengerPlane();
		airport(p3);
	}
	
	public static void airport(plane p1) {
		p1.takeoff();
		p1.fly();
		p1.land();
	}
}
