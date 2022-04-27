package Today_22_04_27;

import java.util.PriorityQueue;

public class greedy {
	
	public static void main(String[] args) {
		
		String number = "1231234";
		int k = 3;
		String answer = "";
		

		int idx = 0;
	
		
		for(int i=0;i<number.length()-k;i++) {
			int max = 0;
			for(int j=idx;j<=i+k;j++) {
				if(max<number.charAt(j)-'0') {
					max = number.charAt(j)-'0';
					idx = j+1;
				}
			}
			answer += max;
		}
		
		
		System.out.println(answer);
	}

}
