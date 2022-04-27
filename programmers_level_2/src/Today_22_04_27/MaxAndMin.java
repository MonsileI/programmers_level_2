package Today_22_04_27;

import java.util.Arrays;

public class MaxAndMin {

	public static void main(String[] args) {
		
		String s = "-1 -2 -3 -4";
		
		String[] temp = s.split(" ");
		
		int max = 0;
		int min = 0;
		
		max = min = Integer.parseInt(temp[0]); 
		
		for(int i=1;i<temp.length;i++) {
			
			int a = Integer.parseInt(temp[i]);	
			if(max>a) max = a;
			if(min<a) min = a;
		
		}
		
		String answer = max + " " + min;
		
		System.out.println(answer);
	}
}
