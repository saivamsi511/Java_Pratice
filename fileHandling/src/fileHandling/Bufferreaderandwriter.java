package fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Bufferreaderandwriter {
	public static void main(String[] args) {
		try {
			
		int x;
		String path1 = "C:\\files\\input.txt";
		String path2 = "C:\\files\\output.txt";
		
		FileReader fr = new FileReader(path1);
		FileWriter fw = new FileWriter(path2);
		
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);
		
		String s = br.readLine();
		String[] arr = s.split(" ");
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		int res = a + b;
		bw.write("Sum is : " + res);
		bw.flush();
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
