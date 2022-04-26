package Today_22_04_26;

public class MatrixTurn {

	public static void main(String[] args) {
		
		int rows = 6;
		int columns = 6;
		int[][]queries = {{2,2,5,4},{3,3,6,6},{5,1,6,3}};
		int []result = new int[queries.length];
	
		//col = 행
		//row = 열
		
		int num = 1;
		
		int[][]board = new int[rows][columns];
		int[][]temp = new int[rows][columns];
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				board[i][j] = num;
				temp[i][j] = num;
				num++;
			}
		}
		
		for(int i=0;i<queries.length;i++) {
		
			int min = Integer.MAX_VALUE;
			
			int row1 = queries[i][0]-1;
			int row2 = queries[i][2]-1;
			int col1 = queries[i][1]-1;
			int col2 = queries[i][3]-1;
			
			for(int j=row1;j<=row2;j++) {
				if(board[j][col1]<=min) min = board[j][col1];
				if(board[j][col2]<=min) min = board[j][col2];
			}
			for(int j=col1;j<=col2;j++) {
				if(board[row1][j]<=min) min = board[row1][j];
				if(board[row2][j]<=min) min = board[row2][j];
				
			}
			
			
			
			for(int j=col1;j<col2;j++) {
				temp[row1][j+1] = board[row1][j];
			}
			for(int j=col2;j>col1;j--) {
				temp[row2][j-1] = board[row2][j];
			}
			for(int j=row1;j<row2;j++) {
				temp[j][col1] = board[j+1][col1];
			}
			for(int j=row2;j>row1;j--) {
				temp[j][col2] = board[j-1][col2];
			}
			
			
			
			for(int j=0;j<board.length;j++) {
				for(int k=0;k<board[0].length;k++) {
					board[j][k] = temp[j][k];
				
				}
				
			}
			
			
			
			result[i] = min;
			
			
			
		}
		
		for(int i : result)System.out.println(i);
		
	}
}
