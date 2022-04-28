package Today_22_04_28;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;
import java.util.Collections;

public class menuRenewal {
	
	static ArrayList<String> answerList = new ArrayList<>();
	static HashMap<String,Integer> map = new HashMap<>();
	
	
	public static void main(String[] args) {
		
		String [] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
		int [] course = {2,3,4};
		
		
		for(int i=0;i<orders.length;i++) {
			
			char[]temp = orders[i].toCharArray();
			
			Arrays.sort(temp);
			
			orders[i] = String.valueOf(temp);
			
		}
		
		for(int count : course) {
			for(String order : orders) {
				check("",order,count);
				
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
		
		String[]answer= new String[answerList.size()];
		
		for(int i=0;i<answerList.size();i++)answer[i] = answerList.get(i);
		
		for(String str : answer) System.out.println(str);
		
	}
	static void check(String now,String order,int r) {
		
		if(r==0) {
			map.put(now,map.getOrDefault(now, 0)+1);
			return;
		}
		
		
		for(int i=0;i<order.length();i++) {
			
			check(now+order.charAt(i),order.substring(i+1),r-1);
			
			
		}
		
		
	}

}
