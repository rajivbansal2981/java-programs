package com.jmk.codingtest;

public class CharArrayToIntArray {

	public static void main(String ar[]) {
		 String raw = "128";

		    int[] num = new int[raw.length()];

		    for (int i = 0; i < raw.length(); i++){
		        num[i] = raw.charAt(i) - '0';
		    }

		    for (int i : num) {
		        System.out.println(i);
		    }
	}
	
}
