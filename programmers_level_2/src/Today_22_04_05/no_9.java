package Today_22_04_05;

import java.util.Arrays;
import java.util.Comparator;

public class no_9 {

	public static void main(String[] args) {
		
		int[][]jobs = {{0, 3}, {1, 9}, {2, 6}};
		int answer = 0;
		
		//작업 시간이 빠른 순서대로 배치
		//평균치를 구해야 함
		
		
		Arrays.sort(jobs,new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				return o1[1]-o2[1];
			}
			
		});
		
		int end = 0;
		int sum = 0;
		int start = 0;
		for(int i=0;i<jobs.length;i++) {
			
			end += jobs[i][1];
			sum += end - jobs[i][0]; 
			
			
		}
		
		
		System.out.println(sum/jobs.length);
		
	}
}
