package com.jmk.codingtest;

public class SecondLargestNumber {

	public static void main(String[] args) {
		 int array[] = {59, 11, 3, 4, 50, 69, 7, 8, 9, 0};
		 
		 System.out.println(findSecondLargest(array));
	}
	
	public static int findSecondLargest(int array[]) {
		  int loop, largest, second;

		   if(array[0] > array[1]) {
		      largest = array[0];
		      second  = array[1];
		   } else {
		      largest = array[1];
		      second  = array[0];
		   }

		   for(loop = 2; loop < array.length; loop++) {
		      if( largest < array[loop] ) {
		         second = largest;
		         largest = array[loop];
		      } else if( second < array[loop] ) {
		         second =  array[loop];
		      }
		   }
		   
		   return second;
	}

}
