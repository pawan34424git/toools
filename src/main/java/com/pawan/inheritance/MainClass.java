package com.pawan.inheritance;

public class MainClass {
	public static void main(String[] args) {
		SupSub s=new SupSubChild();
		s.show();
		s.unImp(10);
		System.out.println(s.supSub);
	}
}
