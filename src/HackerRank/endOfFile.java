package HackerRank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class endOfFile {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner input = new Scanner (System.in);
            int i = 1;
            while (input.hasNext() == true) {
                System.out.println(i+" "+input.nextLine());
                i++;
            }
    }
    
}
