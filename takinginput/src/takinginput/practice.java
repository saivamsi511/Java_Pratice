package takinginput;
import java.util.*;
import java.util.ArrayList;
public class practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		byte b = sc.nextByte();
//		short c = sc.nextShort();
//		long d = sc.nextLong();
//		float e = sc.nextFloat();
//		char s = sc.next().charAt(0);
//		String m = sc.next();
//		int a  = 10;
//		int b = 10;
//		System.out.println(++a);
//		System.out.println(++b);
//		System.out.println(--a);
//		System.out.println(--b);
//		a++;
//		b++;
//		System.out.println(a++);
//		System.out.println(b++);
//		System.out.println(a--);
//		System.out.println(b--);
		
//		byte a = 1;
//		int b = 4;
//		char c = 'a' ;// 2
//		short e = 2;
//		float d = 4f;
//		long f = 8l;
//		double i = 8;
//		boolean ki = true;
		
		//implict casting widening
//		int a  = 10;
//		double b = a;
//		System.out.println(b);
		//explicit type casting narrowing
//		float i = 123f;
//		int d = (int) i;
//		System.out.println(d);
		
		//conditional contructs
//		int a  = 10;
//		if(a > 10) {
//			System.out.println("great");
//		}else if (a < 10){
//			System.out.println("smaller");
//		}else {
//			System.out.println("equal");
//		}
//		
//		// looping constructs
//		for(int i = 0;i<10;i++) {
//			System.out.print(i + " ");
//		}
//		
//		int i = 0;
//		while (i < 10) {
//			System.out.print(i + " ");
//			i++;
//		}
//		
//		int k = 0;
//		do {
//			System.out.print("hello");
//			k++;
//		}while (k < 10);
		
		// break continue return 
		
//		for(int i = 0;i<10;i++) {
//			if (i == 5) {
//				System.out.print(i + " ");
//				break;
//			}
//		}
//		
//		for(int i = 0;i<10;i++) {
//			if (i == 5) {
//				System.out.print(i + " ");
//				continue;
//			}
//		}
		
//		greet();
//		int ans = greet2(10, 11);
//		System.out.println(ans);
//		greet3(1);
//		
//		practice practice = new practice();
//		practice.greet1();
		
//		Student s = new Student();
//		s.name = "vamsi";
//		s.id = 123;
//		s.roll ="1233";
//		System.out.println(s.name+ " " + s.id + " " + s.roll);
//	}
//		public static void greet() {  //method without parameters and method without return 
//			System.out.println("hello");
//	}
//		public void greet1() {
//			System.out.println("hello1");
//	}
//		public  static int greet2(int a,int b) { //method with parameters and method with return
//			return a + b;
//	}
//		public static void greet3(int a) { //method with parameters and method without return
//			System.out.println(a);
//	}
//		public static double greet4() {  //method without parameters and method with return
//			return Math.PI;
//		}
		
//		creation of 1D array
//		int[] oned = new int[5];
//		for(int i=0;i<5;i++) {
//			oned[i] = sc.nextInt();
//		}
//		
//		for(int i:oned) {
//			System.out.print(i + " ");
//		}
		
//		Creation of 2d array
//		int[][] twod = new int[3][3];
//		for(int i=0;i<3;i++) {
//			for(int j=0;j<3;j++) {
//				twod[i][j] = sc.nextInt();
//		}
//		}
//		for(int i=0;i<3;i++) {
//			for(int j=0;j<3;j++) {
//				System.out.print(twod[i][j] + " ");
//		}
//			System.out.println();
//		}
		
//		Creating 2d jagged array
//		int[][] twojaggedd = new int[3][];
//		twojaggedd[0] = new int[3];
//		twojaggedd[1] = new int[2];
//		twojaggedd[2] = new int[1];
//		for(int i=0;i<twojaggedd.length;i++) {
//			for(int j=0;j<twojaggedd[i].length;j++) {
//				twojaggedd[i][j] = sc.nextInt();
//		}
//		}
//		for(int i=0;i<twojaggedd.length;i++) {
//			for(int j=0;j<twojaggedd[i].length;j++) {
//				System.out.print(twojaggedd[i][j] + " ");
//		}
//			System.out.println();
//		}
		
//		creation of 3d array
//		int[][][] threed = new int[3][3][3];
//		for(int i=0;i<threed.length;i++) {
//			for(int j=0;j<threed[i].length;j++) {
//				for(int k=0;k<threed[i][j].length;k++) {
//					System.out.println("Enter the value of the "+ i + j +k);
//					threed[i][j][k] = sc.nextInt();
//				}
//		}
//		}
//		for(int i=0;i<threed.length;i++) {
//			for(int j=0;j<threed[i].length;j++) {
//				for(int k=0;k<threed[i][j].length;k++) {
//				System.out.print(threed[i][j][k] + " ");
//		}
//			System.out.println();
//		}
//			System.out.println();
//		}
		
//		creating 3d jagged array
//		int[][][] threejaggedd = new int[3][3][];
//		threejaggedd[0][0] = new int[1];
//		threejaggedd[0][1] = new int[2];
//		threejaggedd[0][2] = new int[3];
//		
//		threejaggedd[1][0] = new int[1];
//		threejaggedd[1][1] = new int[2];
//		threejaggedd[1][2] = new int[3];
//		
//		threejaggedd[2][0] = new int[1];
//		threejaggedd[2][1] = new int[2];
//		threejaggedd[2][2] = new int[3];
		
