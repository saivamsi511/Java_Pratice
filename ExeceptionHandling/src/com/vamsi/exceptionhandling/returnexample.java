package com.vamsi.exceptionhandling;

import java.util.concurrent.locks.Lock;

public class returnexample {
public static void main(String[] args) {
	example();
}
public static void example() {
	try {
		int a = 10;
		int b  = 0;
		System.out.println(a / b);
		int[] arr = new int[1];
		arr[10] = 10;
		System.out.println("hello");
	}
	catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
		e.printStackTrace();
		System.out.println("good bro i am catch");
	}
	catch(Exception ee) {
		System.out.println("he");
	}
	finally {
		System.out.println("hello bro");;
	}
}
}

