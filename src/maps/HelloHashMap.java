package maps;

import java.util.*;

public class HelloHashMap {

	public static void main(String[] args) {
	
		Map<String,String> phonebook = new HashMap<String,String>();
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t>=0) {
			System.out.println("Enter Key and Value");
			phonebook.put(sc.next(),sc.next());
			t--;
		}
		
		Set<String> keys = phonebook.keySet();
		for(String i : keys) {
			System.out.println(i+" : "+phonebook.get(i));
		}
		
		
		

		Set<Map.Entry<String, String>> value = phonebook.entrySet();
		for(Map.Entry<String, String> e: value) {
			
		}
		
		
	}

}
