package strings;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramTest {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			String x = sc.next();
			String y = sc.next();
			
			char[] x1 = x.toCharArray();
			char[] y1 = y.toCharArray();
			
			Arrays.sort(x1);
			Arrays.sort(y1);
			
			if(Arrays.equals(x1, y1)) {
				System.out.println("Anagram");
			}
			else {
				System.out.println("Not Anagram");
			}
			
			sc.close();
	}

}
