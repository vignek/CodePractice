package HackerRank;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
/**
 *
 * @author vnk4
 */
public class stringOneoOne {
    
    public static void main(String[] args) {   
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        
        int Alen = A.length();
        int Blen = B.length();
        
        int c = Alen + Blen;
        
        String compRes ="";
        int comp = A.compareTo(B);
        
        if (comp == 1) {
             compRes = "Yes";
        }
        else if (comp == -1) {
            compRes = "No";
        }
        else {
            compRes = "";
        }
        
        
        char[] Aarr = A.toCharArray();
        char[] Barr = B.toCharArray();

        Aarr[0] = Character.toUpperCase(Aarr[0]);
        Barr[0] = Character.toUpperCase(Barr[0]);
        
        String aNew = new String(Aarr);
        String bNew = new String(Barr);
        
        System.out.println(""+c);
        System.out.println(""+compRes);
        System.out.println(aNew+" "+bNew);
    }
    
}
