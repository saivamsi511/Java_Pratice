package world;

class Bird {  // multi level inheritence;
	String name;
	
	void fly() {
		System.out.println(name + " is flying in air");
	}
}

class Eagle extends Bird {
	
	void eat() {
		System.out.println("Bird is eating");
	}
}

class Goldeneagle extends Eagle {
	
}

public class BirdApp {
	public static void main(String[] args) {
		Goldeneagle na = new Goldeneagle();
		na .name = "Peacock";
		na.eat();
		na.fly();
	}
}
