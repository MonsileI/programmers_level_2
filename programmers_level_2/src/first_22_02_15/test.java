package first_22_02_15;

import java.util.PriorityQueue;
import java.util.Queue;

public class test {
	
	public static void main(String[] args) {
		
	PriorityQueue<Integer> heap = new PriorityQueue<>();
	
	heap.offer(4);
	heap.offer(2);
	heap.offer(3);
	heap.offer(4);
	heap.offer(5);
	
	System.out.println(heap.poll());
	System.out.println(heap.poll());
	System.out.println(heap.poll());
	System.out.println(heap.poll());
	System.out.println(heap.poll());
	
	
	}
	
}
