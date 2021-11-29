package com.Inheritanceclass3;

public class Son extends Father {                   // son extends father
	
	public void property3() {
		
		System.out.println("Bike property");
		
	}
	
	public static void main(String[] args) {    
		
		// Son s = new Son();            // Son extends father
		
	//	s.Property1();
  	//	s.Property2();
	//	s.property3();
		
		Son2 s = new Son2(); 
	//  son2 extends son1  but u put at object son2(same classname)
		
		s.Property1();
		s.Property2();
		s.property4();         //  son2 property to buy
		s.property3();         // son property
				
		
		
	}

}
