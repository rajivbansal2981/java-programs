package com.jmk.codingtest;


/**
* Java Program to find sum of square of first n
* natural numbers
* @author rajivbansal2981
*
*/
public class SumOfSquaresFirstNaturalNumbers {

	// Approach 1: Return the sum of square of first n natural numbers
    public static int squaresum(int n)
    {
        return (n * (n + 1) * (2 * n + 1)) / 6;
    }
    
    //Approach2: Return the sum of square of first n natural numbers
    public static int squaresumApproach2(int n)
    {
        // Iterate i from 1 and n
        // finding square of i and add to sum.
        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum += (i * i);
        return sum;
    }
  
    // Driven Program
    public static void main(String args[])
    {
        int n = 5;
        System.out.println(squaresum(n));
    }
}
