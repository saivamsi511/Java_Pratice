package world;

public class birdabstract {
	public static void permit(Bird ref) {
		ref.eat();
		ref.fly();
		ref.sleep();
	}
	
	public static void main(String[] args) {
		birdabstract.permit(new MountainEagle());
		birdabstract.permit(new SerpantEagle());
		birdabstract.permit(new vegSparraow());
		birdabstract.permit(new NonvegSparraow());
	}
}

abstract class Bird {
    public abstract void eat();
    public abstract void fly();
    public abstract void sleep();
}

abstract class Eagle extends Bird {
    public void fly() {
        System.out.println("Fly in large heights");
    }

    public void sleep() {
        System.out.println("Sleep on the mountains");
    }
}

final class MountainEagle extends Eagle {
	public void eat() {
		System.out.println("Eat the living things in big size");
	}
}

final class SerpantEagle extends Eagle {
	public void eat() {
		System.out.println("Eat the small things in medium size");
	}
}

abstract class Sparrow extends Bird{
	public void fly() {
		System.out.println("Sparrow in low hights");
	}
	public void sleep() {
		System.out.println("Sleep on the nests");
	}
}

final class vegSparraow extends Sparrow {
	public void eat() {
		System.out.println("VegSparrow eat only leafs");
	}
}

final class NonvegSparraow extends Sparrow {
	public void eat() {
		System.out.println("NonSparrow eat only insects");
	}
}

