package com.jmk.codingtest;

public class RotateWordInSentence {

	private static String reverseWord(String word) {
		String reverseWord="";
		for(int i=word.length()-1;i>=0;i--) {
			reverseWord=reverseWord+word.charAt(i);
		}
		return reverseWord;
	}
	
	public static void main(String[] args) {
		String sentence = "Welcome to the World";

		String reverseSentence="";
		String words[] = sentence.split(" ");
		for(int i=0;i<words.length;i++) {
			reverseSentence=reverseSentence+" "+reverseWord(words[i]);
		}

		//emocleW ot ihcatiH
		System.out.println(reverseSentence);

	}

}
