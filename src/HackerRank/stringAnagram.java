package HackerRank;



import java.util.*;

/**
 *
 * @author vnk4
 */
public class stringAnagram {
    
    
    static boolean isAnagram(String A, String B) {
    
        A.toLowerCase();
        B.toLowerCase();
        char a[] = A.toCharArray();
        char b[] = B.toCharArray();
       
        Arrays.sort(a);
        Arrays.sort(b);
       
        return Arrays.equals(a, b);
      
   
   }
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
        
    }
    
}
