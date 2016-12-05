package HackerRank;

import java.util.*;

public class ReverseCharString {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String reverse = "";
		
		if (input.isEmpty() || input == null ) {
			System.out.println("Error !");
		} else if (input.length() <=1) {
			reverse = input;
			System.out.println(reverse);
		} else {
			for (int i = input.length()-1; i >=0; i--) {
				reverse = reverse + input.charAt(i);
			}
			System.out.println(reverse);
		}
	}
}
