package HackerRank;


import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor{
   public static void main(String[] args){
      
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      while(testCases>0){
         String line = in.nextLine();
         
         	int c = 0;
             Pattern r = Pattern.compile("<(.+?)>([^<]+)</\\1>");
             Matcher m = r.matcher(line);
         
             while(m.find()) {
            	 
            	 	if(m.group(2).length() > 0 ) {
            	 		System.out.println(m.group(2));
            	 		c++;
            	 	}
             }
             if(c==0) System.out.println("None");
         testCases--;
      }
      in.close();
   }
}
