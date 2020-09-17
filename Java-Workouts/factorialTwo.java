package java;
import java.util.*;

public class factorialTwo {
    
     public static int factorialOne(int n) {

       if(n == 0) {
           return 1;
       }
       
       int F = n * factorialOne(n-1);
       
       return F;
       
   } 
     
     public static void main(String args[]) {
         
         Scanner input = new Scanner(System.in);
         int n = input.nextInt();
         
         int res = factorialOne(n);
         
         System.out.println(""+res);
         
     }

}
