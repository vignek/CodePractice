package DMNC;

import java.util.*;

public class PrintUnqiueChar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.next();

		StringBuilder sb = new StringBuilder();
		ArrayList<Character > x = new ArrayList<Character>();

		for(char c : input.toCharArray()) {

			if(!x.contains(c)) {
				x.add(c);
				sb = sb.append(c);
			}
		}
		System.out.println(sb);

		int keys;
		Hashtable<Integer,String> name = new Hashtable<Integer,String>();

		name.put(1, "Ann");
		name.put(2,"Sam");
		name.put(3, "Ram");

		for(Map.Entry m: name.entrySet()) {
			System.out.println(m.getKey()+" : "+m.getValue());
		}
	}
}

// space not handled