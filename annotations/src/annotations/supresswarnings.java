package annotations;

import java.util.ArrayList;

public class supresswarnings {
	@SuppressWarnings("unchecked")
public static void main(String[] args) {
	
	ArrayList al = new ArrayList();
	al.add(10);
	al.add(20);
	System.out.println(al);
}
}
