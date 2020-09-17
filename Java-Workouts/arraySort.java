package java;
import java.util.*;

public class arraySort {
    
    
    public int[] aSort(int a[]) {
        
        int temp = 0;
        
        // Exchange sorting - o(n2)
        for(int j = 0; j< a.length; j++) {
            for(int k = j + 1 ; k < a.length; k++) {
                
                if (a[j] > a[k]){
                    temp = a[j];
                    a[j] = a[k];
                    a[k] = temp;
                }
            }
        }
        
        return a;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int len = sc.nextInt();
        int a[] = new int[len];
        
        for (int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }
        
        arraySort foo = new arraySort();
        foo.aSort(a);
        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j]);
            System.out.print(" ");
        }
        System.out.println("\nmin    :"+a[0]);
        System.out.println("max    :"+a[len-1]);
    }
    
}
