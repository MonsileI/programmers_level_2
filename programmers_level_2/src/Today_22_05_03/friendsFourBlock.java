package Today_22_05_03;

import java.util.ArrayList;
import java.util.List;

public class friendsFourBlock {

	static boolean visited[][];
	static char[][] table;
	public static void main(String[] args) {
		
		int m = 4;
		int n = 5;
		String[]board = {"CCBDE", "AAADE", "AAABF", "CCBBF"};
	
		int answer = 0;
		int flag = 0;
		table = new char[n][m];
		for(int i=0;i<n;i++) {
			table[i] = board[i].toCharArray();
		}
		while(true) {
			flag=0;
			visited = new boolean[n][m];
			for(int i=0;i<n-1;i++) {
				for(int j=0;j<m-1;j++) {
					flag += checkMatrix(i,j);
				}
			}
			
			if(flag==0)break;
			for(int j=0;j<m;j++) {
				ArrayList<Character> list = new ArrayList<>();
				for(int i=n-1;i>=0;i--) {
					if(!visited[i][j]) {
						list.add(table[i][j]);
					}else answer++;
					
				}
				
			}
			
			for(int i=m-1;i>0;i--) {
				for(int j=0;j<n;j++) {
					if(table[i][j]=='0') {
						for(int k=i-1;k>=0;k--) {
							if(table[k][j]!='0') {
								table[i][j] = table[k][j];
								table[k][j]='0';
								break;
							}
						}
					}
				}
			}
			
		}
		
		System.out.println(answer);
		
	}
	static int checkMatrix(int r,int c) {
		char target = table[r][c];
		if(target!='0' && target==table[r+1][c]&& 
		   target==table[r][c+1] && target==table[r+1][c+1]) {
			visited[r][c] = true;
			visited[r+1][c] = true;
			visited[r][c+1] = true;
			visited[r+1][c+1] = true;
			return 1;
		}
		return 0;

	}
	
}
