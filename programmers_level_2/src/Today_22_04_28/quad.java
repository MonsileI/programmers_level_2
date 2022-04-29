package Today_22_04_28;

public class quad {
	
    static int[]answer = new int[2];
	public static void main(String[] args) {
		
		int[][]arr = {{1,1,0,0},{1,0,0,0},{1,0,0,1},{1,1,1,1}};
		int totalSize =arr.length;
		dp(0,0,totalSize,arr);
		
		System.out.println(answer[0]);
		System.out.println(answer[1]);
		
	}
	static void dp(int x, int y, int size,int[][]arr) {
		
		if(check(x,y,size,arr)) {
			answer[arr[x][y]]++;
			return;
		}
		
		
		dp(x,y,size/2,arr);
		dp(x+size/2,y+size/2,size/2,arr);
		dp(x+size/2,y,size/2,arr);
		dp(x,y+size/2,size/2,arr);
		
	}
	
	static boolean check(int x,int y,int size,int[][]arr) {
		
		for(int i=x;i<x+size;i++) {
			for(int j=y;j<y+size;j++) {
				if(arr[x][y]!=arr[i][j])return false;
			}
		}
		
		return true;
	}
	
	
}