//		for(int i=0;i<threejaggedd.length;i++) {
//			for(int j=0;j<threejaggedd[i].length;j++) {
//				System.out.println("Enter the size of " + i + " " + j);
//				threejaggedd[i][j] = new int[sc.nextInt()];
//			}
//		}
//		
//		for(int i=0;i<threejaggedd.length;i++) {
//			for(int j=0;j<threejaggedd[i].length;j++) {
//				for(int k=0;k<threejaggedd[i][j].length;k++) {
//					System.out.println("Enter the value of the "+ i + j +k);
//					threejaggedd[i][j][k] = sc.nextInt();
//				}
//		}
//		}
//		for(int i=0;i<threejaggedd.length;i++) {
//			for(int j=0;j<threejaggedd[i].length;j++) {
//				for(int k=0;k<threejaggedd[i][j].length;k++) {
//				System.out.print(threejaggedd[i][j][k] + " ");
//		}
//			System.out.println();
//		}
//			System.out.println();
//		}
		
		
//		unmutable strings
//		String s1 = "kod";  //constant pool
//		String s2 = "nest";  //constant pool
//		String s15 = s1;	//constant pool
//		String s3 = "kod" + "nest"; 	//constant pool
//		String s4 = "kod" + "nest";		//constant pool
//		String s5 = s1 + s2;			//non constant pool
//		String s6 = s1 + s2;			//non constant pool
//		String s7 = new String(s1);		//non constant pool
//		String s8 = new String(s1);		//non constant pool
//		String s9 =  "kod" + s1;		//non constant pool
//		String s10 = "kod" + s1;		//non constant pool
//		String s11 = s1.concat(s2);		//non constant pool
//		String s12 = s1.concat(s2);		//non constant pool
//		String s13 = "hello".concat("vamsi");	//non constant pool
//		String s14 = "hello".concat("vamsi");	//non constant pool
//		
//
//		if(s3 == s4) {
//			System.out.println("References are equal");
//		}
//		else {
//			System.out.println("References are unequal");
//		}
//		
//		if(s3.equals(s4)) {
//			System.out.println("values are equal");
//		}
//		else {
//			System.out.println("values are unequal");
//		}
//		
//		int s = s1.compareTo("kod");
//		if(s > 0) {
//			System.out.println("left string is greather");
//		}
//		else if (s < 0) {
//			System.out.println("right string is greather");
//		}
//		else {
//			System.out.println("both are equal");
//		}
//		
//		if(s5 == s6) {
//			System.out.println("References are equal");
//		}
//		else {
//			System.out.println("References are unequal");
//		}
//		
//		if(s5.equals(s6)) {
//			System.out.println("values are equal");
//		}
//		else {
//			System.out.println("values are unequal");
//		}
//		
//		if(s7 == s8) {
//			System.out.println("References are equal");
//		}
//		else {
//			System.out.println("References are unequal");
//		}
//		
//		if(s7.equals(s8)) {
//			System.out.println("values are equal");
//		}
//		else {
//			System.out.println("values are unequal");
//		}
//		
//		if(s9 == s10) {
//			System.out.println("References are equal");
//		}
//		else {
//			System.out.println("References are unequal");
//		}
//		
//		if(s9.equals(s10)) {
//			System.out.println("values are equal");
//		}
//		else {
//			System.out.println("values are unequal");
//		}
//		
//		if(s11 == s12) {
//			System.out.println("References are equal");
//		}
//		else {
//			System.out.println("References are unequal");
//		}
//		
//		if(s11.equals(s12)) {
//			System.out.println("values are equal");
//		}
//		else {
//			System.out.println("values are unequal");
//		}
//		
//		System.out.println("this is ");
//		if(s13 == s14) {
//			System.out.println("References are equal");
//		}
//		else {
//			System.out.println("References are unequal");
//		}
//		
//		if(s13.equals(s14)) {
//			System.out.println("values are equal");
//		}
//		else {
//			System.out.println("values are unequal");
//		}
//		if(s15 == s1) {
//			System.out.println("References are equal");
//		}
//		else {
//			System.out.println("References are unequal");
//		}
//		
//		if(s15.equals(s1)) {
//			System.out.println("values are equal");
//		}
//		else {
//			System.out.println("values are unequal");
//		}
		
