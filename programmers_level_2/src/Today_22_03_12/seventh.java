package Today_22_03_12;

import java.util.PriorityQueue;

public class seventh {
	
	public static void main(String[] args) {
		
		int[]priorities = {2,1,3,2};
							//1 2 2 3
							//1 3 0 2
		int location = 2;
		
		int answer = 0;
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		for(int i : priorities) pq.offer(i);
		
		while(!pq.isEmpty()) {
			
			for(int i=0;i<priorities.length;i++) {
				
				if(pq.peek()==priorities[i]) {
					if(location == i) {
						break;
					}else {
						
						pq.poll();
						answer++;
					}
					
				}
				
				
			}
			
			
		}
		
		System.out.println(answer);
		
	}

}
