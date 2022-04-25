package Today_22_04_25;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.ArrayList;

public class MenuRenewal {
	
	static HashMap<String,Integer> map = new HashMap<>();
	static ArrayList<String>answerList = new ArrayList<>();
	
	public static void main(String[] args) {
		
		String[]orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
		int[]course = {2,3,4};
		
		for(int i=0;i<orders.length;i++) {
			
			char[]temp = orders[i].toCharArray();
			
			Arrays.sort(temp);
			
			orders[i] = String.valueOf(temp);
			
			
		}
		
		
		
		for(int count  : course) {
			for(String order : orders) {
				dfs("",order,count);
			}
			
			if(!map.isEmpty()) {
				ArrayList<Integer>maxValue = new ArrayList<>(map.values());
				int max = Collections.max(maxValue);
				if(max>1) {
					for(String key : map.keySet()) {
						if(map.get(key)==max) {
							answerList.add(key);
						}
					}
				}
			}
			
			map.clear();
		}
		
		Collections.sort(answerList);
		
		String[]answer = new String[answerList.size()];
		
		for(int i=0;i<answerList.size();i++) answer[i] = answerList.get(i);
		
		for(String s : answer)System.out.print(s + ",");
		
		
	}
	static void dfs(String now,String order , int count) {
		
		if(count==0) {
			map.put(now, map.getOrDefault(now, 0)+1);
		}
		
		
		for(int i=0;i<order.length();i++) {
			
			String newOne = now + order.charAt(i);
			
			dfs(newOne,order.substring(i+1),count-1);
			
		}
		
	}

}
