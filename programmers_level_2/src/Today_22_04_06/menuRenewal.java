package Today_22_04_06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class menuRenewal {
	
	public static ArrayList<String>answerList = new ArrayList<>();
	
	public static HashMap<String,Integer>hashMap = new HashMap<>();
	
	
	public static void main(String[] args) {
		
		//코스요리 주문한 수가 최소 2명 이상일때만 추가시켜줌
		//그 course 값의 최고 많은 값만 추가
		//많은 값이 2개 이상일 경우 모두 추가시켜준다
		
		String[]orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
		int[]course = {2,3,4};
		
		
		for(int i=0;i<orders.length;i++) {
			
			char[]temp = orders[i].toCharArray();
			Arrays.sort(temp);
			orders[i] = String.valueOf(temp);
			
		}
		
		for(int count : course) {
			for(String order : orders) {
				combination("",order,count);
			}
			
			if(!hashMap.isEmpty()) {
				ArrayList<Integer>maxInteger = new ArrayList<Integer>(hashMap.values());
				int max = Collections.max(maxInteger);
				
				if(max>1) {
					for(String key : hashMap.keySet()) {
						if(max==hashMap.get(key)) {
							answerList.add(key);
						}
					}
				}
			}
			hashMap.clear();
			
			
		}
		
		Collections.sort(answerList);
		
		String[]answer = new String[answerList.size()];
		
		for(int i = 0;i<answerList.size();i++) answer[i] = answerList.get(i);
		
		for(String s : answer)System.out.println(s);
		
		
		
	}
	public static void combination(String now,String order,int count) {
		
		if(count==0) {
			hashMap.put(now, hashMap.getOrDefault(now, 0)+1);
			return;
		}
		
		
		for(int i=0;i<order.length();i++) {
			
			combination(now+order.charAt(i),order.substring(i+1),count-1);
			
		}
		
	}
	
}
