package third_22_02_21;

import java.util.HashSet;

public class dirsSucceed {
	
	public static void main(String[] args) {
		
		String dirs = "ULURRDLLU";
		int answer = 0;
		
		HashSet<String>hash = new HashSet<String>();
		
		int nowX = 0;
		int nowY = 0;
		
		for(int i=0;i<dirs.length();i++) {
			
			int nextX = nowX;
			int nextY = nowY;
			String road = "";
			if(dirs.charAt(i)=='U') {
				nextY++;
				road += nowX;
				road += nowY;
				road += nextX;
				road += nextY;
			}else if(dirs.charAt(i)=='D') {
				nextY--;
				road += nowX;
				road += nowY;
				road += nextX;
				road += nextY;
			}else if(dirs.charAt(i)=='L') {
				nextX--;
				road += nowX;
				road += nowY;
				road += nextX;
				road += nextY;
			}else if(dirs.charAt(i)=='R') {
				nextX++;
				road += nowX;
				road += nowY;
				road += nextX;
				road += nextY;
			}
			
			if(nextX > 5 || nextX < -5 ||
			   nextY > 5 || nextY < -5) continue;
			
			hash.add(road);
			nowX = nextX;
			nowY = nextY;
			
		}
		
		System.out.println(hash.size());
	}

}
