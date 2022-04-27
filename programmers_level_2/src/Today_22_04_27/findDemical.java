package Today_22_04_27;


import java.util.HashSet;
import java.util.Set;
public class findDemical {
	
	static Set<Integer> answerList = new HashSet<>();
	
	public static void main(String[] args) {
		
		String numbers = "17";
		
		boolean[]isVisited = new boolean[numbers.length()];
		
		dfs("",numbers,isVisited);
		
		int answer = answerList.size();
		
		System.out.println(answer);
		
		
		
	}
	
	static void dfs(String now,String numbers,boolean[]isVisited) {
		
		for(int i=0;i<numbers.length();i++) {
			if(!isVisited[i]) {
				isVisited[i] = true;
				String newOne = now + numbers.charAt(i);
				dfs(newOne,numbers,isVisited);
				int num = Integer.parseInt(newOne);
				if(check(num)) answerList.add(num);
				isVisited[i] = false;
			}
		}
		
	}
	static boolean check(int num) {
		
		if(num==0||num==1) return false;

		for(int i=2;i<=Math.sqrt(num);i++) if(num%i==0) return false;
		
		return true;
	
	}
}
