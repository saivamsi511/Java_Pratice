package world;

interface adder {
	public void add(int a, int b);
}

public class lambda {
	public static void main(String[] args) {
		adder ad = (a,b) -> System.out.println(a + b );
		ad.add(10, 20);
	}
}
