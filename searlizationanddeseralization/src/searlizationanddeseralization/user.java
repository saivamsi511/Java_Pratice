package searlizationanddeseralization;

import java.io.Serializable;

public class user implements Serializable{
	
	//it is used to access when the class is deleted by mistake we can access by using this 
	// serial uid
	public static final long serialUid = 999999l;
	int id;
	String name;
	transient String address; // this will not particiapte in seralization
	
	public user(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
}
