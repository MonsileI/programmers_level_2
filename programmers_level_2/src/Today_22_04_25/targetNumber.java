package Today_22_04_25;

public class targetNumber {

	static int answer = 0;
	
	public static void main(String[] args) {
	
		int[]numbers = {1,1,1,1,1};
		int target = 3;
		dfs(numbers,target,0,0);
		
		System.out.println(answer);
	}
	static void dfs(int[]numbers,int target,int depth,int sum) {
		
		
		if(depth==numbers.length) {
			if(target==sum) answer++;
		}else {
			
			dfs(numbers,target,depth+1,sum + numbers[depth]);
			dfs(numbers,target,depth+1,sum - numbers[depth]);
			
		}
		
	}
}
