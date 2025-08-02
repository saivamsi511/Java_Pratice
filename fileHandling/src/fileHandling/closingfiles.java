package fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class closingfiles {
	public static void main(String[] args) {
		FileReader fr =  null;
		FileWriter fw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			
		int x;
		String path1 = "C:\\files\\input.txt";
		String path2 = "C:\\files\\output.txt";
		
		fr = new FileReader(path1);
		fw = new FileWriter(path2);
		
		br = new BufferedReader(fr);
		bw = new BufferedWriter(fw);
		
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
		finally {
			try {
				fr.close();
				fw.close();
				br.close();
				bw.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
