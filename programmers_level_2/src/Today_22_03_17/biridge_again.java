package Today_22_03_17;

import java.util.LinkedList;
import java.util.Queue;

public class biridge_again {

	public static void main(String[] args) {
		
		int bridge_length = 2;
		int weight = 10;
		int[]truck_weights = {7,4,5,6};
		int answer = 0;
		int sum = 0;
		int time = 0;
		
		Queue<Integer>que = new LinkedList<>();
		
		for(int now : truck_weights) {
			
			while(true) {
				
				if(que.isEmpty()) {
					que.add(now);
					time++;
					sum += now;
					break;
				}else if(que.size()<bridge_length) {
					
					if(sum+now<=weight) {
						que.add(now);
						sum += now;
						time++;
						break;
						
					}else {
						que.add(0);
						time++;
						
						
					}
					
				}else if(que.size()==bridge_length) {
					sum -= que.poll();
				}
				
				
			}
			
			
		}
		
		answer = time + bridge_length;
		
		System.out.println(answer);
		
		
	}
}
