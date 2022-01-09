package com.jmk.programs;

import java.util.Arrays;

//Function to decode given array to get back the original array elements
/**
*
Input:  { 3, 4, 5, 5, 6, 7 }
Output: { 1, 2, 3, 4 }
 
 
Input:  { 3, 4, 5, 6, 5, 6, 7, 7, 8, 9 }
Output: { 1, 2, 3, 4, 5 }
 
 
Input:  { 3 }
Output: { 1, 2 } or { 2, 1 } or { 0, 3 } or { 3, 0 }
 
 
Input:  { 3, 4, 5 }
Output: { 1, 2, 3 }

The idea to calculate the first element of the original array by using the following relations
A[0] = (inp[0] + inp[1] - inp[n-1]) / 2
 *
 */
public class DecodeIntegerArray {
	// Function to decode given array to get back the original array elements
    public static void decode(int[] inp)
    {
        int m = inp.length;
 
        // base case
        if (m == 0 || m == 2) {
            return;
        }
 
        // calculate the size of the original array
        int n = (int)(Math.sqrt(8 * m + 1) + 1) / 2;
 
        // create an auxiliary array of size `n` to store elements
        // of the original array
        int[] A = new int[n];
 
        // calculate the first element of the original array
        if (n == 1 || m == 1) {
            A[0] = inp[0];
        }
        else if (n == 2) {
            A[0] = inp[0] - inp[1];
        }
        else {
            A[0] = (inp[0] + inp[1] - inp[n - 1]) / 2;
        }
 
        // calculate the remaining elements of the original array using
        // the first element
        for (int i = 1; i < n; i++) {
            A[i] = inp[i - 1] - A[0];
        }
 
        // print the original array
        System.out.print(Arrays.toString(A));
    }
 
    public static void main(String[] args)
    {
        int[] inp = { 3, 4, 5, 6, 5, 6, 7, 7, 8, 9 };
        decode(inp);
    }
}
