package exam;

public class consectiveletters {
public static void main(String[] args) {
	String s = "abcabcaaaaaabbb";
	int count = 0;
	int maxi = 0;
	for(int i=0;i<s.length()-1;i++) {
		char s1 = s.charAt(i);
		char s2 = s.charAt(i+1);
		if(s1 == s2) {
			count++;
			maxi = Math.max(maxi, count);
		}
		else {
			count = 0;
		}
	}
	System.out.println(maxi+1);
}
}
