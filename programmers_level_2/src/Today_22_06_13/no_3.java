package Today_22_06_13;

public class no_3 {

	static int [] answer = new int[2];
	public static void main(String[] args) {
		
		int[][]arr = {{1,1,0,0},{1,0,0,0},{1,0,0,1},{1,1,1,1}};
		
		
		
		dfs(arr.length,arr,0,0);
		
		System.out.println(answer[0]);
		System.out.println(answer[1]);
		
	}
	
	static boolean check(int size,int[][]arr,int x,int y) {
		
		for(int i=x;i<x+size;i++) {
			for(int j=y;j<y+size;j++) {
				if(arr[i][j]!=arr[x][y]) return false;
			}
		}
		
		return true;
		
	}
	
	
	static void dfs(int size,int[][]arr,int x,int y) {
	
		
		if(check(size,arr,x,y)) {
			
			answer[arr[x][y]]++;
			return;
			
		}else {
			
			dfs(size/2,arr,x,y);
			dfs(size/2,arr,x+size/2,y+size/2);
			dfs(size/2,arr,x+size/2,y);
			dfs(size/2,arr,x,y+size/2);
		}
		
		
	}
	
}
