package Today_22_03_08;

import java.util.*;

public class test {

	public static void main(String[] args) {
		
		int[]progresses = {93,30,55};
		int[]speeds = {1,30,5};
		
		Queue<Integer> que = new LinkedList<Integer>();
		ArrayList<Integer>list = new ArrayList<Integer>();
		
		for(int i=0;i<progresses.length;i++) {
			int p = progresses[i];
			int s = speeds[i];
			int day = 0;
			
			while(p<100) {
				
				p += s;
				
				day++;
			}
			que.add(day);
			
		}
		System.out.println(que);
		
		while(!que.isEmpty()) {
			
			int first = que.poll();
			
			int count = 1;
			
			while(!que.isEmpty()&&que.peek()<first) {
				
				count ++;
				que.poll();
			}
			
			
			list.add(count);
			
		}
		
		System.out.println(list);
	}
}
