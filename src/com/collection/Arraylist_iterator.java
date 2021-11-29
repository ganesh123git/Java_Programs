package com.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Arraylist_iterator {   //iterator
	
	public static void main(String[] args) {
		
		
		List<Object> lo = new ArrayList<Object>();
		
		lo.add(45);
		lo.add("java");
		lo.add('a');
		lo.add(75);
		lo.add(40);
		lo.add(34);
		lo.add(34);
		lo.add("itreate");
		
		System.out.println(lo);
		
		ListIterator<Object> l = lo.listIterator();
		/*while (en.hasMoreElements()) {
			type type = (type) en.nextElement();
			
		}*/
		
		while (l.hasNext()) {                    // Forward direction
			Object o = (Object) l.next();
			
			System.out.println(o);
		}
		while (l.hasPrevious()) {        // Backward direction
			Object o1 = (Object) l.previous();
			System.out.println(o1);
		}
	}

}
