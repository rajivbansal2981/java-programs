package com.jmk.test;


/**
 * 
[[1,3,5,7]
[2,4,6,8]
[10,11,13,15]]
 * @author rajivbansal2981
 *
 */
public class Test1 {

	public static void main(String args[]) {
		int searchElement=6;
		int array[][] = new int[][]{{1,3,5,7},{2,4,6,8},{10,11,13,15}};
		int i =0,j=3;
		/*
		 * for (int j = 0; j < array[j].length; j++) { if (array[i][j] == searchElement)
		 * { System.out.println("Found the element at location" + i + "," + j); } }
		 */
		while (i < array.length) {

			if (searchElement <= array[i][j]) {
				if(searchElement==array[i][j]) {
					System.out.println("Element Found: "+searchElement+ "at" +i+","+j);
				}
				j--;

			}else {
				i++;
			}
			
			
		}
	}
	
}
