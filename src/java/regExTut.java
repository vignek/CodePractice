package java;


import java.util.Scanner;
import java.util.regex.*;

public class regExTut
{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      while(testCases>0){
         String pattern = in.nextLine();
         try {
        	 Pattern x = Pattern.compile(pattern);
        	 System.out.println("Valid");  
         }
         catch (PatternSyntaxException exception){
        	 System.out.println("Invalid"); 
         }
         testCases--;
      }
   }
}
