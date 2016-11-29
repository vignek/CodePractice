package Other.benfords;
import java.io.*;

public class Deviant {
	
	public static void main (String[] args) {
		
		int t_count  = 0; 
		int c_count = 0; 
		int d_count = 0 ;
		double c_1 = 0, c_2 = 0, c_3 = 0, c_4 = 0, c_5 = 0, c_6 = 0, c_7 = 0, c_8 = 0, c_9 = 0;
		
		try {
			// Opening the file 
			FileInputStream fstream = new FileInputStream("/Users/vnk4/Documents/workspace3/javaworkouts/src/benfords/benford-bad.txt");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			
			String Str_1;
			while ((Str_1 = br.readLine()) != null) {	
				int j = Integer.parseInt((Str_1).substring(0, 1));
				int i = j;
				
				if(i == 1 ) {
					c_1= c_1+1;
				}
				else if(i == 2 ) {
					 c_2= c_2+1;	
				}
				else if(i == 3 ) {
					 c_3= c_3+1;
				}
				else if(i == 4 ) {
					 c_4= c_4+1;
				}
				else if(i == 5 ) {
					 c_5= c_5+1;	
				}
				else if(i == 6 ) {
					 c_6= c_6+1;
				}
				else if(i == 7 ) {
					 c_7= c_7+1;
				}
				else if(i == 8 ) {
					 c_8= c_8+1;
				}
				else if(i == 9 ) {
					 c_9= c_9+1;
				}
				
				t_count = t_count + 1;
			
			}	
			
				// convert counted no to percentage value
				// System.out.println(""+t_count);
				
				 c_1 = (double) (c_1 / t_count) * 100;
			
				 c_2 = (double) (c_2 / t_count) * 100;
				 c_3 = (double) (c_3 / t_count) * 100;
				 c_4 = (double) (c_4 / t_count) * 100;
				 c_5 = (double) (c_5 / t_count) * 100;
				 c_6 = (double) (c_6 / t_count) * 100;
				 c_7 = (double) (c_7 / t_count) * 100;
				 c_8 = (double) (c_8 / t_count) * 100;
				 c_9 = (double) (c_9 / t_count) * 100;
				
				// compare it with the benford's law percentage including the deviation
				// when it matches - print Conforming
				// when it does not match -  print Deviation 
				if (c_1 >= 27 && c_1 <= 33) {
						c_count = c_count+1;
					// System.out.println("Conforming");
				}
				else {
						d_count = d_count+1;
					// System.out.println("Deviation");
				}
				
				if (c_2 >= 16.2 && c_2 <= 19.8) {
					c_count = c_count+1;
					// System.out.println("Conforming");
				}
				else {
					d_count = d_count+1;
					// System.out.println("Deviation");
				}
				
				if (c_3 >= 10.8 && c_3 <= 13.8) {
					c_count = c_count+1;
					// System.out.println("Conforming");
				}
				else {
					d_count = d_count+1;
					// System.out.println("Deviation");
				}
				
				if (c_4 >= 9 && c_4 <= 11) {
					c_count = c_count+1;
					// System.out.println("Conforming");
				}
				else {
					// System.out.println("Deviation");
				}
				
				if (c_5 >= 7.2 && c_5 <= 8.8) {
					c_count = c_count+1;
					// System.out.println("Conforming");
				}
				else {
					d_count = d_count+1;
					// System.out.println("Deviation");
				}
				
				if (c_6 >= 6.3 && c_6 <= 7.7) {
					c_count = c_count+1;
					// System.out.println("Conforming");
				}
				else {
					d_count = d_count+1;
					// System.out.println("Deviation");
				}
				
				if (c_7 >= 5.4 && c_7 <= 6.6) {
					c_count = c_count+1;
					// System.out.println("Conforming");
				}
				else {
					d_count = d_count+1;
					// System.out.println("Deviation");
				}
				
				if (c_8 >= 4.2  && c_8 <= 5.8) {
					c_count = c_count+1;
					// System.out.println("Conforming");
				}
				else {
					d_count = d_count+1;
					// System.out.println("Deviation");
				}
				
				if (c_9 >= 3.1 && c_9 <= 4.9) {
					c_count = c_count+1;
				}
				else {
					d_count = d_count+1;
				}
				in.close();
				
				if (d_count == 3) {
					System.out.println("Deviant");
				}
				else if (d_count > 3) {
					System.out.println("Random");
				}
				else if (c_count > 0) {
					System.out.println("Conforming");
				}	
			} 
			catch (Exception e) {
				System.err.println("Error: "+e.getMessage());
			}
		}
	}