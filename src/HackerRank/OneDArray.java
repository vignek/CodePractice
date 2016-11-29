package HackerRank;
import java.util.*;
/**
 * Solution to : https://www.hackerrank.com/challenges/java-1d-array-easy
 * @author vnk4
 * O(n^2) solution
 **/
public class OneDArray {
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        int[] anArr = new int[n];
        for(int i = 0; i < n; i++) {
            anArr[i] = in.nextInt();
        }
        int c = 0;
        int x = 0;
        for(int j = 0; j < n; j++) {
            int s = 0;
            for(int k = j; k < n; k++) {
                s = anArr[k]+s;
            
                x = x+1;
                if(s < 0) {
                    c+=1;
                }
            }
        }
        System.out.println(""+c);
        //System.out.println("total contigous sets : "+x);
    }
}
