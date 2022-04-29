package Today_22_04_29;

import java.util.ArrayList;
public class test2 {

	static char[] prior = {'+','-','*'};
	static boolean[] check = new boolean[3];
	static ArrayList<Long>nums = new ArrayList<>();
	static ArrayList<Character>ops = new ArrayList<>();
	static long answer;
	

	public static void main(String[] args) {
	
	
	String expression = "100-200*300-500+20";
	
	
	answer = 0;
	String num="";
	
	for(int i=0;i<expression.length();i++) {
		
		if(expression.charAt(i)>='0'&&expression.charAt(i)<='9') {
			num += expression.charAt(i);
		}else {
			nums.add(Long.parseLong(num));
			num = "";
			ops.add(expression.charAt(i));
		}
		
	}
	
	nums.add(Long.parseLong(num));
	dfs(0,new char[3]);
	
	System.out.println(answer);
	
	
	

	}
	
	static Long calc(Long num1,Long num2,char op) {
		long num=0;
		switch (op) {
		case '+': return num1+num2;
		case '-': return num1-num2;
		case '*': return num1*num2;
		
		}
		return num;
	}
	
	static void dfs(int count, char[]p) {
		
		if(count==3) {
			ArrayList<Long>newNums = new ArrayList<>(nums);
			ArrayList<Character>newOps = new ArrayList<>(ops);
			
			for(int i=0;i<p.length;i++) {
				for(int j=0;j<newOps.size();j++) {
					if(p[i]==newOps.get(j)) {
						Long res = calc(newNums.remove(j),newNums.remove(j),p[i]);
						newNums.add(j,res);
						newOps.remove(j);
						j--;
					}
				}
			}
			
			answer = Math.max(answer, Math.abs(newNums.get(0)));
			return;
			
		}
		
		
		for(int i=0;i<prior.length;i++) {
			if(!check[i]) {
				check[i] = true;
				p[count] = prior[i];
				dfs(count+1,p);
				check[i] = false;
			}
		}
		
		
	}
}