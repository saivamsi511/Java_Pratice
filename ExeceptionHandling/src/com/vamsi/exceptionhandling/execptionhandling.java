package com.vamsi.exceptionhandling;

import java.util.Scanner;

public class execptionhandling {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	try {
	System.out.println("Enter the 2 numbers to divide: ");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = a / b; //execption occurs when we divide with 0
	System.out.println("The answer is: " + c);
	}
	catch(ArithmeticException e) {
		System.out.println("Division with 0 is not possible....");
	}
	
//	try {
//	int[] arr = new int[2];
//	arr[0] = 1;
//	arr[1] = 2;
//	System.out.println("The value is: " + arr[3]);
//	}
//	catch(Exception e) {
//		System.out.println("Error occured...........");
//	}
	
//	try {
//	String s = null;
//	System.out.println(s.length());
//	}
//	catch(Exception e) {
//		System.out.println("Error occured...........");
//	}
	
//	try {
//		String val = "abc";
//		System.out.println(Integer.parseInt(val));
//	}
//	catch(Exception e) {
//		System.out.println("Error occured...........");
//	}
}
}
