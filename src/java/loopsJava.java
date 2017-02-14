package java;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


// reperesenting this a+2^0*b,a+2^0*b+2^1*b,......,a+2^0*b+2^1*b+...+2n−1b using loops

public class loopsJava {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
            Scanner input = new Scanner (System.in);
            int t = input.nextInt();
            
            while (t > 0 ) {
                int a = input.nextInt();
                int b = input.nextInt();
                int n = input.nextInt();
            
                int i ;
                for (i =0; i < n ; i++) {
                    
                    a += (int)(Math.pow(2,i) * b);
                 
                    System.out.print(a+" ");
                }
                    System.out.println(" ");
                
                t--;
            }
    
    }
}
