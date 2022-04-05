package Today_22_04_05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class no_6 {
	
	public static void main(String[] args) {
		
		int[]progresses = {93,30,55};
		int[]speeds = {1,30,5};
		
		
		Queue<Integer> que = new LinkedList<>();
		
		for(int i=0;i<progresses.length;i++) {
			
			int count = 0;
			
			while(progresses[i]<100) {
				progresses[i] += speeds[i];
				count++;
			}
			
			que.offer(count);
			
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while(!que.isEmpty()) {
			
			int comp = que.poll();
			int count = 1;
			while(!que.isEmpty()&&comp>que.peek()) {
				
				que.poll();
				count++;
			}
			
			list.add(count);
			
		}
		
		
		System.out.println(list);
		
		
		
	}

}
