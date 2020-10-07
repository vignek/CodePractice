package java;



import java.io.*;
import java.util.*;

/**
 *
 * @author vnk4
 */
public class stringTokenizer {
     public static void main(String[] args) 
        {

      
          Scanner scan = new Scanner(System.in);
          String s=scan.nextLine();
          
          StringTokenizer one = new StringTokenizer(s," !,?._'@");
          
            System.out.println(one.countTokens());
          while(one.hasMoreTokens()) {
                    System.out.println(one.nextToken());
        }
   

        }
    
}
