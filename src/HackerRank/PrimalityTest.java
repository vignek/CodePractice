package HackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PrimalityTest {

	public static void main(String[] args) {
		      
			Scanner in = new Scanner(System.in);
		      BigInteger n = in.nextBigInteger();
		      in.close();
		      
		      // Write your code here.
		     String result =  n.isProbablePrime(1)?"Prime":"Not Prime";
		     System.out.println(result);
		}
	}