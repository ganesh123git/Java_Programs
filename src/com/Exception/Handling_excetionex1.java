package com.Exception;

public class Handling_excetionex1 {              // null pointer exception
	
	public static void main(String[] args) {
		
		String s = null;
		System.out.println(s);
		
		int l;                      // null iruntha not print length
		
		try {
			l = s.length();    
			// null default value so string la null kodutha athu string kedaiathu
		} catch (Exception e) {
	
		//	e.printStackTrace();
		System.err.println("null pointer eception");//  error msg
		}  
		
		
		
		int c = 50;
		System.out.println(c);
	}

}
