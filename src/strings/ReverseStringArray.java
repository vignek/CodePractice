package strings;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseStringArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		String str = sc.nextLine();
		//String delimiter = "\\s+";
		String strArray[] = str.split("\\s+");
		System.out.println(strArray.length);
			for(int i = strArray.length-1; i >= 0 ; i-- ){
				
				System.out.print(strArray[i]+" ");
				
			}
			
			sc.close();
		}
}
