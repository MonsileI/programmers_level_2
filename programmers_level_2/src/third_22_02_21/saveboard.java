package third_22_02_21;

import java.util.Arrays;

public class saveboard {
	
	public static void main(String[] args) {
		
		int[]people = {70, 80,50, 50};
		int limit = 100;
		int answer = 0;
		int i = 0;
		int j;
		Arrays.sort(people);
		
		for(j=people.length-1; i<=j; j--) {
			// 최소 + 최대 몸무게 2명의 합이 무게제한보다 큰 경우
			// 가장 큰 몸무게의 인원을 보트1대에 태워 보낸다.
			if(people[j] + people[i] > limit)
				answer ++;

			/* 최소 + 최대 몸무게 2명의 합이 무게제한보다 같거나 작은 경우
			 *  - 두명을 한 보트에 태워 보낸다.
			 *  - 그 다음으로 몸무게가 작은 인원을 기준으로 삼아야 하기 때문에 i값을 ++해준다.
			 */
			else {
				answer ++;
				i ++;
			}
		}
		
		System.out.println(answer);
	}

}
