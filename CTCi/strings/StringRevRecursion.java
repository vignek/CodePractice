package strings;
import java.util.Scanner;

public class StringRevRecursion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
	
		System.out.println(Stringrev(input));
	
	}
	
	public static String Stringrev (String str) {
	
		String rev = "";
	
		if(str.length()== 0 ) {
			return str;
		} else {
			return rev = rev + str.charAt(str.length()-1) + Stringrev(str.substring(0, str.length()-1));
		}
		
	}
	
}