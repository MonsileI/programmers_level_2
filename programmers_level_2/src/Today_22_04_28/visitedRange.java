package Today_22_04_28;

import java.util.HashSet;
import java.util.Set;

public class visitedRange {

	public static void main(String[] args) {
		
		String dirs = "ULURRDLLU";
		int answer= 0;
				
		
		Set<String> dir = new HashSet<>();
		
		int []now = {0,0};
		
		for(int i=0;i<dirs.length();i++) {
			
			char ch = dirs.charAt(i);
			int []next = {now[0], now[1]};	
			
			String road = "";
			
			if(ch=='U') {
				next[1]++;
			}else if(ch=='D') {
				next[1]--;
			}else if(ch=='L') {
				next[0]--;
			}else if(ch=='R') {
				next[0]++;
			}
			
			if(next[0]<-5||next[1]<-5||next[1]>5||next[1]<-5) continue;
			
			road = ""+now[0]+now[1]+next[0]+next[1];
			
			dir.add(road);
			
			now[0] = next[0];
			now[1] = next[1];
			
			
		
		}
		
		System.out.println(dir);
	}
}
