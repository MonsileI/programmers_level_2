package Today_22_05_03;

import java.util.Arrays;
import java.util.Collections;


public class corona {

	public static void main(String[] args) {
		
	String [][] places = {{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"}, {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"}, {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"}, {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"}, {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}};
	
	int [] answer = new int[places.length];
	
	for(int i=0;i<answer.length;i++) answer[i] = 1;
	
	for(int i=0;i<places.length;i++) {
		
		String[] temp = places[i];
		
		thisLoop:
		for(int j=0;j<temp.length;j++) {
			for(int k=0;k<temp[0].length();k++) {
				if(temp[j].charAt(k)=='P') {
					if(!check(temp,j,k)) {
						answer[i] = 0;
						break thisLoop;
					};					
				}
			}
		}
		
		
	}
	for(int i :answer)System.out.println(i);
		
		
	}
	static boolean check(String[]temp,int i,int j) {
		
		int []di = {1,0,-1,0};
		int []dj = {0,1,0,-1};
		
		
		//상하좌우
		
		for(int d=0;d<4;d++) {
			
			int newI = i + di[d];
			int newJ = j + dj[d];
			
			if(newI<0||newJ<0||temp.length-1<newI||temp[0].length()-1<newJ) continue;
			
			if(temp[newI].charAt(newJ)=='P') return false;
			
		}
		
		//대각선 테이블
		
		int []di2 = {1,-1,1,-1};
		int []dj2 = {1,1,-1,-1};
		
		for(int d=0;d<4;d++) {
			
			int newI = i + di2[d];
			int newJ = j + dj2[d];
			
			if(newI<0||newJ<0||temp.length-1<newI||temp[0].length()-1<newJ) continue;
			if(temp[newI].charAt(newJ)=='P') {
				if(!(temp[newI].charAt(j)=='X'&&temp[i].charAt(newJ)=='X')) return false;
			}
			
		}
		
		
		//맨해튼
		
		int []di3 = {0,2,0,-2};
		int []dj3 = {2,0,-2,0};
		
		for(int d=0;d<4;d++) {
			
			int newI = i + di3[d];
			int newJ = j + dj3[d];
			
			if(newI<0||newJ<0||temp.length-1<newI||temp[0].length()-1<newJ) continue;
			if(temp[newI].charAt(newJ)=='P') {
				if(!(temp[(newI+i)/2].charAt((newJ+j)/2)=='X')) return false;
			}
			
		}
		
		
		
		return true;
	}
	
}
