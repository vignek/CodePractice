package HackerRank;

import java.util.*;
/**
 *
 * @author vnk4
 */
public class StringRev {
    
    public String reverse(String o) {
        String r ="";
        int l = o.length();
        
        for(int i = l-1 ; i >= 0; i--) {
            r = r + o.charAt(i);
        }
        
        return r;
    }
    
    public static void main(String[] args) {
        
        StringRev one = new StringRev();
        Scanner in = new Scanner(System.in);
        String original  = in.nextLine();
        one.reverse(original);
        
    }
}
