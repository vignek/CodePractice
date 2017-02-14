package strings;



public class StringPremutationTest { 
	public static void main(String args[]) { 
		permutation("123");
	}
	public static void permutation(String str) { 
		permutation("", str); 
	}

	private static void permutation(String prefix, String str) {
		int n = str.length();
		if (n == 0) System.out.println("RESULT : "+prefix);
		else {
			for (int i = 0; i < n; i++) {
				System.out.println("prefix : "+prefix);
				System.out.println("str.charAt(i) :"+str.charAt(i));
				System.out.println("str.substring(0, i) : "+str.substring(0, i));
				System.out.println("str.substring(i+1, n): "+str.substring(i+1, n));
				System.out.println("------------");
				permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
			}
		}
	}
}


