package Today_22_03_15;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class truck {
	
	public static void main(String[] args) {
		
		int[]truck_weights = {7,4,5,6};
		int weight = 10;
		int bridge_length = 2;
		
		int answer =0;
		
		Queue<Integer> que = new LinkedList<>();
		int sum = 0;
		int time= 0;
		
	
		for(int i : truck_weights) {
			
			while(true) {
				
				if(que.isEmpty()) {
					
					que.offer(i);
					sum += i;
					time++;
					break;
					
				}else if(que.size()==bridge_length) {
					sum -= que.poll();
					
				
				}else if(que.size()<bridge_length) {
					
					if(sum+i<=weight) {
						
						que.offer(i);
						sum += i;
						time++;
						break;
					}else {
						
						que.offer(0);
						time++;
						
					}
					
					
				}
				
				
			}
			
		}
				
		
		System.out.println(time + bridge_length);
	}

}
