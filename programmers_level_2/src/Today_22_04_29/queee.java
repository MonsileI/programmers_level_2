package Today_22_04_29;

public class queee {

	static int[]answer = new int[2];
	
	public static void main(String[] args) {
		
		int[][]arr = {{1,1,0,0},{1,0,0,0},{1,0,0,1},{1,1,1,1}};
	
	
		
		
		int size = arr.length;
		
		dfs(arr,size,0,0);
		
		System.out.println(answer[0]);
		System.out.println(answer[1]);
		
	}
	
	static void dfs(int[][]arr,int size,int x, int y) {
		
		if(check(arr,size,x,y)) {
			answer[arr[x][y]]++;
			return;
		}else {
			
			dfs(arr,size/2,x,y);
			dfs(arr,size/2,x+size/2,y);
			dfs(arr,size/2,x,y+size/2);
			dfs(arr,size/2,x+size/2,y+size/2);			
			
		}
		
		
	}
	static boolean check(int[][]arr,int size,int x,int y) {
		for(int i=x;i<size+x;i++) {
			for(int j=y;j<size+y;j++) {
				if(arr[i][j]!=arr[x][y]) return false;
			}
		}
		
		return true;
	}
	
}
