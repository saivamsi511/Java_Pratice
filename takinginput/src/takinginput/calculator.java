package takinginput;
import java.util.Scanner;
public class calculator {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	for(;;) {
		System.out.println("PRESS-1 FOR ADDITION");
		System.out.println("PRESS-2 FOR SUBTRACTION");
		System.out.println("PRESS-3 FOR MULTIPLICATION");
		System.out.println("PRESS-4 FOR DIVISION");
		System.out.println("PRESS-5 FOR REMAINDER");
		System.out.println("PRESS-6 FOR AVERAGE");
		System.out.println("PRESS ANY OTHER TO EXIT OF LOOP");
		
		int choice = sc.nextInt();
		switch(choice) {
		case 1 -> {
			System.out.println("Enter 2 numbers");
			System.out.println("Addition result is:" +calculator.add(sc.nextInt(),sc.nextInt()));
		}
		case 2 -> {
			System.out.println("Enter 2 numbers");
			System.out.println("Subtraction result is:" +calculator.sub(sc.nextInt(),sc.nextInt()));
		}
		case 3 -> {
			System.out.println("Enter 2 numbers");
			System.out.println("Multiplication result is:" +calculator.mul(sc.nextInt(),sc.nextInt()));
		}
		case 4 -> {
			System.out.println("Enter 2 numbers");
			System.out.println("Division result is:" +calculator.div(sc.nextInt(),sc.nextInt()));
		}
		case 5 -> {
			System.out.println("Enter 2 numbers");
			System.out.println("Remainder result is:" +calculator.rem(sc.nextInt(),sc.nextInt()));
		}
		case 6 -> {
			System.out.println("Enter 2 numbers");
			System.out.println("Average result is:" +calculator.avg(sc.nextInt(),sc.nextInt()));
		}
		default -> {
			System.out.println("Tata byeb bye...");
			sc.close();
			return;
		}
		}
	}
}
	public static int add(int a,int b) {
		return a + b;
	}
	public static int sub(int a,int b) {
		return a - b;
	}
	public static int  mul(int a,int b) {
		return a * b;
	}
	public static int div(int a,int b) {
		return a / b;
	}
	public static int rem(int a,int b) {
		return a % b;
	}
	public static int  avg(int a,int b) {
		return (a + b)/2;
	}
}
