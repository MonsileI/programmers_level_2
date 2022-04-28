package Today_22_04_28;

public class theBiggerSquare {

	
	public static void main(String[] args) {
		
		int [][] board = {{0,1,1,1},{1,1,1,1},{1,1,1,1},{0,0,1,0}};
		int answer = 0;
		
		int n = board.length;
		int m = board[0].length;
		
		int [][] temp = new int[n][m];
		
		for(int i=0;i<n;i++) temp[i][0] = board[i][0];	
		for(int i=0;i<m;i++) temp[0][i] = board[0][i];	
		
		
		for(int i=1;i<n;i++) {
			for(int j=1;j<m;j++) {
				if(board[i][j]==1) {
					temp[i][j] = Math.min(Math.min(temp[i][j-1], temp[i-1][j]), temp[i-1][j-1]) + 1;
				}
			}
		}
		
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<temp.length;i++) {
			for(int j=0;j<temp[0].length;j++) {
				max = Math.max(max, temp[i][j]);
			}
		}
		
		answer = max*max;
		System.out.println(answer);
	}
}
