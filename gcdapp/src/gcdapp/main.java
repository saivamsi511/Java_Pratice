package gcdapp;
import java.util.Scanner;
public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.println("Hello World");
		int a = 1;
		char input;
		do{
			System.out.println("Number is:"+a);
			System.out.println("Continue?");
			input = sc.next().charAt(0);
			a++;
		}while(input == 'y');
		System.out.println("Tata bye");
	}
}
