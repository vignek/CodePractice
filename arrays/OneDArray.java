package arrays;

import java.util.*;

// http://tinyurl.com/zsrtnfb

public class OneDArray {

	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();  // Test case
		int n = sc.nextInt(); // Array case length
		int m = sc.nextInt(); // jump length
		
		int arr[] = new int[n];

		for(int i = 0 ; i < arr.length-1; i++) {
			int x ;

			if(i == 0 ) {
				x = sc.nextInt();
				if(x == 0) {
				arr[i] = 0;
				}
				else {
					System.out.println("Error");
				}
				
			}
			else {
				x = sc.nextInt();
				if(x == 0 || x == 1)
					arr[i] = x;
			}

		}

		

	}
}
