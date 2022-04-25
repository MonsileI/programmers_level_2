package Today_22_04_25;

import java.util.PriorityQueue;
import java.util.Queue;

public class moreSpicy {
	
	
	public static void main(String[] args) {
		
		
		int[]scoville = {1, 2, 3, 9, 10, 12};
		int k = 7;
		int answer = 0;
		
		Queue<Integer> que = new PriorityQueue<>();
		
		for(int i : scoville)que.add(i);
		
		if(que.size()<2) answer = -1;
		else {
			int newOne = 0;
			while(!que.isEmpty()&&k>=newOne) {
				
				int a = que.poll();
				int b = que.poll();
				newOne = a+b*2;
				que.add(newOne);
				
				answer++;
				
				
			}
		}
		
			
			
			System.out.println(answer);
			
		
	}

}
