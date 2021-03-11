package com.pawan;

public class StringManipulation {
	public static void main(String arg[]) {
		String input="my_var_args_";
		char arr[]=input.toCharArray();
		String result="";
		for(int i=0; i < arr.length;i++) {
			if(arr[i] == '_') {
				i++;
				if(i>=arr.length) break;
					
				result=result.isEmpty()?String.valueOf(arr[i]).toLowerCase():result+String.valueOf(arr[i]).toUpperCase();
			}else {
				result+=String.valueOf(arr[i]).toLowerCase();
			}
		}
		System.out.printf("result is %15s.", result);
	}
}
