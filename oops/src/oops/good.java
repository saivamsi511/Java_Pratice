package oops;
public class good {
	public static void  main(String[] args) {
		Fan f1 = new Fan();
		
		f1.color = "Red";
		f1.cost = 2400;
		f1.brand = "crompton";
		System.out.println(f1.color);
		f1.blow();
		f1.rotate();
	}
}
