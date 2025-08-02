package world;
import java.util.Scanner;
public class charcount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = "banana";
		String ans = "";
		
		for(int i =0;i<s.length();i++) {
			char ch = s.charAt(i);
			if (!ans.contains(ch+"")) {
				ans =ans + ch;
			}
		}
		System.out.println(ans);
	}
}
