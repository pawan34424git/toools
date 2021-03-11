package com.pawan.inheritance;

public interface A {
	public void unImp(int a);

	default void show() {
		System.out.println("Called A");
	}
}
