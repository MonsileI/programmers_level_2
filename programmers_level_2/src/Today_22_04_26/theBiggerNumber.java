package Today_22_04_26;

public class theBiggerNumber {

	static int answer = 0;
	
	public static void main(String[] args) {
		
		int [] numbers = {3, 30, 34, 5, 9};
		
		
		String result = "";
		
		boolean[]visited = new boolean[numbers.length];
		
		dfs(numbers,"",visited,numbers.length);
		
		result = String.valueOf(answer);
		
		System.out.println(result);
	}
	
	static void dfs(int[]numbers,String now,boolean[]visited,int r) {
		
		
		if(r==0) {
			answer = Math.max(answer, Integer.parseInt(now));
			return;
		}
		
		for(int i=0;i<numbers.length;i++) {
			if(!visited[i]) {
				visited[i] = true;
				String newOne = now + String.valueOf(numbers[i]);
				dfs(numbers,newOne,visited,r-1);
				visited[i] = false;
			}
			
		}
		
	}
}