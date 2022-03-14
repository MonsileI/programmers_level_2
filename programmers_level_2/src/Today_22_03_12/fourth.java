package Today_22_03_12;

public class fourth {
	
	static int answer = 0;
	
	public static void main(String[] args) {
		
	
		int[]numbers = {4, 1, 2, 1};
		int target = 4;
		
		dfs(0,0,numbers,target);
		
		System.out.println(answer);
		
		
		
		
	}
	public static void dfs(int sum,int depth,int[]numbers,int target) {
		
		if(depth==numbers.length) {
			if(sum==target) answer++;
		}else {
			
		
		
		
		
		dfs(sum+numbers[depth],depth+1,numbers,target);
		dfs(sum-numbers[depth],depth+1,numbers,target);
		
		}
		
		
	}

}
