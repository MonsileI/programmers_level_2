package Today_22_04_12;

public class targetNumber {

	static int answer = 0;
	
	public static void main(String[] args) {
		
		int [] numbers = {1,1,1,1,1};
		int target = 3;
		
		dfs(numbers,target,0,0);
		
		System.out.println(answer);
	}
	public static void dfs(int [] numbers,int target,int depth,int sum) {
		
		
		if(depth==numbers.length) {
			if(check(sum,target)) answer++;
		}else {
			
			dfs(numbers,target,depth+1,sum+numbers[depth]);
			dfs(numbers,target,depth+1,sum-numbers[depth]);
		}
		
		
			
			
			
		
		
	}
	public static boolean check(int sum,int target) {
		
		if(sum==target) return true;
		else return false;
	}
}
