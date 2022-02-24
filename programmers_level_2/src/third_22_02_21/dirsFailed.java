package third_22_02_21;

public class dirsFailed {

	public static void main(String[] args) {

		String dirs = "ULURRDLLU";
		int answer = 0;
		
		int[][]coordinate = new int[dirs.length()][2];

		int x = 0;
		int y = 0;
	
		for(int i=0;i<dirs.length();i++) {

			if(dirs.charAt(i)=='U') {
				coordinate[i][1] = y+1;
				coordinate[i][0] = x;
				y++;
			}else if(dirs.charAt(i)=='L') {
				coordinate[i][0] = x-1;
				coordinate[i][1] = y;
				x--;
			}else if(dirs.charAt(i)=='R') { 
				coordinate[i][0] = x+1;
				coordinate[i][1] = y;
				x++;
			}else if(dirs.charAt(i)=='D') {
				coordinate[i][1] = y-1;
				coordinate[i][0] = x;
				y--;
			};
		}

	
		
		for(int i=0;i<coordinate.length;i++) {
			for(int j=1;j<i+1;j++) {
				if(coordinate[i][0]!=coordinate[j][0] || coordinate[i][1] != coordinate[j][1]) {
					answer++;
					break;
										}
			}
		}
		
		
		for(int i=0;i<coordinate.length;i++) {
			System.out.println(coordinate[i][0]+","+coordinate[i][1]);
		}
		
		System.out.println(answer);
		}
	}

