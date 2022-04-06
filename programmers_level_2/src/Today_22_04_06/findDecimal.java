package Today_22_04_06;

import java.util.HashSet;

public class findDecimal {
	
	public static HashSet<Integer> answer = new HashSet<>();
	
	public static void main(String[] args) {
		
		String numbers = "17";
		
		boolean[]isVisited = new boolean[numbers.length()];
		
		dfs(isVisited,numbers,0);
	
		System.out.println(answer);
	
	}
	public static void dfs(boolean[]isVisited,String numbers,int now) {
		
		if(check(now)) answer.add(now);
		
		for(int i=0;i<numbers.length();i++) {
			if(!isVisited[i]) {
				isVisited[i]=true;
				String newOne = String.valueOf(now) + numbers.charAt(i);
				dfs(isVisited,numbers,Integer.parseInt(newOne));
				isVisited[i]= false;
				
			}
		}
		
	}
	public static boolean check(int now) {
		
		if(now==1||now==0) return false;
		
		for(int i=2;i<=Math.sqrt(now);i++) if(now%i==0) return false;
		
		return true;
		
	}

}
