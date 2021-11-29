package com.looping1;

import java.util.Scanner;

public class If_ifelse_else {      // rough understanding program only not output

	public static void main(String[] args) {
		
		int pen =10;
		int specialpen =20;
		int cost;
		
		Scanner  s = new Scanner(System.in);
		
		cost = s.nextInt();
		if (cost>specialpen) {    // cost >20
			System.out.println("you can buy the pen");
		}
		else if (cost>pen) {    // cost >10
			System.out.println("you have less money to buy the pen");
			System.out.println("you have" +cost);
		}
		
		else {
			System.out.println("you have less money to buy the pen");// -----> ouput la varum
		}
		
		
		
	}
}
