package Today_22_03_16;



import java.util.Arrays;


public class H_Index {
	
	public static void main(String[] args) {
		
		int[]citations = {3,0,6,1,5};
		
		int answer = citations.length;
		
		Arrays.sort(citations);
		
		for(int i=0;i<citations.length;i++) {
			
			int now = citations[i];
			int max = citations.length-(i+1);
			
			if(now<max) {
				answer--;
			}else {
				break;
			}
			
			
			
		}
		
		if(answer == 1||answer==2) answer--;
		System.out.println(answer);
		
	}

}
