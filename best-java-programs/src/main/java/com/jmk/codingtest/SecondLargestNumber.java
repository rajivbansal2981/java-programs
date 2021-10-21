package com.jmk.codingtest;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int array[] = { 59, 11, 3, 4, 50, 69, 7, 8, 9, 0 };

		System.out.println(findSecondLargest(array));
	}

	public static int findSecondLargest(int array[]) {
		int i, first, second;
		int arr_size = array.length;

		// There should be
		// atleast two elements
		if (arr_size < 2) {
			System.out.printf(" Invalid Input ");
			return -1;
		}

		// Sort the array
		Arrays.sort(array);

		// Start from second last element
		// as the largest element is at last
		for (i = arr_size - 2; i >= 0; i--) {
			// If the element is not
			// equal to largest element
			if (array[i] != array[arr_size - 1]) {
				System.out.printf("The second largest " + "element is %d\n", array[i]);
				return array[i];
			}
		}
		return -1;
	}

}
