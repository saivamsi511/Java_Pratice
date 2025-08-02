package annotations;

public class customannotation {
	public static void main(String[] args) {
		Bird b = new Bird("vamsi");
		b.fly();
	}
}

@Information(inform="This is POJO class")
class Bird {
	String name;
	
	@Information(inform="This is a constructor for bird class")
	Bird(String name) {
		this.name = name;
	}
	
	@Information(inform="This is a method of the Bird class")
	void fly() {
		System.out.println(name + " Bird is flying in the air");
	}
	
}