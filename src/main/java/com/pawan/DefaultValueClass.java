package com.pawan;

public class DefaultValueClass {

	public static void main(String[] args) throws CloneNotSupportedException {

		NonTest2 aa = new NonTest2(10);
		NonTest2 bb=(NonTest2) aa.clone();
		aa.ccccc();
		
		System.out.println(bb instanceof NonTest);
	}

}

class NonTest2 extends NonTest {

	public NonTest2(int a) {
		super(a);
	}

	protected void ccccc() {
		System.out.println("NonTest2 ccccc");

	}

}

class NonTest extends Test {

	public NonTest() {
		super(10);
	}

	public NonTest(int a) {
		this();
		i = a;
	}

	int i = 10;

	void aass() {
		System.out.println("ssss");
	}

	void bbbb() {
		ccccc();

	}

	protected void ccccc() {
		System.out.println("NonTest ccccc");

	}


}

abstract class Test implements Cloneable {

	public Test(int a) {
		System.out.println("test" + a);
	}

	int i = 20;

	abstract void bbbb();

	void aa() {
		System.out.println("ssss");
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
