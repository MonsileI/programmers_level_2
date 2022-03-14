package Today_22_03_10;

public class dfs {
	
	public static int[][] graph = {
			{},
			{2,3,8},
			{1,7},
			{1,4,5},
			{3,5},
			{3,4},
			{7},
			{2,6,8},
			{1,7}
	};
	
	public static boolean [] visited = new boolean[graph.length];

	
	public static void main(String[] args) {
		int start = 1;
		dfs(start);
	}
	public static void dfs(int v) {
	
		visited[v] = true;
		System.out.println(v+"");
		
		for(int i : graph[v]) {
			if(visited[i]==false) {
				dfs(i);
			}
			
		}
	}
}
