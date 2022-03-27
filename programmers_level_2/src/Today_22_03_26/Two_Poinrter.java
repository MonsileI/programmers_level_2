package Today_22_03_26;

import java.util.Arrays;

public class Two_Poinrter {
	
	public static void main(String[] args) {
		
		int [] a = {5 ,12 ,7 ,10 ,9 ,1 ,2 ,3 ,11};
		int n = a.length;
		int m = 13;
		
		
		int sum = 0;
		int start = 0;
		int end = n-1;
		int answer=0;
		Arrays.sort(a);
		
		while(start<end) {	
			
			sum = a[start] + a[end];
			
			if(sum<=m) {
				start++;
			}else if(sum>m) {
				end--;
			}
			
			if(sum==m) answer++;
			
			
			
		}
		
		
		System.out.println(answer);
		
	}

}
