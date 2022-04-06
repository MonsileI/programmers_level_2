package Today_22_04_06;

public class biggestNum {

	public static int answer = 0;
	
	public static void main(String[] args) {
		
		int [] numbers= {3, 30, 34, 5, 9};
		boolean[] visited = new boolean[numbers.length];
		dfs(numbers,visited,"",0);
		
		String result = String.valueOf(answer);
		
		System.out.println(result);
		
	}
	
	public static void dfs(int[]numbers,boolean[]visited,String now,int count) {
		
		
		if(count==numbers.length) {
			answer = Math.max(answer, Integer.parseInt(now));
		}
		
		
		
		for(int i=0;i<numbers.length;i++) {
			
			if(!visited[i]) {
				
				visited[i] = true;
				String newOne = now + String.valueOf(numbers[i]);
				dfs(numbers,visited,newOne,count+1);
				visited[i] = false;
			}
			
		}
		
		
	}
}
