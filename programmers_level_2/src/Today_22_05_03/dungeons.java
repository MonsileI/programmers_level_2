package Today_22_05_03;

public class dungeons {

	static int answer = 0;
	
	public static void main(String[] args) {
		
		int k = 80;
		
		int[][]dungeons = {{80,20},{50,40},{30,10}};
		
		boolean[]visited = new boolean[dungeons.length];
		
		dfs(0,k,dungeons,visited);
		
		System.out.println(answer);
	}
	static void dfs(int cnt,int k,int[][]dungeons,boolean[]visited) {
		
		for(int i=0;i<dungeons.length;i++) {
			if(!visited[i] && dungeons[i][0]<=k) {
				visited[i] = true;
				int next = cnt+1;
				int nextK = k - dungeons[i][1];
				dfs(next,nextK,dungeons,visited);
				visited[i] = false;
				
			}
			
		}
		
		
		answer = Math.max(answer, cnt);
		
	}
}
