package strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class ReverseWord {

	public static void main(String[] args) {

		String name = "1 no. durga this is " ;
		String[ ] data = name.split(" ");
		String op = " " ;
		for (int i = data.length-1;i >= 0 ;i --){
			op = op+" "+data[ i ] ;  
		} 
		System.out.println(" "+op);
	}	






}