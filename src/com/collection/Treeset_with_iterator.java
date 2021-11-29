package com.collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Treeset_with_iterator {
	
	
	public static void main(String[] args) {
		
		Set<String> s = new TreeSet<String>();// sting---.only names be printed
		
		s.add("jim");
		s.add("jam");
		s.add("dong");
		//s.add(40.5);
		//s.add(30);
		//s.add(null);
		//s.add(null);
		//s.add('a');
		s.add("java");
		s.add("ding");
		//s.add("dang");
		System.out.println(s);
		
		Iterator<String> i = s.iterator();
		//while (i.next() != null) {                    
			// while ctrl+space = iterate with iterate
			//String string = (String) i.next();
		while (i.hasNext()) {                    //hasnext----.forward directionla print aagum
			String st = (String) i.next();
			
	System.out.println(st);    // small letter(string)
			
		}
		
		
	}

}
