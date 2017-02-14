package interview;

import java.util.*;

public class WordCount {

	public static void main(String[] args) {

		String[] input = {"The boy threw the red ball", "The ball was red.", "the red ball fell down","then the ball bounced","the red ball  is down"};
		
		commonWords(input);

	}

	/*
    Question: Given an array of strings, can you find the top 10 most common words?
    ["The boy threw the red ball", "The ball was red."....]
    the 3
    ball 2
    red 2
    boy 1
    was 1
    threw 1
	 */

	public static void commonWords(String[] str) {
		
		Map<String,Integer> stringsCount = new HashMap<String,Integer>(); 
		for(int j = 0 ; j < str.length;j++) {
			
			String temp = str[j]; // assigning a string in array of strings to a temp variable
			String tempwords[] = temp.split("[[ ]*|[,]*|[\\.]*|[:]*|[/]*|[!]*|[?]*|[+]*]+"); //  regex to handle all special characters
			
			List<String> list = Arrays.asList(tempwords); // array of words in tempwords array

			for(String string: list) { // looping thorough the list 
				
				if(string.length() > 0) { // if the word has value > 0 then
					string = string.toLowerCase();  // normalizing it to lowercase
					Integer count  = stringsCount.get(string); // temp var to count words
					if(count == null ) count = new Integer(0); // if count is null initialize it to 0
					count++; // else add 1 to count.
					stringsCount.put(string,count); // use put method to add string and count
				}
			}
		}
		
		Set<Map.Entry<String, Integer>> output = stringsCount.entrySet(); // printing the map with entryset
		for(Map.Entry<String, Integer> e : output)
			System.out.println(e.getKey()+" "+e.getValue());

		
	}

}