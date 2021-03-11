package com.pawan.inheritance;

public class SupSub implements A,B{

	String supSub="SupSub";
	
	@Override
	final public void unImp(int a) {
		System.out.println("Called unImp  :: "+supSub);		
	}

	@Override
	public void show() {
		System.out.println("Called SupSub");
		A.super.show();
		B.super.show();
	}


}
