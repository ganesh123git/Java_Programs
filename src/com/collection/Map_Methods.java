package com.collection;

import java.util.Collection;
//import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
//import java.util.Map.Entry;
import java.util.Set;

public class Map_Methods {
	
	public static void main(String[] args) {
		
		Map<Integer, Object> m = new HashMap<Integer, Object>();
		
		m.put(1, "java");    
		m.put(2, "jim");
		m.put(2, "jam");
		m.put(4, 40.2);
		m.put(8, 70);
		m.put(5, 70);
		m.put(6, 10);
		m.put(9, "H");
		m.put(null, 40);
		m.put(null, 70); 
		m.put(3, null);
		m.put(1, null);
		m.put(null, 60);      // key- duplicate null print pannum
		m.put(6, 15);         // value- allow duplicate and null
		m.put(1, 10);
		System.out.println(m);     // output la curly bases important
		
		int s1 = m.size();      //   return type  (ctrl+2) na int, string, object varum
		System.out.println(s1);
		
        Object o = m.get(4);   // return type( ctrl+2)
	    System.out.println(o);

		// Set<Integer> ks = m.keySet(); // it not allow duplicate value
		Set<Integer> r = m.keySet();
		System.out.println(r);

		Collection<Object> v = m.values();
		System.out.println(v);

		boolean cv = m.containsKey(3);
		System.out.println(cv);

		boolean ck = m.containsValue(90);
		System.out.println(ck);

		Set<Entry<Integer, Object>> es = m.entrySet();
		System.out.println(es);
		// output la square bracket change aagum

		// for each loop use
		for (Entry<Integer, Object> entry : es) {
			System.out.println(entry);
		}
		
	}
}

