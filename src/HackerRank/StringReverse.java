package HackerRank;

import java.math.*;
import java.util.*;

public class StringReverse {

	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String output = reverse(input);
		
	}

	private static String reverse(String input) {
		String reverse = " ";
		
		if(input.length() <=1) {
			reverse = input;
		} else {
			String[] anArray = input.split("\\s+"); // Regex split
			
			for(String item : anArray) {
				reverse = item +" "+reverse;
			}
		}
		
		return reverse.trim(); // removes leading or trailing spaces 
	}
	
}
