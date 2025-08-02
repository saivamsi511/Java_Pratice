package fileHandling;

import java.io.FileReader;
import java.io.FileWriter;

public class filereaderandwirter {
	public static void main(String[] args) {
		try {
			
		int x;
		String path1 = "C:\\files\\input.txt";
		String path2 = "C:\\files\\output.txt";
		
		FileReader fr = new FileReader(path1);
		FileWriter fw = new FileWriter(path2);
		
		
		while((x=fr.read()) != -1) {
			fw.write(x);
		}
		fw.flush();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
