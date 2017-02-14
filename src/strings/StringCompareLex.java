package strings;

import java.util.Arrays;
import java.util.Scanner;

public class StringCompareLex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int len = sc.nextInt();

		
		int n = input.length();
		
		char[] x  = new char[n];
		Arrays.sort(x);
		
		String minSubStr = input.substring(0, len);
		String maxSubStr = input.substring(0,len);
		for(int i = 0, j =3; i <= n-3 && j<=n; i++,j++) {
			String sub = input.substring(i,j);
			if(sub.compareTo(minSubStr) <0) {
				minSubStr = sub;
			}
			if(sub.compareTo(maxSubStr)>0) {
				maxSubStr = sub;
			}
		}
	System.out.println(minSubStr);
	System.out.println(maxSubStr);
	
	}
}