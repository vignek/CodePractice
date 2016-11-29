package HackerRank;


import java.util.Scanner;


public class fiboExample {
//
    private fiboExample() {
        
    }
    
    public int recFibo(int n) {
    
        if (n <= 1) {
            return 1;
        }
        
        return recFibo(n-1) + recFibo(n-2);
    }
    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        
        fiboExample one = new fiboExample();
        System.out.print(one.recFibo(x));
           
    }
    
}
