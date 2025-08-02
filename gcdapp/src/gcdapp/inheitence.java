package gcdapp;
// single level inheritence
class demo {
	static int a = 10;
	
	void display() {
		System.out.println(a);
	}

}
class demo1 extends demo {
	static int b = 20;
	
	public static void display1() {
		System.out.println(a);
		System.out.println(b);
	}
}
public class inheitence {
	public static void main(String[] args) {
		demo in = new demo();
		in.display();
		demo1.display1();
	}
}