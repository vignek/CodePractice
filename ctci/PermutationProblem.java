package ctci;

import java.util.*;

public class PermutationProblem {	
	
	public static boolean checkMaxOneOdd(int[] table) {
		boolean foundOdd = false;
		for (int count : table) {
			if (count % 2 == 1) {
				if (foundOdd) {
					return false;
				}
				foundOdd = true;
			}
		}
		return true;
	}

	
	public static boolean isPermutationOfPalindrome(String phrase) {
		int[] table = Common.buildCharFrequencyTable(phrase);
		return checkMaxOneOdd(table);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String pali = sc.next();
		System.out.println(isPermutationOfPalindrome(pali));
	}
}
