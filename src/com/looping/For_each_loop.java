package com.looping;


public class For_each_loop {

	public static void main(String[] args) {
		
		//  0 > 5;
		for(int initial = 6; initial > 0; initial--) {   // int i =6
			
			System.out.println("for loop");  // 6 times print aagum
		}
		
		
		
		// FOR EACH LOOP ----use array
		String names[] = {"ganesh", "velli", "panner"};// index --0,1,2
		//System.out.println(vegetables);
		
		for (int i = 2; i < names.length; i++) {  // i=1 pota carrot, beans print aagum
			//0<length-- mmonumeya print aagum
			System.out.println(names[i]);
		
		}
			
			for (int j = names.length-1; j > 0; j--) {
				System.out.println(names[j]);
				
				
			}
			
  	// FOR EACH LOOP
		
		for (String string : names) {  //full ah print aagum
			System.out.println(string);
			
			
		}
		
	}
	
}
