package strings;

import java.util.Scanner;

public class RevStringArray1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		String input = sc.nextLine();
		
		char[] inparr = input.toCharArray();
		
		int left = 0 ;
		int right =  inparr.length-1;
		
		for(left = 0 ; left < right ; left++ , right--) {	
			// Swap
			char temp = inparr[left];
			inparr[left] = inparr[right];
			inparr[right] = temp;

		}
		for(int i = 0 ; i <inparr.length; i++) {
			System.out.print(inparr[i]);
		}
		
		sc.close();
	}
	
	
}
