package com.looping;

public class For_nested_loop1 {
	
public static void main(String[] args) {
		
		for (int i=10; i>=1; i--) {     //  nested for loop
			
			for (int j=1; j<=i; j++) {     
			
			System.out.print("*" +" ");     // 1 2 3 (j) // 1 1 1 (i)
			System.out.print(i +" ");
			}
		System.out.println();
		}
    }

}

//first= to print i ( i +" ")
//second=  to print j (j + " ")
//third -  to put j<=i to print 
