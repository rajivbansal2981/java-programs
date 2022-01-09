package com.jmk.programs;
/**
 * Count pairs of natural numbers with GCD equal to given number
 * 
 * Input : L = 1, R = 11, G = 5
 * Output : 3
 * (5, 5), (5, 10), (10, 5) are three pair having GCD equal to 5 and lie between 1 and 11.
 * So answer is 3.
 * Input : L = 1, R = 10, G = 7
 * Output : 1
 * @author rajivbansal2981
 *
 */
public class CountPairNaturalNumbersEqualGCD {
	// Return the GCD of two numbers.
	public static int gcd(int a, int b)
	{
	    return b > 0 ? gcd(b, a % b) : a;
	}
	 
	// Return the count of pairs
	// having GCD equal to g.
	public static int countGCD(int L, int R, int g) {
	     
	    // Setting the value of L, R.
	    L = (L + g - 1) / g;
	    R = R / g;
	 
	    // For each possible pair check if GCD is 1.
	    int ans = 0;
	    for (int i = L; i <= R; i++)
	    for (int j = L; j <= R; j++)
	        if (gcd(i, j) == 1)
	        ans++;
	 
	    return ans;
	}
	 
	// Driver code
	public static void main(String[] args) {
	     
	    int L = 1, R = 11, g = 5;
	    System.out.println(countGCD(L, R, g));
	}
}
