package com.pawan.inheritance;

public interface B {
	
	public void unImp(int a);
	
	default void show() {
		System.out.println("Called B");
	}
}
