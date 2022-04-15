package Today_22_04_12;

public class friendsBlock {
	
	static int answer = 0;
	
	public static void main(String[] args) {
		
		int m = 4;
		int n = 5;
		String[] board = {"CCBDE", "AAADE", "AAABF", "CCBBF"};
		
		char[][] temp = new char[m][n];
		
		for(int i = 0 ; i < board.length; i++) {
			for(int j =0; j<board[i].length();j++) {
				temp[i][j] = board[i].charAt(j); 
			}
		}
	
		for(int i=0;i<m;i++) {
			for(int j=0; j<n;j++) {
				process(i,j,temp);
			}		
		}
		
		System.out.println(answer);
		
		
	}
	
	public static void process(int i,int j,char[][]temp) {
		
		int []di = {0, 1, 1};
		int []dj = {1,0,1};
		
		int count = 0;

			for(int k=0;k<3;k++) {
				
				int newI = i+di[k];
				int newJ = j+dj[k];
				if(newI>=temp.length||newJ>=temp[0].length)continue;
				else {
					
					if((newI==i ||newI=='0'||i=='0'&& j=='0'|| newJ==j||newJ=='0')) count++;
					

				}
			}
			
			if(count>2) clear(i,j,temp);
			
		
		
	}
	public static void clear(int i,int j,char[][]temp) {
		
		
		temp[i][j] ='0';
		temp[i+1][j] ='0';
		temp[i][j+1] ='0';
		temp[i+1][j+1] ='0';
		
		for(int k=temp.length-1;k>0;k--) {
			for(int l=0;l<temp[0].length;l++) {
				if(temp[k][l]=='0') {
					temp[k][l] = temp[k-1][l];
					temp[k-1][l] = '0';
					answer++;
				}
			}
		}
		
		while(true) {
		
		process(i,j,temp);
				
		if(!check(temp)) break;
		
		}
		
	}
	public static boolean check(char[][]temp) {
		
		boolean flag = false;
		
		for(int i=0;i<temp.length-1;i++) {
			for(int j=0;j<temp[0].length-1;j++) {
				
				if(temp[i][j]==temp[i+1][j])
					if(temp[i][j]==temp[i][j+1])
						if(temp[i][j]==temp[i+1][j+1]) {
							flag = true;
							break;
						}
				
			}
		}
		
		
		return flag;
	}
}
