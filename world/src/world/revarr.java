package world;

public class revarr {
	public static void main(String[] args) {
		String s = "Java is fun";
		char[] a = s.toCharArray();
		char[] b =new char [a.length];
		
		for(int i = 0;i<a.length;i++) {
			if (a[i] == ' ') {
				b[i] = ' ';
			}
		}
		
		int b1 = 0;
		for(int i = a.length-1;i>=0;i--) {
			if (a[i] == ' ') {
				continue;
			}
			if (b[b1] == ' ') {
				b1++;
			}
			b[b1] = a[i];
			b1++;
		}
		System.out.println(b);
	}
}
