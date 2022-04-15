package Today_22_04_12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class menuRenewal {

	static List<String> answerList = new ArrayList<>();
	static HashMap<String,Integer> map = new HashMap<>();
	
	public static void main(String[] args) {
		
		String[]orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
		int[]course = {2,3,4};
		
		for(int i=0;i<orders.length;i++) {
			char[]temp = orders[i].toCharArray();
			Arrays.sort(temp);
			orders[i] = String.valueOf(temp);
		}
		
		
		for(int count : course) {
			for(String order : orders) {
				
				
				check(count,order,"");
				
				
			}
			if(!map.isEmpty()) {
				ArrayList<Integer> maxValue = new ArrayList<>(map.values());
				int maxInteger = Collections.max(maxValue);
				
				if(maxInteger>1) {
					
					for(String key : map.keySet()) {
						if(maxInteger==map.get(key)) {
							answerList.add(key);
						}
					}
				}
			}
			
			map.clear();
			
			
			
			
		}
		
		Collections.sort(answerList);
		
		String[] result = new String[answerList.size()];
		
		for(int i = 0 ; i<answerList.size();i++) result[i] = answerList.get(i);
		
		for(String s : result)System.out.println(s);
		
	}
	public static void check(int count,String order,String now) {
	
		if(count==0) map.put(now, map.getOrDefault(now, 1)+1);
		
		for(int i=0;i<order.length();i++) {
			check(count-1,order.substring(i+1),now+order.charAt(i));
		}
		
	}
}
