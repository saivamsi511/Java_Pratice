package takinginput;
//pattern - 1
//* * * * * 
//* * * * * 
//* * * * * 
//* * * * * 
//* * * * * 

//pattern -> 2
//1 2 3 4 5 
//1 2 3 4 5 
//1 2 3 4 5 
//1 2 3 4 5 
//1 2 3 4 5 

//patter -> 3
//1 1 1 
//2 2 2 
//3 3 3 
//4 4 4 
//5 5 5 

//patter -> 4
//* 
//* * 
//* * * 
//* * * * 
//* * * * * 

//pattern -> 5
//1 
//1 2 
//1 2 3 
//1 2 3 4 
//1 2 3 4 5 

//patter -> 6
//1 
//2 2 
//3 3 3 
//4 4 4 4 
//5 5 5 5 5 

//HW
//pattern -> 7
//5 4 3 2 1 

//pattern - > 8
//*****
//****
//***
//**
//*

//pattern ->9
//5 4 3 2 1
//5 4 3 2
//5 4 3
//5 4
//5

//pattern -> 10
//1 2 3 4 5
//1 2 3 4
//1 2 3
//1 2
//1

//pattern -> 11
//5 5 5 5 5
//4 4 4 4
//3 3 3
//2 2 
//1

//pattern -> 12
//----*****

public class challenges {
	public static void main(String[] args) {
//		int n = 5;
//		for(int i = 1 ;i <= 5; i++) {
//			for (int j = 5; j >= i; j--) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
////			n-= 1;
//		}
//		for (int j = 1;j<= 5;j++) {
//			for(int k = 5; k>=1 ;k--) {
//				System.out.print(" ");
//			}
//			for (int i = 1; i <= 5 ;i++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		1
//		int n = 1;
//		for(int i = 1 ;i <= 5;i++) {
//			for(int j = 1;j<= 4;j++) {
//				System.out.print(" ");
//			}
//			for(int k = 1;k<= n;k++) {
//				System.out.print("*");
//			}
//			n+= 1;
//		System.out.println();
//		
//		}
//		2
//		int n = 1;
//		for(int i = 5 ;i >= 1;i--) {
//			for(int j = 1;j<= i;j++) {
//				System.out.print(" ");
//			}
//			for(int k = 1;k<= n;k++) {
//				System.out.print("*");
//			}
//			n+= 1;
//		System.out.println();
//		
//		}
//		3
//		int n = 1;
//		for(int i = 1 ;i <= 5;i++) {
//			for(int k = 1;k<= n;k++) {
//				System.out.print(" ");
//			}
//			for(int j = 1;j<= 4;j++) {
//				System.out.print("*");
//			}
//			n+= 1;
//		System.out.println();
//		}
//		4
//		int n = 1;
//		for(int i = 1 ;i <= 5;i++) {
//			for(int k = 1;k<= n;k++) {
//				System.out.print(" ");
//			}
//			for(int j = 1;j<= n;j++) {
//				System.out.print("*");
//			}
//			n+= 1;
//		System.out.println();
//		}
//		5
//		int n = 1;
//		int a = 5;
//		for(int i = 1 ;i <= 5;i++) {
//			for(int k = 1;k<= n;k++) {
//				System.out.print(" ");
//			}
//			for(int j = 1;j<= a;j++) {
//				System.out.print("* ");
//			}
//			n+= 1;
//			a -= 1;
//		System.out.println();
//		}
//		6
//		int n = 1;
//		int a = 5;
//		for(int i = 1 ;i <= 5;i++) {
//			for(int k = 1;k<= a;k++) {
//				System.out.print(" ");
//			}
//			for(int j = 1;j<= a;j++) {
//				System.out.print("*");
//			}
//			n+= 1;
//			a -= 1;
//		System.out.println();
//		}
//		7
//		int n = 1;
//		for(int i = 5 ;i >= 1;i--) {
//			for(int j = 1;j<= i;j++) {
//				System.out.print(" ");
//			}
//			for(int k = 1;k<= n;k++) {
//				System.out.print("*");
//			}
//			n+= 1;
//		System.out.println();
//		
//		}
//		int m = 1;
//		int b = 5;
//		for(int i = 1 ;i <= 5;i++) {
//			for(int k = 1;k<= m;k++) {
//				System.out.print(" ");
//			}
//			for(int j = 1;j<= b;j++) {
//				System.out.print("*");
//			}
//			m+= 1;
//			b -= 1;
//		System.out.println();
//		}
//		8
//		int n = 1;
//		for(int i = 1 ;i <= 5;i++) {
//			for(int k = 1;k<= n;k++) {
//				System.out.print(" ");
//			}
//			for(int j = 1;j<= n;j++) {
//				System.out.print("*");
//			}
//			n+= 1;
//		System.out.println();
//		}
//		int m = 1;
//		int a = 5;
//		for(int i = 1 ;i <= 5;i++) {
//			for(int k = 1;k<= a;k++) {
//				System.out.print(" ");
//			}
//			for(int j = 1;j<= a;j++) {
//				System.out.print("*");
//			}
//			n+= 1;
//			a -= 1;
//		System.out.println();
//		} 
		
//		9
//		for (int i = 1;i<= 5;i++) {
//			for (int j = 1;j<= 5;j++) {
//				if (i == 1 || i == 5 || j == 1 || j == 5) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		int n = 5;
		int rows = n;
		for(int i = 1;i<= rows;i++) {
			int col = n;
			for(int j = 1;j<=col;j++) {
				System.out.print("*");	
			}
		System.out.println();
		}
	}
	}
