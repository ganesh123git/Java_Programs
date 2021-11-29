package com.Exception;

public class Exe_handle {            // throws exception
	
	public static void main(String[] args) throws Throwable {
		
		
		for (int i = 1; i <= 20; i++) {
			if (i==11) {
				System.out.println("hault");
				throw new Exception();
				
				
					
				}
			
			
			System.out.println(i);
		//	System.out.println("all");
	}
	}

}
