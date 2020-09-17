package java;
import java.util.*;

public class pali {
 
    
    
    public static boolean isPali(String s ) {

        char pal[] = s.toCharArray();
        
        int len = pal.length;

        for (int i = 0 ; i < pal.length / 2; i++ ) {
           //checking the 1st element with the last element
            if (pal[i] != pal[len - 1]) {
            
                return false;
            } 
         len--;   
        }
            return true;
    } 
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner (System.in);
        String s = sc.next();
        
        boolean result = isPali(s); 
        System.out.println(""+result);
    }

}