//		String s1 = "vamsi";
//		String s3 = "         s            ";
//		String s2 = "sai";
//		System.out.println(s1.charAt(3));
//		System.out.println(s1.startsWith(s2));
//		System.out.println(s1.concat(s2));
//		System.out.println(s1.length());
//		System.out.println(s1.endsWith(s2));
//		System.out.println(s1.toUpperCase());
//		System.out.println(s1.toLowerCase());
//		System.out.println(s1.indexOf('s'));
//		System.out.println(s1.compareTo(s2));
//		System.out.println(s1.equals(s2));
//		System.out.println(s1.equalsIgnoreCase(s2));
//		System.out.println(s1.equalsIgnoreCase(s2));
//		System.out.println(s1.toString());
//		System.out.println(s1.contains(s2));
//		System.out.println(s1.isEmpty());
//		System.out.println(s1.replace("si","va"));
//		System.out.println(s1.split("m"));
//		System.out.println(s1.substring(1));
//		System.out.println(s1.toCharArray());
//		System.out.println(s3.trim());
		
		
//		String s = "saivamsi";
//		String s1 = "uing";
//		int n = s.compareTo(s1);
//		if(n == 0) {
//			System.out.println("Equal");
//		}
//		else if (n > 0) {
//			System.out.println("s is greater");
//		}
//		else {
//			System.out.println("s1 is greater");
//		}
		
		
//		mutable strings 
//		StringBuffer s = new StringBuffer();
//		StringBuffer s1 = new StringBuffer();
//		s.append("sai");
//		s1.append("king");
//		int m = s.compareTo(s1);
//		System.out.println(s.equals(s1));
//		System.out.println(s.reverse());
//		System.out.println(s.substring(1));
//		System.out.println(s.toString());
//		System.out.println(s.replace(1,3,"sai"));
//		System.out.println(m);
//		System.out.println(s.charAt(2));
//		System.out.println(s.length());
//		int n = s.capacity();
//		System.out.println(n);
//		System.out.println(s);
		
//		StringBuilder s = new StringBuilder();
//		StringBuilder s1 = new StringBuilder();
//		s.append("sai");
//		s1.append("king");
//		int m = s.compareTo(s1);
//		System.out.println(s.equals(s1));
//		System.out.println(s.reverse());
//		System.out.println(s.substring(1));
//		System.out.println(s.toString());
//		System.out.println(s.replace(1,3,"sai"));
//		System.out.println(m);
//		System.out.println(s.charAt(2));
//		System.out.println(s.length());
//		int n = s.capacity();
//		System.out.println(n);
//		System.out.println(s);
		
//		addition ad = new addition();
//		//		method overloading - mutilple methods having same name nut different in signature;
//		System.out.println(ad.add(1, 2));
//		System.out.println(ad.add(10, 10.0));
//		System.out.println(ad.add(1.3f, 1));
		
//		Encapsulation - providing controlled access to the important things 
//		this can be acheived by private keyword and getters and setters
		
		
		
//class Student {
//	String name;
//	String roll;
//	int id;
//	
//	void eat() {
//		System.out.println("Student is eating food");
//	}
//}



		// method overloading
//class addition {
//	int add(int a, int b) {
//		return a + b;
//	}
//	float add(int a, float b) {
//		return a + b;
//	}
//	float add(float a, int b) {
//		return a + b;
//	}
//	double add(double a, int b) {
//		return a + b;
//	}
//	double add(double a, double b) {
//		return a + b;
//	}
//	float add(float a, float b) {
//		return a + b;
//	}
//	double add(float a, double b) {
//		return a + b;
//	}
//	
//}	
//		Bank bnk = new Bank();
//		bnk.setData(10000);
////		bnk.setData(-1999);
//		bnk.setData1(1234);
//		bnk.setdate("vamsi", "king");
//		System.out.println(bnk.getname());
//		System.out.println(bnk.getrollno());
//		System.out.println(bnk.getData1());
//		System.out.println(bnk.getData());
		
//		bank b2 = new bank();
//		System.out.println(b2.getbal());
//		System.out.println(b2.getname());
//		System.out.println(b2.getpass());
//		bank b1 = new bank("sbi", 10000,"king");
//		System.out.println(b1.getbal());
//		System.out.println(b1.getname());
//		System.out.println(b1.getpass());
//		bank b3 = new bank("king", 12);
//		System.out.println(b3.getbal());
//		System.out.println(b3.getname());
//		System.out.println(b3.getpass());
		
//		
//		staticmethod sm = new staticmethod();
//		staticmethod.fun();
//		sm.fun1();
		
//		Stack<Integer> s = new Stack<>();
//		
//		s.push(1);
//	    s.push(2);
//	    s.push(3);
//	    s.push(4);
//	    
//	    System.out.println(s);
//	    
//	    while(!s.isEmpty()) {
//	    	s.pop();
//	    }
//	    System.out.println(s);
		
//		child c = new child();
//		c.fun();
//		c.change();
		
//		demo d = new demo();
//		d.fun();
//		demo1 d1 = new demo1();
//		d1.fun();
//		demo2 d2 = new demo2();
//		d2.fun();
		
//		child c = new child(10, "vamsi");
//		System.out.println(c.age);
//		System.out.println(c.name);
//		
//		child c1 = new child();
//		System.out.println(c1.age);
//		System.out.println(c1.name);
		
//		plane p = new plane();
//		p.eat();
//		p.fly();
//		
//		cargoplane cp = new cargoplane();
//		cp.eat();
//		cp.fly();
//		cp.shout();
		
//		plane p= new plane(); 
//		p.fly();
//		p.sound();
		
//		plane cp = new cargoplane(); // loose bound = creating a child class object using parent refernce
//		cp.fly();				// it will work only for the  inherited and overridden method
//		cp.sound();	
//		cp.safe(); // this is specalized method for cargoplane we need to use cast
//		((cargoplane)cp).safe();
		// for accesing specialized methods we need to use "downcast"
