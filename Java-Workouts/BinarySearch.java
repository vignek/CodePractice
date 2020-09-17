package java;


import java.util.*;
/**
 *
 * @author vnk4
 */
public class BinarySearch {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int len = sc.nextInt();
        
        int[] a = new int[len];
        
        for (int i = 0; i < a.length; i++){
        
            a[i] = sc.nextInt();
            
        }
        
        Arrays.sort(a);
        
        System.out.println("Enter number to find :");
        int key = sc.nextInt();
        
        int res = binarySearch(key,0,len-1,a);
        
        if (res != -1) {
        System.out.println("Value found @ index :"+res);
        
        }
        else {
        System.out.println("Not Found.");
        }
    }
    
    public static int binarySearch(int key, int lb, int ub, int arr[]) {
    
        int pos = 0;
        int cc = 1;
        
        pos = (lb + ub ) / 2; 
        
        while ((arr[pos]!= key) &&(lb<=ub)) {
            cc++;
            if(arr[pos] > key) {
                ub = pos -1;
            }
            else {
                lb = pos + 1;
            }
            
            pos = (lb + ub) / 2 ;
        }
        if (lb <= ub){
            System.out.println("No of Ops : "+cc);
            return pos;
        }
        else {
            System.out.println("No of Ops : "+cc);
            return -1;
        }
        
        
    }
    
}
