package arrays;

import java.util.*;

public class DuplicateChars {
	public static void main(String[] args){
		String input = "Array";
		int [] array = new int[57];
		//CONVERSTION FROM ARRAY TO INT ARRAY
		char[] charArr= input.toCharArray();
		for(char ch : charArr){
			array[ch - 'A']++;
			//System.out.println(ch + " : " +array[ch - 'A']);
		}
		//FINDING DUPLICATES 
		for(int i=0;i<array.length;i++){
			if(array[i]>0){
				System.out.println(array[i]+ ":"+ (char) (i+65));
			}
		}
	}
}
