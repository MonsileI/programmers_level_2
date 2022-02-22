package third_22_02_21;

import java.util.Arrays;
import java.util.Collections;

public class MaxAndMinOthers {
	

	public static void main(String[] args) {
	
		String s = "1 2 3 4";
		String answer = "";
		
		String[]arr = s.split(" ");
		int max,min,n;
		
		max = min = Integer.parseInt(arr[0]);
		
		for(int i=1;i<arr.length;i++) {
			n = Integer.parseInt(arr[i]);
			
			if(n>max) max = n;
			if(n<min) min = n;
		}
		
			answer = min + " " + max;
			
			System.out.println(answer);
		}
	}