//		downcasting = converting parent type reference to child type reference
		
//		plane pp = new passengerplane();
//		pp.fly();
//		pp.sound();
		
		//creating another method to reduce the code compact and this is method is created by using parent ref
//		top t = new top();
//		plane cp = new cargoplane();
//		plane pp = new passengerplane();
//		t.hasa(cp);
//		t.hasa(pp);
//		
//		finalex f = new finalex();
//		f.print();
		
//		useful us = new useful();
//		//tight bound
//		us.b.memory();
//		us.b.sleep();
//		us.b.work();
//		
//		us.bl.press();
//		us.bl.sleep();
//		us.bl.work();
//		
//		//loose bound
//		bike b = new bike(); 
//		book bb = new book();
//		us.hasa(b);
//		us.hasa(bb);
		
//		airport ap = new airport();
//		plane p = new plane(); // because it is abstract class so we can not create a instance of this
		
//		cargoplane cp = new cargoplane();
//		fighter f = new fighter();
//		ap.hasa(cp);
//		ap.hasa(f);
		
//		std s = new std(); // we cannot create a instance to the interface
//		std s = new good(); // loose coupling creating a parent type reference to child class
//		s.age();
//		s.name();
//		
//		std s1 = new bad();
//		s1.age();
//		s1.name();
//		s1.eat() it is not possible beacause it is child specific
//		4 point
		//downcasting - converting parent type ref to child type refernce
//		((bad) s1).eat();
		
//		std2 s = new std2();
//		s.name();
//		s.eat();
		
//		std2 s = new std2();
//		s.eat();
//		s.sleep();
		
		//arraylist is same as array but syntaax is diff here adding at first and accesing elemnts will be fast
//		ArrayList ar = new ArrayList();
//		ar.add(100);
//		ar.add(200);
//		ar.add(300); //for adding elements
//		
//		System.out.println(ar); //for printing
//		//array methods
//		System.out.println(ar.get(0)); // for accesing ele through index
//		System.out.println(ar.contains(100)); //for checking ele present in arlist
//		System.out.println(ar.equals(100)); //return true or false
//		System.out.println(ar.indexOf(1)); //return ele in index
//		System.out.println(ar.remove(2));//removes eleme in index
//		System.out.println(ar.size());
//		System.out.println(ar.subList(0, 1));
////		System.out.println(ar.sort));
////		System.out.println(ar.);
//		
//		//for each
//		for(Object x:ar) {
//			System.out.println(x);
//		}
//		
//		//for loop
//		for(int i=0;i<ar.size();i++) {
//			System.out.println(ar.get(i));
//		}
//		
//		//iterator
//		Iterator it = ar.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		//it uses doubly linked list to store and access elements
//		LinkedList ll = new LinkedList();
//		LinkedList l2 = new LinkedList();
//		
//		ll.add(100);
//		ll.add(200);
//		ll.add(300);
//		ll.add(400);
//		ll.add(500);
//		ll.add(600);
//		
//		System.out.println(ll);
//		System.out.println(ll.contains(100));
//		System.out.println(ll.get(2));
//		System.out.println(ll.indexOf(200));
//		System.out.println(ll.isEmpty());
//		System.out.println(ll.peek());//return 1 element
//		System.out.println(ll);
//		System.out.println(ll.poll());//return 1 ele and remove it from list
//		System.out.println(ll);
//		ll.remove(2);
//		System.out.println(ll);
//		ll.set(1, 900); //set replaces the value with this value at given index
//		System.out.println(ll);
//		System.out.println(ll.size());
//		
////		for each
//		for(Object x:ll) {
//			System.out.println(x);
//		}
//		
//		//for loop
//		for(int i=0;i<ll.size();i++) {
//			System.out.println(ll.get(i));
//		}
//		
//		//iterator
//		Iterator it = ll.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
//		
//		l2.addAll(ll); //add all elements
//		System.out.println(l2);
//		System.out.println(l2.containsAll(ll)); //check whether all elements  present in ll or not
//		System.out.println(l2);
		
		
//	generics - it is used to specify the data that need to store in the collections
//		ArrayList<Integer> ar = new ArrayList<>();
//		ArrayList<String> ar1 = new ArrayList<>();
//		ArrayList<Character> ar2 = new ArrayList<>();
//		ArrayList<Boolean> ar3 = new ArrayList<>();
		
		
		//it uses double ended queue to add and acess
//		ArrayDeque ad = new ArrayDeque();
//		ad.add(100);
//		ad.add(200);
//		ad.add(300);
//		ad.add(400);
//		ad.addLast(500);
//		ad.addFirst(600);
//		
//		System.out.println(ad);
//		
////		for(int i=0;i<ad.size();i++) {
////			System.out.println(ad. + " ");
////		}
//		
//		for(Object i : ad) {
//			System.out.println(i + " ");
//		}
//		
//		System.out.println(ad.contains(100));
//		System.out.println(ad.getFirst());
//		System.out.println(ad.getLast());
//		System.out.println(ad.isEmpty());
//		System.out.println(ad.peek());
//		System.out.println(ad);
//		System.out.println(ad.poll());
//		System.out.println(ad);
//		System.out.println(ad.iterator());
		
		//it uses min heap to store data 
