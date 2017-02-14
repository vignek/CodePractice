package strings;

public class StringPermutation {

	public static void main(String[] args) {
		System.out.println(permutation("", "xyz"));
	}

	private static String permutation(String prefix, String str) {

		int n = str.length(); // to get length
		if (str.length() ==0) return prefix;
		else {
			for(int i = 0 ; i <  n ; i++) {	
				permutation(prefix+str.charAt(i),str.substring(0, i)+str.substring(i+1,n));
			}
		}
		return prefix;
	}
	
}

//