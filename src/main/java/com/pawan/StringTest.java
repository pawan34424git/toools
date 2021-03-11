package com.pawan;

public class StringTest {
	public static void main(String[] args) {
		String s1 = "Sharma is a good player";  
        String s2 = new String("Sharma is a good player"); 
        System.out.println(s1 == s2);  
        System.out.println(s1 == s2.intern());  
        
        String aa="a:b:c::d:";
        System.out.println(aa);
        print(aa.split(":"));
        print(aa.split(":",1));
        print(aa.split(":",2));
        print(aa.split(":",3));
        print(aa.split(":",4));
        print(aa.split(":",5));
        print(aa.split(":",6));
        print(aa.split(":",7));
//        print(aa.split(":",-1));
//        print(aa.split(":",-2));
//        print(aa.split(":",-3));
	}
	
	static void print(String arr[]) {
		System.out.print(arr.length+" -> ");
		for (String string : arr) {
			System.out.print("["+string+"]");
		}
		System.out.println();
	}
}
