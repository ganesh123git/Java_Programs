package com.Inheritanceclass3;

public class Greentechnology extends GreenInstitute {  // son extends father
	
	// extends -- keyword 
public void course3() {          // property3
	
	System.out.println("python");
}

public static void main(String[] args) {
	
	// classname refname = new classname

	Greentechnology2 g = new Greentechnology2();
	// son2 s = new son2();
	g.course1();
	g.course2();
	g.course3();
	g.course4();
	
	

}
}