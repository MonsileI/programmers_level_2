package Today_22_06_13;

import java.util.ArrayList;

public class no_2 {
	
	static long answer = Integer.MIN_VALUE;
	static char[]op = {'*','-','+'};
	static boolean[] visited = new boolean[3];
	static ArrayList<Long> numArr = new ArrayList<>();
	static ArrayList<Character> opArr = new ArrayList<>();
	
	
	public static void main(String[] args) {
		
		String expression = "100-200*300-500+20";
		
		String num = "";
		
		for(int i=0;i<expression.length();i++) {
			
			char ch = expression.charAt(i);
			
			if(ch>='0' && ch<='9') num += ch;
			else {
				numArr.add(Long.parseLong(num));
				num = "";
				opArr.add(ch);
			}
			
		}
		numArr.add(Long.parseLong(num));
		
		dfs(new char[3],0);
		
		System.out.println(answer);
		System.out.println(numArr);
		
	}
	
	static long change(long a,long b,char ch) {
		
		if(ch=='+') return a+b;
		else if(ch=='-') return a-b;
		else return a*b;
		
	}
	
	static void dfs(char[]p, int b) {
		
		if(b==3) {
			
			ArrayList<Long>numList = new ArrayList<>(numArr);
			ArrayList<Character>opList = new ArrayList<>(opArr);
			
			for(int i=0;i<p.length;i++) {
				for(int j=0;j<opList.size();j++) {
					if(p[i]==opList.get(j)) {
						long a = change(numList.remove(j),numList.remove(j),opList.remove(j));
						numList.add(j,a);
						j--;
						
					}
				}
			}
			
			answer = Math.max(answer, Math.abs(numList.get(0)));
			
			
			return;
			
		}
		
		
		for(int i=0;i<3;i++) {
			if(!visited[i]) {
				visited[i] = true;
				p[i] = op[b];
				dfs(p,b+1);
				visited[i] = false;
			}
		}
		
		
		
		
	}

}
