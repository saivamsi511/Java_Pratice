package fileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class takinginputfromscaanner {
	public static void main(String[] args) {
		try {
		File f = new File("C:\\files\\input.txt");
		Scanner sc =new Scanner(f);
		String s = "C:\\files\\output.txt";
		
		FileReader fr = new FileReader(f);
		
		FileWriter fw = new FileWriter(s);
		
		while(sc.hasNext()) {
			String data = sc.nextLine();
			fw.write(data);
			fw.write("\n");
		}
		fw.flush();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
