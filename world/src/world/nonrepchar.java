package world;

import java.util.*;
public class nonrepchar {
public static void main(String[] args) {
	String s = "welwcometomypage";
	HashMap<Character, Integer>  h = new HashMap<>();
	
	int n = s.length();
	for(int i=0;i<n;i++) {
		char ch = s.charAt(i);
		h.put(ch,h.getOrDefault(ch,0) + 1);
	}
//	int count = 0;
	for(int c: h.values()) {
//		if(c == 1) {
		System.out.print(c + " ");
//		count++;
//		}
//		else {
//			count++;
//		}
	}

}
}
