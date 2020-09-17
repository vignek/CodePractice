package strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import com.google.common.collect.Multiset.Entry;

public class FirstNotRepeatingChar {

	public static void main(String[] args) {
		
		String st1 = "Hello world";
		System.out.println(getFirstNonRepeatedChar(st1));

		System.out.println(st1.replaceAll("\\s","%20"));
		
		
	}


	public static char getFirstNonRepeatedChar(String str) { 
		
		Map<Character,Integer> counts = new LinkedHashMap<>(str.length()); 
		
		for (char c : str.toCharArray()) { 
			
			counts.put(c, counts.containsKey(c) ? counts.get(c) + 1 : 1); 
		} 
		
		for (Map.Entry<Character, Integer> entry : counts.entrySet()) { 
			
			if (entry.getValue() == 1) { 
				return entry.getKey(); 
			} 
			
		} 
		
		throw new RuntimeException("No Non repeated Character!"); }



}
