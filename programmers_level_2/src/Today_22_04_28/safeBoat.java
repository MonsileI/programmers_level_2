package Today_22_04_28;

import java.util.Arrays;

public class safeBoat {

	public static void main(String[] args) {
	
		int[]people = {70,80,50};
		int limit = 100;
		int answer = 0;
		
		Arrays.sort(people);
		
		int start = 0;
		int end = people.length-1;
		while(start<=end) {
			
			if(people[start]+people[end]<=limit) {
				answer++;
				start++;
				end--;
			}else {
				answer++;
				end--;
			}
			
		}
	
		System.out.println(answer);
	}
}
