package searlizationanddeseralization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class userserlization {
	public static void main(String[] args) {
		try { 
		externalizable u = new externalizable("Tirupati", "vamsi", 10);
		System.out.println(u.username + " " + u.password + " " + u.age);
		
		String path = "c:\\files\\serilazation.txt";
		FileOutputStream fos = new FileOutputStream(path);
		ObjectOutputStream ob = new ObjectOutputStream(fos);
		ob.writeObject(u);
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
