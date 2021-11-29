package com.interface1;
                                    // class 7
public class Folder implements FB,Mail{     // implements---keyword
	
	@Override
	public void userid2() {
		
		// TODO Auto-generated method stub
		System.out.println("interface");
	}
	
	@Override
	public void pswd2() {
		// TODO Auto-generated method stub
	System.out.println("inter123@1");	
	}
	
	@Override
	public void userid1() {
		// TODO Auto-generated method stub
	System.out.println("javainterface");	
	}
	
	@Override
	public void pswd1() {
		// TODO Auto-generated method stub
		System.out.println("1213#abcd");
	}

	public static void main(String[] args) {
		Folder f = new Folder();
		f.userid1();
		f.pswd1();
		f.userid2();
		f.pswd2();
	}

}
