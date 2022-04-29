package Today_22_04_29;

public class quadAgain {

	public static void main(String[] args) {
		
		int[][]arr = {{1,1,0,0},{1,0,0,0},{1,0,0,1},{1,1,1,1}};
		int []result = new int[2];
		int size = arr.length;
		dp(arr,result,size,0,0);
		System.out.println(result[0]);
		System.out.println(result[1]);
		
	}
	static void dp(int[][]arr,int[]result,int size,int x, int y) {
		
		if(check(arr,x,y,size)) {
			result[arr[x][y]]++;
			return;
		}
		
		dp(arr,result,size/2,x,y);
		dp(arr,result,size/2,x+size/2,y);
		dp(arr,result,size/2,x,y+size/2);
		dp(arr,result,size/2,x+size/2,y+size/2);
		
		
		
	}
	static boolean check(int[][]arr,int x, int y,int size) {
		
		for(int i=x;i<size+x;i++) {
			for(int j=y;j<size+y;j++) {
				if(arr[x][y]!=arr[i][j]) return false;
			}
			
		}
		
		
		
		return true;
		
		
	}
}
