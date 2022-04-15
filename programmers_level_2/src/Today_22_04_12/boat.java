package Today_22_04_12;

import java.util.Arrays;

public class boat {

	public static void main(String[] args) {
		
		int [] people = {70,50,80,50};
		int limit = 100;
		
		int answer = 0;
		int i = 0;
		Arrays.sort(people);
		
		for(int j=people.length-1;i<=j;j--) {
			
			if(people[i]+people[j]>limit) {
				answer++;
			}else {
				answer++;
				i++;
			}
			
		}
		
		
		System.out.println(answer);
		
	}
}
