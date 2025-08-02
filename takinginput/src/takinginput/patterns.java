package takinginput;

public class patterns {
	public static void main(String[] args) {
//		pattern1(5);
//		pattern2(5);
//		pattern3(5);
//		patter4(5);
//		pattern5(5);
//		pattern6(5);
//		pattern7(5);
//		pattern8(5);
//		pattern9(5);
//		pattern10(5);
//		pattern11(5);
//		pattern12(5);
//		pattern13(5);
//		pattern14(5);
//		pattern15(5);
		pattern16(5);
		
	}
	/* 	*****
	 	*****
	 	*****
	 	*****
	 	*****	
	*/
	public static void pattern1(int n) {
		int rows = n;
		for(int i = 1;i<= rows;i++) {
			int col = n;
			for(int j = 1;j<=col;j++) {
				System.out.print("*");	
			}
			System.out.println();
		}
		/* 	*
	 		**
	 		***
	 		****
	 		*****	
	 	*/
	}
	public static void pattern2(int n) {
		int rows = n;
		for(int i =1 ; i<=rows ;i++) {
			int cols = i;
			for(int j = 1; j<= cols;j++) {
				System.out.print("*");
			}
		System.out.println();
		}
	}
	/* *****
	 * ****
	 * ***
	 * **
	 * *
	 */
	public static void pattern3(int n) {
		int rows = n;
		for(int i = 1;i <= rows;i++) {
			int cols = n-i+1;
			for(int j = 1; j<= cols;j++) {
				System.out.print("*");
			}
		System.out.println();
		}
	}
	/* 
	 * *****
	 * ****
	 * ***
	 * **
	 * *
	 * **
	 * ***
	 * ****
	 * *****
	 */
	public static void patter4(int n) {
		int rows = 2 * n - 1; 
		for (int i = 1;i <= rows; i++) {
			int cols = (i <= n) ? n- i + 1 : i - n + 1;
			for(int j = 1;j<=cols;j++) {
				System.out.print("*");
			}
		System.out.println();
		}
	}
	
	/*
	 *     *
	 *    * *
	 *   * * *
	 *  * * * *
	 */
	
	public static void pattern5(int n) {
		int rows = n;
		for(int i = 1;i<=rows;i++) {
			int space = n - i + 1;
			for(int j = 1;j<=space;j++) {
				System.out.print(" ");
			}
			int cols = i;
			for(int k = 1;k<=cols;k++) {
				System.out.print("* ");
			}
		System.out.println();
		}
	}
	
	/*
	 *  1
 		1 2
 		1 2 3
 		1 2 3 4
 		1 2 3 4 5
	 */
	public static void pattern6(int n) {
		int rows = n;
		for(int i = 1;i<=rows;i++) {
			int cols = i;
			for(int j = 1;j<=cols;j++) {
				System.out.print(j+ " ");
			}
		System.out.println();
		}
	}
	/*
	 *
	 **
	 ***
	 ****
	 *****
	 ****
	 ***
	 **
	 *
	 */
	public static void pattern7(int n) {
		int rows = n;
		for(int i = 1;i<=rows-1;i++) {
			int cols = i;
			for(int j = 1;j<=cols;j++) {
				System.out.print("*");
			}
		System.out.println();
		}
		for(int i = 1;i<= rows;i++) {
			for(int j = 5;j>=i;j--) {
				System.out.print("*");
			}
		System.out.println();
		}
	}
	
	/*
	 * 	  
	 *****
	 ****
	 ***
	 **
	 *
	 */
	public static void pattern8(int n) {
		int rows = n;
		for(int i = rows;i>=1;i--) {
			int space = n - i + 1;
			for(int k = 1;k<=space;k++) {
				System.out.print(" ");
			}
			int cols = i;
			for(int j = 1;j<=cols;j++) {
				System.out.print("* ");
			}
		System.out.println();
		}
	}
	/*
	 * 	  *
		 ***
		*****
	   *******
      *********
      
	 */
	public static void pattern9(int n) {
		int rows = n;
		for(int i = 1;i<=rows;i++) {
			int space = n - i + 1;
			for(int j = 1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int k = 1;k<=2*i-1;k++) {
				System.out.print("*");
			}
		System.out.println();
		}
	}
	/*
	 *********
	  *******
	   *****
	    ***
	     *
	 */
	public static void pattern10(int n) {
		int rows = n;
		for(int i = 5;i>=1;i--) {
			int space = n - i + 1;
			for(int j = space;j>=1;j--) {
				System.out.print(" ");
			}
			for(int k = 2*i-1;k>=1;k--) {
				System.out.print("*");
			}
		System.out.println();
		}
	}
	
