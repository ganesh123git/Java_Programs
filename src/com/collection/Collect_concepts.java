package com.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Collect_concepts {
	
	public static void main(String[] args) {
		
		List<Object> li = new ArrayList<Object>();
		li.add(45);
		li.add("java");
		li.add('a');
		li.add(78);
		li.add(90);
		li.add(40);  // allow duplicate values 
		li.add(40);
		System.out.println(li);
		
		// to insert the element
		li.add(3, 45);          // 0 1 2 3 - 45 add aagum
		System.out.println(li);
		
		// to find size   //  index illama count pannanum
		int b = li.size();
		System.out.println(b);
		
		// to find the value
		//Object o = li.get(3); // li.get after ctrl+2-- to return type
		Object o = li.get(5);   
		System.out.println(o);
		
		// to replace the value
		li.set(5,"ganesh");
		System.out.println(li);
		
		// to remove the particular index
		li.remove(6);
		System.out.println(li);
		
		int io = li.indexOf(45);  // first value one it take
		System.out.println(io);
		
		int ol = li.lastIndexOf(78);  // last value one it take
		System.out.println(ol);
		
		boolean cc = li.contains(100);  // check if or not
		System.out.println(cc);
		

		//li.clear();
		//System.out.println(li);
		
		
		List<Object> li2 = new LinkedList<Object>();
		
		li2.add("ganesh");
		li2.add("Blue");
		li2.add('S');
		li2.add('a');
		li2.add(70);
		li2.add(20);
		li2.add(50);
	
		
		System.out.println(li2);
		
		li.addAll(li2);
		System.out.println(li);
		
		li.retainAll(li2);  // print the commom values
		System.out.println(li);
		
		li.removeAll(li2);
		System.out.println(li);
		
		for (Object object : li2) {
			System.out.println(object);
			
		}
		
		
	}

}
