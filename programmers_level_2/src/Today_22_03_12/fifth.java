package Today_22_03_12;

import java.util.PriorityQueue;

public class fifth {
	
	public static void main(String[] args) {
		
		int[] scoville	= {1, 2, 3, 9, 10, 12};
		int K = 7;
		int answer = 0;
		//k이상이 되어야 하고 공식은 제일 작은것 + 두번째꺼 *2
	
		PriorityQueue<Integer> heap = new PriorityQueue<>();
	
		for(int i : scoville) heap.add(i);
		
		
		while(K>heap.peek()) {
			
			if(heap.size()<2) {
				answer = -1;
				break;
			}
				int a = heap.poll();
				int b = heap.poll();
				
				heap.offer(a+(b*2));
				
				answer++;
			
		}
		
		
		
		System.out.println(answer);
		
	}

}
