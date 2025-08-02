package takinginput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class inputs {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        
        // Read the number of elements
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        // Read elements into the array
        for (int i = 0; i < n; i++) {
            try {
               arr[i] = sc.nextInt();
            } 
            catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter interger only.");
            }
            catch(Exception e) {
                System.out.println("An unexpected error occurred.");
            }
        }
        
        System.out.println("Numbers entered successfully.");
        
        sc.close();
	}
}
