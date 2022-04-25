package Today_22_04_25;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class developmentFunction {

	public static void main(String[] args) {
		
		int [] progresses = {95, 90, 99, 99, 80, 99};
		int [] speeds = {1, 1, 1, 1, 1, 1};
		

		Queue<Integer>que = new LinkedList<Integer>();
		
		for(int i=0;i<progresses.length;i++) {
			
			int pro = progresses[i];
			int spd = speeds[i];
			int tmp = 0;
			while(pro<100) {
				
				pro += spd;
				tmp ++;
				
			}
			que.add(tmp);
			
		}
		
		ArrayList<Integer> answerList = new ArrayList<>();
		
		while(!que.isEmpty()) {
			
			int comp = que.poll();
			int answer = 1;
			while(!que.isEmpty()&&comp>que.peek()) {
				answer++;
				que.poll();
			}
			
			answerList.add(answer);
			
		}
		
		int[]answer= new int[answerList.size()];
		
		for(int i=0;i<answerList.size();i++) answer[i] = answerList.get(i);
		
		for(int i : answer)System.out.println(i);
		
		
		
		
	}
}

