package com.jmk.codingtest;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWords {
	public static void main(String[] args) {

		String string = "Big black bug bit a big black dog on his big black nose";

		Set<String> duplicateWords = new HashSet<>();

		// Converts the string into lowercase
		string = string.toLowerCase();

		// Split the string into words using built-in function
		String words[] = string.split(" ");

		System.out.println("Duplicate words in a given string : ");
		for (int i = 0; i < words.length; i++) {
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					duplicateWords.add(words[i]);
				}
			}

		}
		
		duplicateWords.stream().forEach(word->System.out.println(word));
	}
}

