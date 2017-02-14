package java;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author vnk4
 */
public class RandomNumber {
    
    public static void main(String[] args) {
        
        Random a = new Random();
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        for(int i = 0; i < t; i++) {
            System.out.println(""+a.nextInt(10));  
        }
        
    }
    
}