//		PriorityQueue pq = new PriorityQueue();
//		pq.add(100);
//		pq.add(50);
//		pq.add(25);
//		pq.add(75);
//		pq.add(155);
//		pq.add(125);
//		
//		System.out.println(pq);
//		
//		System.out.println(pq.contains(100));
//		System.out.println(pq.isEmpty());
//		System.out.println(pq.remove(100));
//		System.out.println(pq.size());
//		System.out.println(pq.toArray());
//		
//		Iterator it = pq.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		//hashing concept to store the values in the hashset it does not allow duplicate 
//		HashSet hs = new HashSet();
//		hs.add(100);
//		hs.add(200);
//		hs.add(300);
//		hs.add(50);
//		hs.add(40);
//		hs.add(90);
//		String[] arr = {"sai" , "100"};
//		System.out.println(hs);
//		System.out.println(hs.contains(100));
//		System.out.println(hs.equals(100));
//		System.out.println(hs.isEmpty());
//		System.out.println(hs.remove(arr[1]));
//		System.out.println("=============================");
//		System.out.println(hs.size());
//		System.out.println(hs.toArray());
//		System.out.println(hs.iterator());
//		Object[] vamsi = hs.toArray();
//		for(int i=0;i<hs.size();i++) {
//			System.out.println(vamsi[i]);
//		}
//		
//		for(Object i:hs) {
//			System.out.println(i);
//		}
//		
//		Iterator it = hs.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		
		//it uses balanced binary tree and red black algorithm
//		TreeSet ts = new TreeSet();
//		ts.add(100);
//		ts.add(50);
//		ts.add(150);
//		ts.add(25);
//		ts.add(75);
//		ts.add(125);
//		ts.add(175);
//		System.out.println(ts);
//		
//		System.out.println(ts.contains(100));
//		System.out.println(ts.ceiling(175));
//		System.out.println(ts.equals(100));
//		System.out.println(ts.first());
////		System.out.println(ts.getFirst());
//		System.out.println(ts.last()); 
//		System.out.println(ts.pollFirst());
//		System.out.println(ts.pollLast());
//		System.out.println(ts.remove(100));
//		System.out.println(ts.size());
////		System.out.println(ts.retainAll());
//		System.out.println(ts.subSet(100, 200));
		
//		
//		LinkedHashSet hs = new LinkedHashSet();
//		hs.add(100);
//		hs.add(100);
//		hs.add(200);
//		hs.add(300);
//		hs.add(50);
//		hs.add(40);
//		hs.add(90);
//		String[] arr = {"sai" , "100"};
//		System.out.println(hs);
//		System.out.println(hs.contains(100));
//		System.out.println(hs.equals(100));
//		System.out.println(hs.isEmpty());
//		System.out.println(hs.remove(arr[1]));
//		System.out.println("=============================");
//		System.out.println(hs.size());
//		System.out.println(hs.toArray());
//		System.out.println(hs.iterator());
//		Object[] vamsi = hs.toArray();
//		for(int i=0;i<hs.size();i++) {
//			System.out.println(vamsi[i]);
//		}
//		
//		for(Object i:hs) {
//			System.out.println(i);
//		}
//		
//		Iterator it = hs.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		//it also uses dynamic array and it is outdated
//		Vector v = new Vector();
//		v.add(100);
//		v.add(200);
//		v.add(300);
//		v.add(400);
//		v.add(500);
//		v.add(600);
//		
//		System.out.println(v);
//		System.out.println(v.capacity());
//		System.out.println(v.contains(100));
//		System.out.println(v.equals(100));
//		System.out.println(v.get(1));
//		System.out.println(v.indexOf(1));
//		System.out.println(v.isEmpty());
//		System.out.println(v.set(0, 800));
//		System.out.println(v.size());
//		System.out.println(v.subList(0, 1));
//		System.out.println(v.remove(3));
//		System.out.println(v);
		
		//last in first out or first in last out
//		Stack s = new Stack();
//		s.add(100);
//		s.add(200);
//		s.add(300);
//		s.add(400);
//		s.push(500);
//		s.pop();
//		System.out.println(s);
//		System.out.println(s.capacity());
//		System.out.println(s.contains(500));
//		System.out.println(s.empty());
//		System.out.println(s.equals(1));
//		System.out.println(s.get(2));
//		System.out.println(s.indexOf(100));
//		System.out.println(s.peek());
//		System.out.println(s);
//		System.out.println(s.remove(2));
//		System.out.println(s.set(0, 600));
//		System.out.println(s);
//		System.out.println(s.search(200));
//		System.out.println(s.size());
////		System.out.println(s.);
		
//		 HashSet hs = new HashSet();
//	     hs.add(new Student(20,"vamsi")); // this two are same but hashcode treats as diff objects
//	     hs.add(new Student(20,"vamsi")); // this can be solved by using hashcode and equals methos
//	     hs.add(new Student(21,"sai"));
//	     System.out.println(hs.size()); // give size 3 but we need 2
		
