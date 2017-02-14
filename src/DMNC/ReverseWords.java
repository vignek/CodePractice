package DMNC;

import java.util.*;

// Reverse the words of the given string in place !

// Logic : 
// Reverse all the words in the string 
// Reverse the entire string
// need to debug !! 

public class ReverseWords {

	public static StringBuffer sb = new StringBuffer("Hello World");

	public static void main(String[] args) {

		int i = 0 , j = 0 , w = 0 ; 

		// Loop to reverse the words
		while(i < sb.length()) {

			if(i == 0) 
				w = 0;
			if(sb.charAt(i) == ' ' ||  i == sb.length()-1) {
				j = i;
			}
			else {
				j--;

				System.out.println("---");
				swap(w,j);
				w++;
			}
			i++;
		}

		System.out.println("XXX");
		System.out.println("sb len is "+sb.length());
		
		for( int x = 0 ; x < sb.length();x++) {
			swap(0,sb.length()-1);
			System.out.println("...");
			System.out.println(sb);
		}

	}

	private static void swap(int i, int j) {
		System.out.println("+++");
		while (i < j ) {
			char ch = sb.charAt(i);
			sb.setCharAt(i, sb.charAt(j));
			sb.setCharAt(j, ch);
			i++;
			j--;
		}

	}
}
