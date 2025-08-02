package fileHandling;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class datastreams {
	public static void main(String[] args) {
		String path = "c:\\files\\input.txt";
		try {
			FileInputStream fs = new FileInputStream(path);
			FileOutputStream fss = new FileOutputStream(path);
			DataInputStream ds = new DataInputStream(fs);
			DataOutputStream os = new DataOutputStream(fss);
			System.out.println(ds.read());
			System.out.println(ds.readAllBytes());
			fss.write(10);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
