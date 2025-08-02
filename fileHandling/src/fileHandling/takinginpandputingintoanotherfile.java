package fileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class takinginpandputingintoanotherfile {
public static void main(String[] args) {
	try {
	int x;
	String path1 = "C:\\files\\input.txt";
	String path2 = "C:\\files\\output.txt";
	
	FileInputStream fis = new FileInputStream(path1);
	FileOutputStream fos = new FileOutputStream(path2);
	
	while((x=fis.read()) != -1) {
		fos.write(x);
	}
	}
	
	catch(Exception e) {
		e.printStackTrace();
	}
}
}
