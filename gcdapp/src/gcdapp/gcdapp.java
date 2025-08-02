package gcdapp;
public class gcdapp{
	public static int gcd(int m,int n) {
		while(n!=0) 
		{
			int rem = m % n;
			m = n;
			n = rem;
		}
		return m;
	}
}
