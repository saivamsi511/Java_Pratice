package hello;

public class demo {
	public static void main(String[] args) {
		String s1 = "kod";
		String s2 = "nest";
		String s15 = s1;
		String s3 = "kod" + "nest";
		String s4 = "kod" + "nest";
		String s5 = s1 + s2;
		String s6 = s1 + s2;
		String s7 = new String(s1);
		String s8 = new String(s1);
		String s9 =  "kod" + s1;
		String s10 = "kod" + s1;
		String s11 = s1.concat(s2);
		String s12 = s1.concat(s2);
		String s13 = "hello".concat("vamsi");
		String s14 = "hello".concat("vamsi");
		

		if(s3 == s4) {
			System.out.println("References are equal");
		}
		else {
			System.out.println("References are unequal");
		}
		
		if(s3.equals(s4)) {
			System.out.println("values are equal");
		}
		else {
			System.out.println("values are unequal");
		}
		
		int s = s1.compareTo("kod");
		if(s > 0) {
			System.out.println("left string is greather");
		}
		else if (s < 0) {
			System.out.println("right string is greather");
		}
		else {
			System.out.println("both are equal");
		}
		
		if(s5 == s6) {
			System.out.println("References are equal");
		}
		else {
			System.out.println("References are unequal");
		}
		
		if(s5.equals(s6)) {
			System.out.println("values are equal");
		}
		else {
			System.out.println("values are unequal");
		}
		
		if(s7 == s8) {
			System.out.println("References are equal");
		}
		else {
			System.out.println("References are unequal");
		}
		
		if(s7.equals(s8)) {
			System.out.println("values are equal");
		}
		else {
			System.out.println("values are unequal");
		}
		
		if(s9 == s10) {
			System.out.println("References are equal");
		}
		else {
			System.out.println("References are unequal");
		}
		
		if(s9.equals(s10)) {
			System.out.println("values are equal");
		}
		else {
			System.out.println("values are unequal");
		}
		
		if(s11 == s12) {
			System.out.println("References are equal");
		}
		else {
			System.out.println("References are unequal");
		}
		
		if(s11.equals(s12)) {
			System.out.println("values are equal");
		}
		else {
			System.out.println("values are unequal");
		}
		
		System.out.println("this is ");
		if(s13 == s14) {
			System.out.println("References are equal");
		}
		else {
			System.out.println("References are unequal");
		}
		
		if(s13.equals(s14)) {
			System.out.println("values are equal");
		}
		else {
			System.out.println("values are unequal");
		}
		if(s15 == s1) {
			System.out.println("References are equal");
		}
		else {
			System.out.println("References are unequal");
		}
		
		if(s15.equals(s1)) {
			System.out.println("values are equal");
		}
		else {
			System.out.println("values are unequal");
		}
		
		String s111 = "vamsi";
		String s31 = "         s            ";
		String s21 = "sai";
		System.out.println(s111.charAt(3));
		System.out.println(s111.startsWith(s21));
		System.out.println(s111.concat(s21));
		System.out.println(s111.length());
		System.out.println(s111.endsWith(s21));
		System.out.println(s111.toUpperCase());
		System.out.println(s111.toLowerCase());
		System.out.println(s111.indexOf('s'));
		System.out.println(s111.compareTo(s21));
		System.out.println(s111.equals(s21));
		System.out.println(s111.equalsIgnoreCase(s21));
		System.out.println(s111.equalsIgnoreCase(s21));
		System.out.println(s111.toString());
		System.out.println(s111.contains(s21));
		System.out.println(s111.isEmpty());
		System.out.println(s111.replace("si","va"));
		System.out.println(s111.split("m"));
		System.out.println(s111.substring(1));
		System.out.println(s111.toCharArray());
		System.out.println(s31.trim());
		
		
		
	
	}
	
}
