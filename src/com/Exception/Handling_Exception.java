package com.Exception;

public class Handling_Exception {                   // Arthmetic exception
	public static void main(String[] args) {
	
		int a = 10;
	//	System.out.println(10/0);
	//	int b =0;
		try {                       
			System.out.println(10/0);
		} catch (Exception e) { // java.lang.Exception or Exception

			
		//  e.printStackTrace();
	//	System.out.println(e);
			System.err.println("Arithmetic Exception"); // exception name ah msg ah solrom
			
			
		}finally {          // finally block use pannanumna try & catch use pannanum
			System.out.println("This is important");
		}
			
		int c = 50;
		System.out.println(c);
		
	}
	
}

// select error sentence-- then right click--  sorroundwith click---
// --try click