	/*
	 * * * * * *
	   * * * *
        * * *
         * *
          *
	 */
	public static void pattern11(int n) {
		int rows = n;
		for(int i = rows;i>=1;i--) {
			int space =n- i + 1;
			for(int j = space;j>=1;j--) {
				System.out.print(" ");
			}
			int cols = i;
			for(int k = cols;k>=1;k--) {
				System.out.print("* ");
			}
		System.out.println();
		}
	}
	/*
	 * * * * * *
	   * * * *
	    * * *
	     * *
	 	  *
	 	  *
	 	 * *
	 	* * *
	   * * * *
	  * * * * *
	 */
	public static void pattern12(int n) {
		for(int i = n;i >= 1;i--) {
			int space = n - i + 1;
			for(int j = space;j>=1;j--) {
				System.out.print(" ");
			}
			for(int k = i;k>=1;k--) {
				System.out.print("* ");
			}
		System.out.println();
		}
		for(int i = 1;i<=n;i++) {
			int space = n - i + 1;
			for(int j = 1;j<=space;j++) {
				System.out.print(" ");
			}
			int cols = i;
			for(int k = 1;k<=cols;k++) {
				System.out.print("* ");
			}
		System.out.println();
		}
	}
	
	/*   *
	    * *
	   *   *
	  *     *
	 *       *
	 *********
	 */
	public static void pattern13(int n) {
		int rows = n;
		for(int i = 1;i<=rows;i++) {
			int space = n - i + 1;
			for(int j = 1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int k = 1;k<=2*i-1;k++) {
				if (k == 1 || k == (2 * i - 1) || i == rows) {
                    System.out.print("*"); 
                } else {
                    System.out.print(" "); 
                }
			}
		System.out.println();
		}
	}
	
	/*
	 * *********
	    *     *
	 	 *   *
	 	  * *
	 	   *
	 */
	public static void pattern14(int n) {
		int rows = n;
		for(int i = 5;i>=1;i--) {
			int space = n - i + 1;
			for(int j = space;j>=1;j--) {
				System.out.print(" ");
			}
			int cols = 2 * i - 1;
			for(int k = cols;k>=1;k--) {
				if (k == 1 || k == (2 * i - 1) || i == rows) {
                    System.out.print("*"); 
                } else {
                    System.out.print(" "); 
                }
			}
		System.out.println();
		}
	}
	
	/*
	    *
	   * *
	  *   *
	 *     *
	*       *
	*       *
	 *     *
	  *   *
	   * *
	    *
	 */
	
	public static void pattern15(int n) {
		int rows = n;
		for(int i = 1;i<=rows - 1;i++) {
			int space = n - i + 1;
			for(int j = 1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int k = 1;k<=2*i-1;k++) {
				if (k == 1 || k == (2 * i - 1)) {
                    System.out.print("*"); 
                } else {
                    System.out.print(" "); 
                }
			}
		System.out.println();
		}
		for(int i = 5;i>=1;i--) {
			int space = n - i + 1;
			for(int j = space;j>=1;j--) {
				System.out.print(" ");
			}
			int cols = 2 * i - 1;
			for(int k = cols;k>=1;k--) {
				if (k == 1 || k == (2 * i - 1)) {
                    System.out.print("*"); 
                } else {
                    System.out.print(" "); 
                }
			}
		System.out.println();
		}
	}
	/*
	 * 1
      1 1
     1 2 1
    1 3 3 1
   1 4 6 4 1
	 */
	
	public static void pattern16(int n) {
		for(int i = 0;i<n;i++) {
			int space = n - i;
			for(int j = 1;j<=space;j++) {
				System.out.print(" ");
			}
			int number = 1;
			for(int k = 0;k<=i;k++) {
				System.out.print(number + " ");
				number = number * (i - k) / (k + 1); 
			}
		System.out.println();
		}
	}
}
