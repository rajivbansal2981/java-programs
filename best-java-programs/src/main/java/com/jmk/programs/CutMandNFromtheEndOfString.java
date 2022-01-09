package com.jmk.programs;

/**
 * Cut m and n letters from end of string, then find number of turns to get back
 * original string
 * 
Enter the string : arya
Enter the value of m : 1
Enter the value of n :2
AARY
RYAA
ARYA

Output Should be 3
 * @author rajivbansal2981
 *
 */
public class CutMandNFromtheEndOfString {

	public static String shiftString(String str, int shiftCount) {

		String result;

		result = str.substring(str.length() - shiftCount, str.length()) + str.substring(0, str.length() - shiftCount);

		return result;

	}

	public static void cutMAndNFromTheEndOfString(String str, int harryCuts, int potterCuts) {
		int iterations = 0;
		String afterCuts = str;

		while (true) {
			iterations++;
			if (shiftString(afterCuts, harryCuts + potterCuts).equals(str)) {
				iterations++;
				break;
			}

			else if (shiftString(afterCuts, harryCuts).equals(str)) {
				break;
			} else if (shiftString(afterCuts, potterCuts).equals(str)) {
				break;
			}
			afterCuts = shiftString(afterCuts, harryCuts + potterCuts);
			iterations++;
		}

		System.out.println(iterations);
	}

	public static void main(String[] args) {
		cutMAndNFromTheEndOfString("arya", 1, 2);

	}

}
