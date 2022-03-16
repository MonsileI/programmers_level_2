package Today_22_03_16;

import java.util.LinkedList;
import java.util.Queue;

public class truck {
	
	public static void main(String[] args) {
		
		int bridge_length = 2;
		int weight = 10;
		int[]truck_weights = {7,4,5,6};
		
		int answer = 0;
		
		
		int sum = 0;
		int time =0;
		
		Queue<Integer> que = new LinkedList<>();
		
		
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
					
					if(i+sum<=weight) {
						
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
