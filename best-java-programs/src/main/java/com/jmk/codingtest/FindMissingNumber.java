package com.jmk.codingtest;

import java.util.Arrays;

/**
 * Sort the array. Numbers are Integer. And in the place of missing there would be default value 0.
 *	We can iterate the array. Can take the zero's place, and the number before and after.
 * @author rajivbansal2981
 *
 */
public class FindMissingNumber {

	public static void main(String[] args) {
		int[] intArray=new int[]{5,1,0,2,7,3,8,10,9,6};
		Arrays.sort(intArray);
		for(int i=1;i<intArray.length;i++){
			if(intArray[i]!=i){
				System.out.println("Missing Element is: "+i+" at index of: "+i);
				break;
			}
		} }


}

