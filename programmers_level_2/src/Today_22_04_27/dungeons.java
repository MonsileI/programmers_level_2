package Today_22_04_27;


public class dungeons {
	
	static int answer = 0;
	
	public static void main(String[] args) {

		int k = 80;
		
		int[][]dungeons = {{80,20},{50,40},{30,10}};
		
		
		boolean[]isVisited = new boolean[dungeons.length];
		
		dfs(0,k,dungeons,isVisited);
		
		System.out.println(answer);
	}
	
	static void dfs(int count,int k,int[][]dungeons,boolean[]isVisited) {
		
		
		for(int i=0;i<dungeons.length;i++) {
			if(!isVisited[i] && dungeons[i][0]<=k) {
				isVisited[i] = true;
				int next = k-dungeons[i][1];
				dfs(count+1,next,dungeons,isVisited);
				isVisited[i] = false;
			}
		}
		
		answer = Math.max(answer, count);
	}
}