package com.jmk.codingtest;

import java.util.Scanner;

public class FactorialProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n to compute the nth prime number: ");
		int num = sc.nextInt();
		System.out.println("Value of nth prime: " + findFactorial(num));
	}
	
	public static int findFactorial(int num) {
		int fact=1;
		for(int i=num;i>=1;i--) {
			fact=fact*i;
		}
		return fact;
	}
}
