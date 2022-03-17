package Today_22_03_17;

import java.util.Arrays;
import java.util.Comparator;

public class dunjeons {
	
	static int comp = 0;
	
	public static void main(String[] args) {
		
		int k = 80;
		int[][]dungeons = {{80,20},{50,40},{30,10}};
		int answer = 0;
		//80 - 20
		//if(60 - 40 < 30) 찾아서 
		//while로 k-dungeons[i][1]>k-dungeons[i+1(j로 변환)][1]
		
		//이중배열 정렬 (리버스)
		//Arrays.sort(dungeons, Comparator.comparingInt((int[] o1) -> o1[0]).reversed());
		
		//if(dungeons[0][0]>k) {
			//answer = 0;
		//}else 
		
		boolean[]visit = new boolean[dungeons.length];
		
		dfs(k,dungeons,0,visit);		
	
		
		
	}
	
	public static void dfs(int k, int[][]dungeons,int depth,boolean[]visit) {
		
		if(depth==dungeons.length) {
			
			System.out.println(k);
			
		}
		
		for(int i=0;i<dungeons.length;i++) {
			k = 80;
			if(!visit[i]) {
				visit[i] = true;
				k = k-dungeons[i][1];
				dfs(k,dungeons,depth+1,visit);
				visit[i] = false;
			}
			
		}
		
		
		
		
	}
}
