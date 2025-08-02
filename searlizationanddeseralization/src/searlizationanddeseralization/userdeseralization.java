package searlizationanddeseralization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class userdeseralization {
	public static void main(String[] args) {
		try {
		
		 ObjectInputStream ois = new ObjectInputStream(new FileInputStream("c:\\files\\serilazation.txt"));
		 externalizable deserializedUser = (externalizable) ois.readObject();
	        ois.close();

	        System.out.println(deserializedUser); // password will be null
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
