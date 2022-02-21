package third_22_02_21;

import java.util.Collections;
import java.util.PriorityQueue;

public class priorityQueue {

	public static void main(String[] args) {
		
	 int []priority = {2, 1, 3, 2};
	 int location = 1; //인덱스값 0부터
	 int answer = 1;
	
	 PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());

	 for(int n : priority) {
		 pq.offer(n);
	 }
	 
	 while(!pq.isEmpty()) {
		 
		 for(int i=0;i<priority.length;i++) {
			 
			 if(pq.peek()==priority[i]) {
				
				 if(location == i) {
					
					 break;
					 
				 }
				
				 answer++;
				 pq.poll();
			 }
			 
		 }
		 
		
	 }
	 

	 System.out.println(answer);
	
		
	}
}


