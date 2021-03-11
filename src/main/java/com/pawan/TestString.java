package com.pawan;

public class TestString {
	public static void main(String[] args) {
		String str3=new String("Pawan").intern();
		String str1=new String("Pawan").intern();
		String str2="Pawan";
		
		System.out.println("str1 == str2 "+str1 == str2);
		
		System.out.println("str1 == str3 "+str1 == str3);
	}
}
