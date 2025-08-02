package com.vamsi.exceptionhandling;

public class thowexample {
public static void main(String[] args) {
	System.out.println("Connection to main established.");
	bank b = new bank();
	b.methodcall();
	System.out.println("Connection to main Terminated.");
}
}
class bank {
	
	void methodcall() {
		System.out.println("Connection to bank established.");
		atm a = new atm();
		try {
		a.getinput();
		}
		catch(Exception e) {
			System.out.println("Problem reached to bank we will work on it please wait........");
		}
		System.out.println("Connection to bank Terminated.");
	}
}

class atm {
	void getinput() throws Exception{
		String s = null;
		System.out.println("Connection to atm established.");
		try {
		System.out.println(s.length());
		}
		catch(Exception e) {
			System.out.println("Issue occured in the atm please check bank i am transferring to you...");
			throw e; //after finallly no satements will be excetuded so we use finally block to excetute the statements.
		}
		finally {
		System.out.println("Connection to atm Terminated.");
		}
	}
}