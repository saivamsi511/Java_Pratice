package com.vamsi.exceptionhandling;

public class practice {
public static void main(String[] args) throws Exception{
	add();
}
public static void add() throws Exception{
	try {
	int a = 10;
	char c = 9;
	int ans = a / c;
	System.out.println(ans);
	}
	catch(Exception e) {
		System.out.println("exception handled");
		throw e;
	}
	finally {
		System.out.println("finally block executed");
	}
}
}
