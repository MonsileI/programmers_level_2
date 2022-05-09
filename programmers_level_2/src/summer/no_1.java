package summer;

import java.util.*;

public class no_1 {

	public static void main(String[] args) {
		
		int[][]atmos = {{80, 35}, {70, 38}, {100, 41}, {75,30}, {160,80}, {77, 29}, {181, 68}, {151, 76}};
		int answer = 0;
		
		//30이하 좋음
		//31~800 보통
		//81 ~150 나쁨
		//151이상 매우나쁨
		
		//초미세먼지
		//15이하 좋음
		//16~35 보통
		//36~75 나쁨
		//76이상 매우나쁨
		
		//초미세먼지,미세먼지 어느 하나라도 나쁨 이상이면 마스크 착용
		//마스크를 이틀 후까지만 재사용하고 폐기 day,day+1 dya+2
		//둘다 매우나쁨상태가 되는 날은 사용하던 마스크 그날까지만  씀
		
		//-> 할일 : 미세 81이상이면 마스크 초미세 36이상이면 마스크(||)
		//->D+2까지 쓰고 폐기
		//둘 다 매우나쁨&&일 경우에는 그날까지만 사용
		
		int mask = 0;
	
		for(int i=0;i<atmos.length;i++) {
			
			int dust = atmos[i][0];
			int microDust = atmos[i][1];
			
			if(microDust>=76&&dust>=151) {
				mask=0;
				answer++;
				continue;
			}
			
			if(mask!=0) mask++;
			
			
			if(microDust>=36||dust>=81) {
				if(mask==0) {					
					mask++;
				}
				
			}
			
			if(mask>=3) {
		
				mask = 0;
				answer++;	
			}
			
			
			
		}
		
		if(mask!=0) answer++;
		
		System.out.println(answer);
	}
}