//		ArrayList<student> al = new ArrayList<>();
//		al.add(new student("vamsi",192));
//		al.add(new student("sai",20));
//		al.add(new student("atul",21));
//		al.add(new student("king",22));
//		
//		//lambda comparator operator
//		Collections.sort(al,(s1,s2) -> {
//			student a = (student) s1;
//			student b = (student) s2;
//			//for integer values
////			return Integer.compare(a.age, b.age);
//			//for strings
//			return a.name.compareTo(b.name);
//		});
//		System.out.println(al);
		
		
	}
}


//class Bank {
//	private int bal; // private keyword
//	private int atmPin;
//	
//	private String name;
//	private String rollno;
//	
//	public void setdate(String name, String rollno) {
//		this.name = name;
//		this.rollno = rollno;
//	}
//	public String getname() {
//		return name;
//	}
//	
//	public String getrollno() {
//		return rollno;
//	}
//	public void setData(int x) { //setter method
//		if (x > 0) {
//			bal = x;
//		}
//		else {
//			System.out.println("Not possible");
//			System.exit(0);
//		}
//	}
//	public void setData1(int atmPin) {
//		this.atmPin = atmPin;  // shadowing problem
//	}
//	public int getData1() { //getter method
//		return atmPin;
//	}
//	public int getData() {
//		return bal;
//	}
//}

//class bank {
//	private String name;
//	private int bal;
//	private String pass;
//	
//	//setter or constructor
//	public bank(String name, int bal) {  //constructor name is same as class name and it is autmatically created by complier
//		System.out.println("executing two parameters constructor");
//		this.name = name; //it is a built in method in setter it is not static and not void method overlading possible
//		this.bal = bal;
//	}
//	//constructore overloading
//	public bank(String name, int bal,String pass) { 
//		System.out.println("executing three parameters constructor");
//		this.name = name;
//		this.bal = bal;
//		this.pass = pass;
//	}
//	
//	//if no constructore is created then complier create this
//	public bank() {
//		System.out.println("zero construcor parameters");
//	}
//	
//	public String getname() {
//		return name;
//	}
//	
//	public int getbal() {
//		return bal;
//	}
//	
//	public String getpass() {
//		return pass;
//	}
//}

//class bank {
//	private String name;
//	private int bal;
//	private String pass;
////	
////	
//	public bank() { 
//		System.out.println("executing zero parameters constructor");
//		this.name = "vamsi";
//		this.bal = 10000;
//		this.pass = "don";
//	}
//	
//	public bank(String name, int bal) {
//		this();
//		System.out.println("executing Two parameters constructor");
//		this.name = name;
//		this.bal = bal;
//	}
	
//	//constructore changing
//	//local changing one constructor calling another constructore in the same class
//	public bank(String name, int bal, String pass) {
//		this();
//		System.out.println("executing Three parameters constructor");
//		this.name = name;
//		this.bal = bal;
//		this.pass = pass;
//	}
//	
//	public String getname() {
//		return name;
//	}
//	
//	public int getbal() {
//		return bal;
//	}
//	
//	public String getpass() {
//		return pass;
//	}
//}

//class staticmethod {
//	static int a; // static variable;
//	int b;  //instance varibale
//	
//	static {	//static block
//		System.out.println("Hello bro i am in static bloack so i will excute fisrt");
//		a = 10;
//		System.out.println(a);
//	}
//	
//	{  //instance block
//		System.out.println("Hello bro i am in instance block so i will excute second");
//	}
//	
//	public staticmethod() { //constructor - when object created it get executed
//		System.out.println("Hello bro i am constructor");
//	}
//	
//	public static void fun() { //static method - this we can access by the class name
//		System.out.println("hello mava i am in static method so dont create instance for me...");
//	}
//	
//	public void fun1() {  //instance method - we need to create a obj and by using ref access this
//		System.out.println("Hello bro i am a normal method create a instance for me bro...");
//	}
//}

//Inheritance implementation - it is a process of acquring the properties and behaviours of parent calss to child class
// in this we are going to use the keyword extends

//1.private members will not participate in inheritence
//it is not possible in java

//class parent { 
//	private String name = "vamsi";
//	private int age = 20;
//	
//}
//class child extends parent {
//	void fun() {
//		System.out.println(name);
//		System.out.println(age);
//	}
//	
//	void change() {
//		name = " king";
//		age = 20;
//		System.out.println(name);
//		System.out.println(age);
//	}
//}

//2.multi level inheitence(hierarchical inheitence) is possible

//class demo { //level = 0
//	void fun() {
//		System.out.println("hello");
//	}
//}
//
//class demo1 extends demo { //level = 1
//	void fun() {
//		System.out.println("bye");
//	}
//}
//
//class demo2 extends demo1 { //level = 2
//	void fun() {
//		System.out.println("bye");
//	}
//}

//3.multiple inheitence - one child having multiple parents is  known as diamond shaped problem
//it is not possible in java

//class demo { //level = 0
//	void fun() {
//		System.out.println("hello");
//	}
//}
//
//class demo1 extends demo { //level = 1
//	void fun() {
//		System.out.println("bye");
//	}
//}
//class demo2 extends demo1,demo { // this is the diamond shaped problem
//	void fun() {
//		System.out.println("bye");
//	}
//}

//4.cyclic inheitence 

