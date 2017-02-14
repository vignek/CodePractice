package interview;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class NumberCounter {

	static void countNumbers(int[][] arr) {

		System.out.println("array length : "+arr[0].length);

		int[] rc = new int[arr[0].length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.println("J is : "+j);
				System.out.println("Arr value is : "+arr[i][j]);
				rc[i] = arr[i][j];
			}
		}

		for(int x = 0; x < rc.length; x++) {
			System.out.print(rc[x]+" ");
		}


	}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		int _arr_rows = 0;
		int _arr_cols = 0;
		_arr_rows = Integer.parseInt(in.nextLine().trim());  // Gets Rows
		_arr_cols = Integer.parseInt(in.nextLine().trim());  // Gets Columns

		int[][] _arr = new int[_arr_rows][_arr_cols];
		for(int _arr_i=0; _arr_i<_arr_rows; _arr_i++) {
			for(int _arr_j=0; _arr_j<_arr_cols; _arr_j++) {
				_arr[_arr_i][_arr_j] = in.nextInt();

			}
		}

		if(in.hasNextLine()) {
			in.nextLine();
		}
		System.out.println("-----------------");
		countNumbers(_arr);

	}
}