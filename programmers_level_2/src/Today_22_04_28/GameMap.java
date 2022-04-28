package Today_22_04_28;

import java.util.LinkedList;

public class GameMap {

	
	public static void main(String[] args) {
		
		int[][]maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
		int answer = -1;
		int n = maps.length;
		int m = maps[0].length;
		int[][]visited = new int[n][m];
		int []dx = {0,0,1,-1};
		int []dy = {1,-1,0,0};
		
		LinkedList<int[]>queue = new LinkedList<>();
	
		queue.add(new int[] {0,0,1});
		
		while(!queue.isEmpty()) {
			int[]temp = queue.poll();
			int y = temp[0];
			int x = temp[1];
			int cnt = temp[2];
			visited[y][x] = cnt;
			
			for(int i=0;i<4;i++) {
				int newY = y+dy[i];
				int newX = x+dx[i];
				
				if(newY>=0&&newY<n&&newX>=0&&newX<m) {
					if(maps[newY][newX] == 1 &&visited[newY][newX]==0) {
						queue.add(new int[] {newY,newX,cnt+1});
					}
				}
			}
		}
	
		if(visited[n-1][m-1]!=0) {
			answer = visited[n-1][m-1];
		}
		System.out.println(answer);
	}
	
	
}