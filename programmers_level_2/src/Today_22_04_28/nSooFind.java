package Today_22_04_28;

import java.util.ArrayList;

public class nSooFind {
	
	
	public static void main(String[] args) {
		
		
		
		int n = 437674;
		int k = 3;
		int answer = 0;
		String ans = "";
		
		while(n>0) {
			ans = (n%k) + ans;
			n = n/k;
		}
		
		System.out.println(ans);
		ArrayList<Long> list = new ArrayList<>();
		String temp = "";
		
	for(int i=0;i<ans.length();i++) {
		
		if(ans.charAt(i)=='0') {
			if(temp=="") continue;
			list.add(Long.parseLong(temp));
			temp = "";
		}else temp += ""+ans.charAt(i);
		
	}
	if(!temp.isEmpty()) list.add(Long.parseLong(temp));

	System.out.println(list);
	
	for(long i : list) {
		
		if(check(i)) {
			System.out.println(i);
			answer++;
		}
		
	
	}
	
	System.out.println(answer);
		
	}
	static boolean check(Long num) {
		
		if(num==1)return false;
		
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) return false;
			
		}
		
		return true;
		
		
	}

}
