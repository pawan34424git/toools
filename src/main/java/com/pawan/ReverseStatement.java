package com.pawan;

import java.util.ArrayList;
import java.util.List;

public class ReverseStatement {

	public static void main(String[] args) {
		String st = "My Name is Pawan";
		System.out.println(st);
		reverse(st);
		reverseWord(st);
	}

	static void reverse(String st) {

		String result = "";

		for (int i = st.length() - 1; i > -1; i--) {
			result += st.charAt(i);
		}

		System.out.println(result);
	}
	
	static void reverseWord(String st) {

		List<String> result  = new ArrayList<>(st.length()); 
		int wordLenth=0;
		for (int i = st.length() - 1; i > -1; i--) {
			char c=st.charAt(i);
			if(c==' ') {
				result.add(" ");
				wordLenth=result.size();
			}else {
				result.add(wordLenth, String.valueOf(c));
			}
		}

		System.out.println(String.join("",result));
	}
}
