package exam;

import java.util.*;

public class Main {
public static void main(String[] args) {
	SortedSet<String> set = new TreeSet<>((a, b) -> a.length() - b.length());
	set.add("one");
	set.add("two");
	set.add("three");
	set.add("fourr");
	System.out.println(set);
	}
}

