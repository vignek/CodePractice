package HackerRank;

import java.math.*;
import java.util.*;

public class StringReverse {

	public static void main (String[] args) {
	
	    //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();
      	
      	// Did not undestand this part. - START
    	Arrays.sort(s, 0, n, new Comparator<String>() {

	        public int compare(String s1, String s2) {

	            BigDecimal bd1 = new BigDecimal(s1);
	            BigDecimal bd2 = new BigDecimal(s2);

	            return bd1.compareTo(bd2) == 1 ? -1:bd1.compareTo(bd2) == -1 ? 1:0;                
	        }
	    });
    	// Did not undestand this part. - END
      	
    	
      	 //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
		
	}
}
