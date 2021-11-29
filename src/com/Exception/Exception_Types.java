package com.Exception;

import java.util.Scanner;

public class Exception_Types {
	
	public static void main(String[] args) {
		
		// Arithmetic Exception
		
	//    int a = 1;
	//    System.out.println(0/a);
	//     int a= 12;
	//     System.out.println(a/0);
		
		// Null pointer exception
		
//		String s =null;
//		System.out.println(s);
//		
//		String up = s.toUpperCase();
//		System.out.println(up);
//		
		//  Input mismatch exception
	
//	Scanner s = new Scanner(System.in);
//	System.out.println("Enter the value");
//	int nextInt = s.nextInt();
	
	// Array index out of bound exception
		
//		int[] a = new int[3];
//		a[0]=10;
//		a[1] = 40;
//		a[2] = 50;
//		a[1] = 30;
//		a[1] = 60;
//		
//		// System.out.println(a[1]);
//		System.out.println(a[3]);
		
//		String index out of bound exception
		
//		String s = "Classmate";
//				System.out.println(s);
//		System.out.println(s.length());
//		char ca = s.charAt(9);
//		System.out.println(ca);
//		
//	
//	// Number format exception
	//	String s = "4567";
		String s = "4567k";
		
		// parseInt()-------> string convert into int
	 int p = Integer.parseInt(s);
	 System.out.println(p);
		
	
	
	}
	

}
