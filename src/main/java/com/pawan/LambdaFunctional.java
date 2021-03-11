package com.pawan;

interface MyInterFace {
	int a=10;
	void show(int i);
	default void shows() {
		System.out.println("All shows");
	}
	
	default void showss() {
		System.out.println("All shows");
	}
}

interface MyInterFaceSecond extends MyInterFace {
	int a=20;
	default void shows() {
		System.out.println(" MyInterFaceSecond All shows "+ a);
	}
	
}

public class LambdaFunctional {
	public static void main(String[] args) {
		MyInterFaceSecond m=i->System.out.println("hellow" + i);
		m.show(100);
		
		m.shows();
		 
	}
	
	
}
