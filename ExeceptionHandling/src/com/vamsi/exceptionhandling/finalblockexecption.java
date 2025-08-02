package com.vamsi.exceptionhandling;

public class finalblockexecption {
 public static void main(String args[]) {
     try {
        int a = 10;
        int b = 0;
        System.out.println(a / b);
     }
     catch (Exception ex) {
         customexception.getmessage();
     }
 }
}
class customexception extends Throwable {
	
	public static void getmessage() {
		System.out.println("error here in custom.....");
	}
	
	public void printStackTrace() {
		System.out.println("error name , error enduku vachindi, error ekkada vachindi");
	}
	
}