package Today_22_04_27;

import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Collections;

public class printer {
	

	public static void main(String[] args) {
		
	int[] priority = {1, 1, 9, 1, 1, 1};
	
	int location = 0;
	
	int answer = 1;
	
	Queue<Integer>que = new PriorityQueue<>(Collections.reverseOrder());
	
	for(int i : priority)que.add(i);
	
	boolean flag = false;
	
	
	while(true) {
		
		for(int i=0;i<priority.length;i++) {
			
			int num = priority[i];
			
			if(num==que.peek()) {
				if(location == i) {
					flag = true;
					break;
				}else {
					answer++;
					que.poll();
				}
			}
			
			
		}
		
		if(flag) break;
		
	}
	
	System.out.println(answer);
		
	}
	
}