//class demo extends Object{
//	void fun() {
//		System.out.println("hello");
//	}
//}
//class demo1 extends demo {
//	void fun() {
//		System.out.println("hello");
//	}
//}
//class demo extends demo1 { // here circle is formed
//	void fun() {
//		System.out.println("hello");
//	}
//}

//5.constructor is also not participte in inheritence
//but super() method we can use this is nothing but calling a parent class constructor from child class

//class student {
//	int age;
//	String name;
//	
//	public student() {
//		System.out.println("prent 0 para");
//		this.age = 20;
//		this.name = "vamsi";
//	}
//	public student(int age,String name) {
//		this
//		System.out.println("prent 2 para");
//		this.age = age;
//		this.name = name;
//	}
//}
//class child extends student {
//	
//	public child() {
//		super();
//		System.out.println("child 0 para");
//		this.age = 21;
//		this.name = "sai";
//	}
//	
//	public child(int age, String name) {
//		super();
//		System.out.println("child 2 para");
//		this.age = age;
//		this.name = name;
//	}
//	
//}

//types of inheritence 
//1.single 
//2. multi level
//3.hierarchical
//4.hybrid
//5.multiple

//toString() - it is used to print objects in the form of @and some values

//Access modifiers 
//1.public - it is the method or var or class it can be accessible anywhere in any package
//2.protected - it can be accessed in same package and child class
//3.default - if we not declare any thing then it is default it is used in same package
//4.private - it is used in same class outside it is not accessible

//inheritence methods 
//1.overddien method - taken from parent and used accourding to our need
//2.inherited - this are the directly taken from the parent
//3.specalized - this is only present in the child class only

//class plane {
//	void fly() {
//		System.out.println("Plane is flying.");
//	}
//	void eat() {
//		System.out.println("Plane is eating");
//	}
//}
//class cargoplane extends plane { // fly and eat are inherited and fly is overriddden and shout is specilaized method.
//	void fly() {
//		System.out.println("Cargo fly at low hights");
//	}
//	
//	void shout() {
//		System.out.println("lot of sound");
//	}
//}

//class plane {
//	void sound() {
//		System.out.println("It makes sound");
//	}
//	
//	void fly() {
//		System.out.println("Plane is flying.");
//	}
//	
//	void safe() {
//		System.out.println("It is safe");
//	}
//}
//class cargoplane extends plane { 
//	void fly() {
//		System.out.println("Cargo fly at low hights");
//	}
//	void safe() {
//		System.out.println("It is safe");
//	}
//}
//class passengerplane extends plane { 
//	void fly() {
//		System.out.println("passenger fly at low hights");
//	}
//}
//class top {
//	void hasa(plane p) {
//		p.fly();
//		p.sound();
//		p.safe();
//	}
//}

//final is mainly into 3 types
//1.final varible - we are not able to change values of this variable
//2.final method - it make the method to not override
//3.final class-it we use final for class we are not able to create a subclass or child for that class

//final class finalex { //final class
//	final int age = 20; // final variable
//	final void print() { // final method
//		System.out.println(age);
////		age = 30; // final value cannot able to change it will give error
//		System.out.println(age);
//	}
//}
//class god extends finalex { //it will give error because final class cant be extended
//	void print() { // it will give error because  we cant inherit the final method
//		
//	}
//}

//Aggregration and composition
//agregration - it is a loose bound has a relationship
//in this it has one object has the relation of another object and both objects exists independently
//composition - it is a tight bound has a reationship
//in this one object has one or more compound objects and compounded object not exit
//loose bound - it is not that much important releated to the object
//tight bound -  it is useful to the object
//is a is solved by using inheitence
//part of is sloved using agregration and compostion


//class student {
//	void work() {
//		System.out.println("he is working");
//	}
//	void sleep() {
//		System.out.println("he is sleeping");
//	}
//}
//class bike extends student {
//	void price() {
//		System.out.println("the price is high");
//	}
//}
//class book extends student {
//	void author() {
//		System.out.println("mera ko pata nahi");
//	}
//}
//class brain extends student {
//	void memory() {
//		System.out.println("spped 1 tera  byte");
//	}
//}
//class blood extends student {
//	int val;
//	void press() {
//		System.out.println("good pumping power");
//	}
//}
//class useful {
//	brain b = new brain();
//	blood bl = new blood();
//	
//	void hasa(book b) {
//		b.author();
//		b.sleep();
//		b.work();
//	}
//	
//	void hasa(bike bi) {
//		bi.price();
//		bi.sleep();
//		bi.work();
//	}
//}

//abstraction - it is a process of hiding the complex implentation and showing the useful info to the user
//it is created by keyword - abstract
//abstract class can extends another class 
//normal class extends abstract class
//it one method is abstart in class then total class is abstract
//abstract methods does not have body they have only signature
//abstartct and final can not be used in same line

//abstract class plane {
//	abstract void fly();
//	abstract void takeoff();
//}
//class cargoplane extends plane {
//	void fly() {
//		System.out.println("cargo plane is flying");
//	}
//	void takeoff() {
//		System.out.println("cargo is taking off");
//	}
//}
//class fighter extends plane {
//	void fly() {
//		System.out.println("fighter is flying");
//	}
//	void takeoff() {
//		System.out.println("fighter is taking off");
//	}
//	void see() {
//		System.out.println("it is good to see");
//	}
//}
//class airport {
//	void hasa(plane p) {
//		p.fly();
//		p.takeoff();
//	}
//}

