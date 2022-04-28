package Today_22_04_28;

import java.util.ArrayList;

public class jumpingAndTelePort {

	
	public static void main(String[] args) {
		
		int n = 3;
		long left = 2;
		long right = 5;
		
		int[][]temp = new int[n][n];
		int num = 0;
		long[]board = new long[n*n];
	
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				temp[i][j] = 1 + Math.max(i, j);
				System.out.print(temp[i][j]);
				board[num++] = temp[i][j];
			}
			System.out.println();
		}
		
		
		for(long i : board)System.out.print(i+" ");
		
		ArrayList<Long>list = new ArrayList<>();
		
		for(long i=left;i<=right;i++) {
			list.add(board[(int) i]);
		}
		
		long[]answer = new long[list.size()];
		
		for(int i=0;i<list.size();i++)answer[i] = list.get(i);
		
		for(long i : answer)System.out.println(i);
		
		
		
	}
}
