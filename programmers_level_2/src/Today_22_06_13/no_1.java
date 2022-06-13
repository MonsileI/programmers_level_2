package Today_22_06_13;

import java.util.Queue;
import java.util.LinkedList;

public class no_1 {

	static int answer = 0;

	public static void main(String[] args) {
		
		int[] numbers = {1,1,1,1,1};
		int target = 3;
		
		
		dfs(numbers,target,0,0);
		
		System.out.println(answer);
	}
	
	static void dfs(int[]numbers,int target,int now,int count) {
		
		if(count==numbers.length) {
			if(now==target) answer++;
		}else {
			
			dfs(numbers,target,now+numbers[count],count+1);
			dfs(numbers,target,now-numbers[count],count+1);
			
		}
		
	}
	
}
