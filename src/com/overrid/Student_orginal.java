package com.overrid;     // class  5

public class Student_orginal extends Teacher_orginal{       //  class name are different

	@Override      // annotations
	public void mark1(int a) {                  //mark1 ctrl+spacebar  to override
		// TODO Auto-generated method stub
		super.mark1(a);             // super---keyword      its denote parent class
	}
	
	@Override
	public void subject1(String b) {
		// TODO Auto-generated method stub
		super.subject1(b);
		System.out.println("another name is mahematics");
	}
	@Override
		public void percentage(double c) {
			// TODO Auto-generated method stub
			super.percentage(c);
			System.out.println("low percentage");
		}
	
	public static void main(String[] args) {
		Student_orginal s = new Student_orginal();
		s.mark1(90);
		s.subject1("maths");
		s.percentage(22);
		
		
	}
}
