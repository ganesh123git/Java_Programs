package com.looping;

public class For_nested_loop {
	
	public static void main(String[] args) {
		
		for (int i=1; i<=10; i++) {     //  nested for loop
			
			//for (int j=1; j<=i; j++) {   
			for (int j=1; j<=10; j++) {	 // horizontalla output varum  12324566
			
			
			System.out.print(j +" ");     // 1 2 3 (j) // 1 1 1 (i)
			
			// println ---- print
		}
		System.out.println();
		
	}

	}                   
}


//  first= to print i ( i +" ")
// second=  to print j (j + " ")
// third -  to put j<=i to print 
//for (int j=1; j<=i; j++)  --->  dont change for triangle output