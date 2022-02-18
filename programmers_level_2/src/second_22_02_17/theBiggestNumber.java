package second_22_02_17;

import java.util.*;

public class theBiggestNumber {

	public static void main(String[] args) {
		
		int[]numbers = {0,0,0,0};

	
		String[]temp = new String[numbers.length];
		
		for(int i=0;i<numbers.length;i++) {
			
			temp[i] = String.valueOf(numbers[i]);
			
			
		}	
		
		Arrays.sort(temp, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				return ((o2+o1).compareTo(o1+o2));
			}	
			
		});
		String answer = "";
		
		if(temp[0].equals("0")) {
			answer = "0";
		}else {
			
		
		
		for(String a : temp) {
			answer += a;
		}
	}
		System.out.println(answer);
	}
}
