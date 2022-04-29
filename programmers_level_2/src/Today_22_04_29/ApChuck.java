package Today_22_04_29;

import java.util.ArrayList;

public class ApChuck {

	
	public static void main(String[] args) {
		
		
		String msg = "KAKAO";
		
		int []answer = {};
		
		ArrayList<String>dic = new ArrayList<>();
		ArrayList<Integer>answerList  = new ArrayList<>();
		
		String alp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		for(int i=0;i<alp.length();i++) dic.add(""+alp.charAt(i));
		
		
		String now = ""+msg.charAt(0);
		
		int idx = 1;
		
		while(idx<=msg.length()) {
			
			if(idx==msg.length()) {
				answerList.add(dic.indexOf(now)+1);
				break;
			}
			
			String next = ""+msg.charAt(idx);
			String newOne = now + next;
			
			if(dic.contains(newOne)) {
				now = newOne;
				idx++;
				continue;
			}
			
			answerList.add(dic.indexOf(now)+1);
			dic.add(newOne);
			now = next;
			idx++;
			
		}
		
		System.out.println(answerList);
	}
}
