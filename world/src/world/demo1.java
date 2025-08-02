package world;

class demo {
	int a;
	String b;
	public demo() {
		this(11);
	}
	public demo(int a) {
		this(10,"mithun");
		this.a = a;
	}
	public demo(int a, String b) {
		this("lokesh");
		this.a = a;
		this.b = b;
	}
	public demo(String b) {
		super();
		this.b = b;
	}

class Demo2 extends demo {
	String c;
	String d;
	public Demo2() {
		this("vamsi");
	}
	public Demo2(String c) {
		this("mahi","virat");
		this.c = c;
	}
	public Demo2(String c, String d) {
		super("sai");
		this.c = c;
		this.d = d;
	}
	
}
}
public class demo1 {
	public 
}
