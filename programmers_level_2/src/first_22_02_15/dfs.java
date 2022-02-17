package first_22_02_15;

public class dfs {

	static int answer = 0;
	
	public static void main(String[] args) throws Exception {
		//깊이 우선 탐색(dfs 처음쓰던 날~~~~~~~~~~:)
		int[]numbers = {4, 1, 2, 1};
		int target = 2;
		
		dfs(numbers,target,0, 0);
		
		System.out.println(answer);
		
	}
	
	public static void dfs(int[]numbers, int target, int depth, int sum) {
		
		if(depth==numbers.length) {
			if(sum==target) {
				answer++;
			}
		}else {
			
			dfs(numbers,target,depth+1,sum+numbers[depth]);
			dfs(numbers,target,depth+1,sum-numbers[depth]);
		}
		
		
		
		
	}
	
}