//interface - uses implement keyword
//1.empty interface - marker interfrcae or tagged interface
//interface man {
//	 ->marker interfrcae or tagged interface
//}

//2.interface is used to achieve standaraization(coding convenition)

//3.interface promotes polymorphism by creating a interface ref to the child class objects it  provides loose coupling 
//ans reduces code

//interface std {
//	void name();
//	void age();
//}
//class good implements std {
//	public void name() {
//		System.out.println("vamsi");
//	}
//	public void age() {
//		System.out.println(20);
//	}
//}
//class bad implements std {
//	public void name() {
//		System.out.println("sai");
//	}
//	public void age() {
//		System.out.println(21);
//	}
//}
//class school {
//	void hasa(std s) {
//		s.name();
//		s.age();
//	}
//}

//4.specalized method are not accessible using parent type refernce directly
//for accessing indirectly we will downcast to child class
//interface std {
//	void name();
//	void age();
//}
//class good implements std {
//	public void name() {
//		System.out.println("vamsi");
//	}
//	public void age() {
//		System.out.println(20);
//	}
//}
//class bad implements std {
//	public void name() {
//		System.out.println("sai");
//	}
//	public void age() {
//		System.out.println(21);
//	}
//	void eat() {
//		System.out.println("he is eating"); //child specific method
//	}
//}

//5.inside the interface the methods are always "public abstract" by default
//interface std {
//	void name(); // it is by default public abstract
//}

//6.if the class is partially implements an interface then the class by default would be abstract.
//then the child class should implement remaining
//interface student {
//	void name();
//	void eat();
//}
//abstract class std1 implements student {
//	public void name() {
//		System.out.println("vamsi");
//	}
//}
//class std2 extends std1 { //it extends the std1 and implements the remaining methods
//	public void eat() {
//		System.out.println("he is eating");
//	}
//}

//7.an interface can not implements another interface it shows error because we are not implementing in the parent interface
//and we are making child also interface then we are not able to give data to the parent interface 

//interface std {
//	void eat();
//}
//interface std1 implements std { // shows error because we can not implement another interface
//	void sleep();
//}

//8.but interface can "extends" another interface
//it is used to achieve drawback in inheritence by using interface 

//interface std1 {
//	void eat();
//}
//interface std2 {
//	void eat();
//}
//interface st2 extends std1,std2 { //it is possible
//	void sleep();
//}

//9.in interface only the methods and constant value should present. by default the value type is "public final"
//interface std {
//	public final int age = 20; // by defaultit is final
//	void name();
//}

//10.multiple iheritence is not possible because of diamond shape problem but
//multiple interfaces is possible because in inheritence there is not diamond shape problem because it does not parents

//interface std {
//	void eat();
//}
//interface std1 {
//	void sleep();
//}
//class std3 implements std,std1 {
//	public void eat() {
//		System.out.println("hello is eating");
//	}
//	public void sleep() {
//		System.out.println("sleeping");
//	}
//}

//11.a class can both extend another class and implements interface.the order should be used as first extends and implemetns next

//interface std {
//	void eat();
//}
//class std1 {
//	void sleep() {
//		System.out.println("he is sleeping");
//	}
//}
//class std2 extends std1 implements std {
//
//	@Override
//	public void eat() {
//		System.out.println("he is eating");
//	}
//}

//hashcode - it generates a unique hexadecimal hashcode for the objects that is used to comapare 
// if two objects are same but it treats it has diff for this we overide this methods.
//eqauls - it is used to compare the data inside the objects. if both are same then it will return true else false

//class Student {
//	int age;
//	String name;
//	public Student(int age, String name) {
//		super();
//		this.age = age;
//		this.name = name;
//	}
//	
//	//overriding equals method accourding to us
//	public boolean equals(Object o) {
//		if(this == o) return true;
//		
//		Student s = (Student) o;
//		if (age == s.age && name.equals(s.name)) {
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
//	
//	//overriding hashcode to compare hash code of values not objects
//	public int hashCode() {
//		return Objects.hash(age,name);
//	}
//	
//}

//comparable - it is used to specify how the objects of the class should be compared.
//we need to override the compareTo method in this class and to string for output.
//class student implements Comparable<student> {
//	
//	String name;
//	int age;
//	public student(String name, int age) {
//		super();
//		this.name = name;
//		this.age = age;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	
//	public String toString() {
//		return "name: " + name + " | age: " + age;
//	}
//	
//
//	@Override
//	public int compareTo(student o) {
//		//used for string sorting
////		return this.name.compareTo(o.name);
//		//this is used for sorting the numbers...
//		if(this.age > o.age) {
//			return 1;
//		}
//		else if (this.age < o.age) {
//			return -1;
//		}
//		else {
//			return 0;
//		}
//	}
//
//}

//comparator - it is used to sort the objects of the class in differnt ways without changing the class

//class student{
//	String name;
//	int age;
//	public student(String name, int age) {
//		super();
//		this.name = name;
//		this.age = age;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	
//	public String toString() {
//		return "name: " + name + " age " + age;
//	}
//	
//}
