package Today_22_04_13;

public class gameMap {

	public static void main(String[] args) {
		
		
		int[][]maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
		
		//0,0에서 시작
		//dfs로 모든 경우의 수 깊이 탐색
		//maps.length-1,maps[0].length-1값을 알아봐야됨
		//이동시 ++ (숫자를 저장할 board 구현)
		
		int[][] temp = new int[maps.length][maps[0].length];
		
		temp[0][0] = 1;
		
		dfs(0,0,temp,maps);
		
	
		int answer = temp[maps.length-1][maps[0].length-1];
		
		if(answer==0) answer = -1;
		
		System.out.println(answer);
		
		
	
	}
	
	static void dfs(int nowI, int nowJ,int[][]temp,int[][]maps) {
		
		int[] di = {1,0,-1,0};
		int[] dj = {0,1,0,-1}; 
		for(int i=0;i<4;i++) {
			
			int newI = nowI + di[i];
			int newJ = nowJ + dj[i];
			
			if(newI<0||newJ<0||maps.length-1<newI||maps[0].length-1<newJ) continue;
			else if(maps[newI][newJ]==1&&temp[newI][newJ]==0) {
				temp[newI][newJ] = temp[nowI][nowJ] + 1;
				temp[nowI][nowJ] = 1;
				dfs(newI,newJ,temp,maps);
				
			}
			
		}
		
		
	}
	
}
