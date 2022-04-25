package Today_22_04_25;

import java.util.Scanner;

public class world_124 {

	public static void main(String[] args) {
		
		
	
			int n =	4;

			
			String answer = "";
			int[]world = {4,1,2};
			
			while(n>0) {
				answer = answer + world[n%3];
				n = (n-1)/3;
				
			}
			
			System.out.println(answer);
			
		
		
	}
}
