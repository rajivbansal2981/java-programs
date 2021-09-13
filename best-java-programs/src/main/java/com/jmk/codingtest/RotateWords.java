package com.jmk.codingtest;

import java.util.Scanner;

/**
 * Love letter: Given a sentence, and a number k which describes how many times each word was rotated from left to right, tell a number of words that remain the same before and after rotation.
 * @author rajivbansal2981
 *
 */
public class RotateWords {
	 //rotate every word of the given string by the given rotation value
    public static String rotate_string (String str, int d) 
    {
      String ans = str.substring (d) + str.substring (0, d);
        return ans;
    }
    public static void rotated (String str, int rotated)
    {
      String[]wordsarr = str.split ("\\s"); // convert string to an array of strings.
      String rotatedarr[] = new String[wordsarr.length]; // to store the rotated array.
      for (int i = 0; i < wordsarr.length; i++)
        {
      rotatedarr[i] = rotate_string(wordsarr[i], wordsarr[i].length () - rotated);
        }
      int count = 0;
      for (int i = 0; i < wordsarr.length; i++)
        {
      if (wordsarr[i].equals (rotatedarr[i]))
        {
          count++;
        }
        }
      System.out.println (count);
    }

    public static void main (String[]args)
    {
      Scanner s= new Scanner(System.in);
      String str= s.nextLine(); //input string
      int rotate_by= s.nextInt(); 
      rotated(str,rotate_by);
    }
}
