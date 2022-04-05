package Today_22_04_05;

import java.util.Collections;
import java.util.PriorityQueue;

public class no_7 {
	
	public static void main(String[] args) {
		
		int[]priorities = {1, 1, 9, 1, 1,1};
		int location = 0;
		int answer = 1;
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		for(int i : priorities) pq.offer(i);
		
		boolean flag = false;
		
		while(!pq.isEmpty()) {
			
			for(int i=0;i<priorities.length;i++) {
				
				if(pq.peek()==priorities[i]) {
				
					
					if(location==i) {
						flag = true;
						break;
					}else {
						answer++;
						pq.poll();
					}
					
				}
			
				
			}
			
			if(flag) break;
			
			
		}
		
		System.out.println(answer);
		
	}

}
