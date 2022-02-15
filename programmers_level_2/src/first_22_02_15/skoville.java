package first_22_02_15;


import java.util.PriorityQueue;

public class skoville {
	
	public static void main(String[] args) {
		
		int[]scoville = {1, 2, 3, 9, 10, 12};
		int K = 7;
		int answer = 0;
		
		PriorityQueue<Integer> heap = new PriorityQueue<>();
		
		for(int i=0;i<scoville.length;i++) {
			
			heap.offer(scoville[i]);
		}
		
		while(heap.peek() < K) {
			if(heap.size() <2){
				answer = -1;
				break;
			};
			int f1 = heap.poll();
			int f2 = heap.poll();
			
			int newFood = f1 + f2*2;
			heap.offer(newFood);
			answer++;
		}
		
		System.out.println(answer);
	}

}
