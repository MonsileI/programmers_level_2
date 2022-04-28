package Today_22_04_28;

import java.util.ArrayList;

public class nArrayCut {

	
	public static void main(String[] args) {
		
		
		int N = 5;
		int answer = 0;
		
		while(N>0) {
			if(N%2==0) {
				N /= 2;
			}else {
				answer++;
				N--;
			}
		}
		
		
		System.out.println(answer);
		
		
	}
}
