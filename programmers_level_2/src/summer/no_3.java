package summer;

import java.util.*;

public class no_3 {

	public static void main(String[] args) {
	
		String line = "Q4OYPI";
		int[]answer= new int[line.length()];
		
		String left = "Q";
		String right = "P";
		
		//2와 q는 2크기
		//3과 q는 3크기
		//q와 1은 1크기
		//Q = 1+1
		//W = 2+1
		//숫자일 경우 수평거리만 생각
		
		String alpha = "QWERTYUIOP";
		
		for(int i=0;i<line.length();i++) {
			
			String ch = ""+line.charAt(i);
			
			if(ch.equals("0")) ch="10";
			
			if(alpha.contains(ch)) {
				
				
				
				
			}else {
				
				
				
				
			}
			
			
			
			
			
		}
		
	}
}
