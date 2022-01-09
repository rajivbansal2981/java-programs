package com.jmk.codingtest;

public class TwoWordsAreEqual {

	public static void main(String[] args) {
		String word1="Madam";
		String word2="madaM";
		
		int word1AsciiValue=0;
		for(int i=0;i<word1.length();i++) {
			word1AsciiValue=word1AsciiValue+word1.charAt(i);
		}
		
		int word2AsciiValue=0;
		for(int i=0;i<word1.length();i++) {
			word2AsciiValue=word2AsciiValue+word2.charAt(i);
		}
		
		System.out.println("Ascii Value of word1:"+word1AsciiValue);
		System.out.println("Ascii Value of word2:"+word2AsciiValue);
		if(word1AsciiValue==word2AsciiValue) {
			System.out.println("Ascii Value of two words are equal");
		}else {
			System.out.println("Ascii Value of two words are not equal");
		}
		
	}

}

