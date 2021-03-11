package com.pawan;

interface M<T> {

}

class MyGenA {
	public void hello() {
		System.out.println("hellow aaa");
	}
}

class MyGenB {
	public void helloBB() {
		System.out.println("hellow BB");
	}
}

class MyGen {

	static <aaa extends Object> aaa perform(aaa t) {

		return t;
	}
}

public class GenricClassCode {
	public static void main(String[] args) {
		MyGen.perform(new MyGenA()).hello();
		
		MyGen.perform(new MyGenB()).helloBB();
	}
}
