package third_22_02_21;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class developmentFunction {
	
	public static void main(String[] args) {
		int[] progresses = {95, 90, 99, 99, 80, 99};
		int[] sppeds =  {1, 1, 1, 1, 1, 1};
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		Queue<Integer>heap = new LinkedList<>();
		
		for(int i=0;i<sppeds.length;i++) {
			
			int p = progresses[i];
			int s = sppeds[i];
			int count = 0;
			while(p<100) {
				p += s;
				count++;
			}
			
			heap.offer(count);
			
		}
	
		while(!heap.isEmpty()) {
			int day = heap.poll();
			int cnt = 1;
			
			while(!heap.isEmpty() && day >= heap.peek()) {
				cnt++;
				heap.poll();
			}
			arr.add(cnt);
		}
		
		System.out.println(arr);
			
	}
			
}