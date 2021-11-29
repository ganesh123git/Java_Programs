package com.scanner;

import java.util.Scanner;                   //  practice task

public class Sum_of_Numbers {
	
	public static void main(String[] args) {
		
		int x,y,sum;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the first number:");
		x = s.nextInt();
		System.out.println("Enter the second number:");
		y = s.nextInt();
		
		sum = sum( x, y);
		System.out.println("The sum of two numbers x and y:");	
		
	}
	
	// methods that calculation the sum
	
	public static  int sum(int a, int b) 
		
	
	{
		
		int sum = a+b;
		return sum;
	}

}
