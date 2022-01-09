package com.jmk.codingtest;

public class CountWordOccurrence {

	public static int countOccurrences(String str, String word) {
		// split the string by spaces in a
		String a[] = str.split(" ");

		// search for pattern in a
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (word.equals(a[i]))
				count++;
		}

		return count;
	}

	// Driver code
	public static void main(String args[]) {
		String str = "GeeksforGeeks A computer science portal for geeks ";
		String word = "portal";
		System.out.println(countOccurrences(str, word));
	}

}

