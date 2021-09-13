package com.jmk.codingtest;

import java.util.Scanner;

/**
 * Permutation such that no element appears in its original position
Input: n = 2
Output: 1
For two elements say {0, 1}, there is only one 
possible derangement {1, 0}

Input: n = 3
Output: 2
For three elements say {0, 1, 2}, there are two 
possible derangements {2, 0, 1} and {1, 2, 0}

Input: n = 4
Output: 9
For four elements say {0, 1, 2, 3}, there are 9
possible derangements {1, 0, 3, 2} {1, 2, 3, 0}
{1, 3, 0, 2}, {2, 3, 0, 1}, {2, 0, 3, 1}, {2, 3,
1, 0}, {3, 0, 1, 2}, {3, 2, 0, 1} and {3, 2, 1, 0}

 */
public class SelectiveArrangementsOrCountDerangements {

	// Approach 1 Function to count Derangements
    public static int countDer(int n)
    {
        // Base cases
        if (n == 1) return 0;
        if (n == 2) return 1;
         
        // countDer(n) = (n-1)[countDer(n-1) + der(n-2)]
        return (n - 1) * (countDer(n - 1) +
                          countDer(n - 2));
    }
    
    // Approach 2: Function to count derangements
    static int countDerangements(int n)
    {
        // Create an array to store
        // counts for subproblems
        int der[] = new int[n + 1];
     
        // Base cases
        der[1] = 0;
        der[2] = 1;
     
        // Fill der[0..n] in bottom up
        // manner using above recursive
        // formula
		for (int i = 3; i <= n; ++i) {
			der[i] = (i - 1) * (der[i - 1] + der[i - 2]);
		}
     
        // Return result for n
        return der[n];
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n to count number: ");
		int n = sc.nextInt();
		System.out.println( "Count of Derangements is "
                +countDerangements(n));


	}

}
