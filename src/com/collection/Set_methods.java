package com.collection;

import java.util.Iterator;
//import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
//import java.util.TreeSet;

public class Set_methods {
	public static void main(String[] args) {
		
		//Set<Object> s = new HashSet<Object>(); 
		Set<Object> s = new LinkedHashSet<Object>();
		//Set<Integer> s = new TreeSet<Integer>();   // ascending order
		// integer----. only value be printed
		   // Set (ctrl+space)enter, ref name = new linked(ctrl+space)enter pannanum

	 //Set<String> s  = new TreeSet<String>();
	    s.add(90);  
	    //s.add("jim");
	    //s.add("jam");                 // indexof(), lastindex(),,get() not come
		s.add(30);
		s.add(30);
		//s.add(40.5);         
		s.add(null);   //null  vara kudathu
		s.add(null);// one null value allow pannum linked hash set
	//s.add("java");
	    //s.add('A');
	    s.add(20);
		//s.add(80);
	    //s.add("ding");
	   // s.add("kim");
		
		System.out.println(s);
		
		s.add("gaga");
		System.out.println(s);
		
		int s1 = s.size();
		System.out.println(s1);
		
	
		s.remove(30);
		System.out.println(s);
		
		boolean contains = s.contains(45);  // check if yes or no
		System.out.println(contains);
		
		s.clear();
		System.out.println(s);
		
	Set<Object>  ee  = new LinkedHashSet<Object>();
	    ee.add("gas");
		ee.add(33);
		ee.add(22);
		System.out.println(ee);
		
		ee.addAll(ee);
		System.out.println(ee);
		
		ee.retainAll(ee);
		System.out.println(ee);
		
	//	ee.removeAll(ee);
	//	System.out.println(ee);
		
		
	for (Object obj :ee) {       //  Forward direction la print aagum
		System.out.println(obj);
		
	}	
	Iterator<Object> dd = ee.iterator();
	
	while (dd.hasNext()) {             //  Forward direction la print  aagum
		Object ob = (Object) dd.next();
		System.out.println(ob);
	}
	
	}

}
