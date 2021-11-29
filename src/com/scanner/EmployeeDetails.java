package com.scanner;

import java.util.Scanner;

public class EmployeeDetails {
	
	public static void main(String[] args) {
		
	Scanner  s  =  new Scanner(System.in);
	
	System.out.println("empid");
	int a = s.nextInt();
	
	System.out.println("emp name");
	System.out.println("email");
	System.out.println("city");
	String b = s.nextLine();
	String mail = s.nextLine();
	String g = s.nextLine();
	
	System.out.println("phonenum");
	long d = s.nextLong();
	
	System.out.println("salary");
	float e = s.nextFloat();
	
	System.out.println("gender");
	String f = s.next();
	
	
	}
	

}
