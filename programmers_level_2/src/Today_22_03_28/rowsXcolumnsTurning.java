package Today_22_03_28;

public class rowsXcolumnsTurning {

	public static void main(String[] args) {
		
		int rows = 3;
		int columns = 3;
		int[][]queries = {{1,1,2,2},{1,2,2,3},{2,1,3,2},{2,2,3,3}};
		int []result = new int[queries.length];
		
		int[][]board = new int[columns][rows];
		int[][]temp = new int[columns][rows];
		int num = 1;
		for(int i=0;i<columns;i++) 
			for(int j=0;j<rows;j++) {
				board[i][j] = num;
				temp[i][j] = num;
				num++;
			}
	
		
	
		for(int i =0;i<queries.length;i++) {
			int min = Integer.MAX_VALUE;
			
			int col1 = queries[i][0] - 1;
			int row1 = queries[i][1] - 1;
			int col2 = queries[i][2] - 1;
			int row2 = queries[i][3] - 1;
			
			for(int j=col1;j<=col2;j++) {
			if(board[j][row1]<min) min = board[j][row1];	
			if(board[j][row2]<min) min = board[j][row2];	
			}
			for(int j=row1;j<=row2;j++) {
			if(board[col1][j]<min) min = board[col1][j];	
			if(board[col2][j]<min) min = board[col2][j];	
			}
			
			for(int j=row1+1;j<=row2;j++) temp[col1][j] = board[col1][j-1];
			for(int j=row1;j<=row2-1;j++) temp[col2][j] = board[col2][j+1];
			for(int j=col1+1;j<=col2;j++) temp[j][row2] = board[j-1][row2];
			for(int j=col1;j<=col2-1;j++) temp[j][row1] = board[j+1][row1];
			
			for(int j=0;j<columns;j++)
				for(int k=0;k<rows;k++)
					board[j][k] = temp[j][k];
			
			
			result[i] = min;
			
		}
		
		
		
		for(int i : result) System.out.println(i);
		
	}
}
