package gcdapp;
import java.util.Scanner;
public class gcd{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans = gcdapp.gcd(a,b);
		System.out.println("Gcd is:-" +ans);
	}
}
//	public static int gcdapp1(int m,int n) {
//		while(n!=0) 
//		{
//			int rem = m % n;
//			m = n;
//			n = rem;
//		}
//		return m;
//	}
//}