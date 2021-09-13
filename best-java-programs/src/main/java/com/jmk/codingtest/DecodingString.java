package com.jmk.codingtest;

/**
 * Every character in the input string is followed by its frequency . Write a
 * function to decrypt the string the find the nth character of the decrypted
 * string. If no character exists at that position then return -1
 * 
 *
 * Example: If the string is "a3b2" then decrypted string will be "aaabb".
 * 
 * String: a2b2c2 Number: 4 Output: b Explanation: The decrypted string of
 * a2b2c2 will be aabbcc hence the 4th character in decrypted string is b.
 * 
 * @author rajivbansal2981
 *
 */
public class DecodingString {
	public static String returnNthString(String str, int nthNumber) {
		String decr_str = "";
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {

			if (Character.isLetter(ch[i])) {
				decr_str = decr_str + ch[i];
			} else {
				for (int j = 1; j < Character.getNumericValue(ch[i]); j++) {
					decr_str = decr_str + ch[i - 1];
				}
			}

		}
		if (decr_str.length() < nthNumber) {
			return "-1";
		} else {
			return decr_str.charAt(nthNumber - 1) + "";
		}
	}

	public static void main(String[] args) {
		System.out.println(returnNthString("a2b2c3", 5));
	}
}
