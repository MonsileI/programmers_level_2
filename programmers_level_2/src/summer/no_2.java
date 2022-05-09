package summer;

import java.util.*;
import java.util.Map.Entry;

public class no_2 {

	static HashMap<String,ArrayList<String>> map = new HashMap<>();
	//호수 이름
	static HashMap<String,ArrayList<String>> myMap = new HashMap<>();
	
	public static void main(String[] args) {
		
		
		String[]rooms = {"[403]James", "[404]Azad,Louis,Andy", "[101]Azad,Guard"};
		
		int target = 403;
		
		ArrayList<String> answerList = new ArrayList<>();
		
		//한 사무실에선 하나의 지정석
		//지정 자리가 제일 적은 직원(총 수 ) 우선순위 가 가장 높다
		//동일하다면, 가장 가까운 방에 지정 자리가 있는 직원이 우선순위가 높다(절대값)
		//이름 사전순 우선순위(소문자보다 대문자가 높음)
		
	
		for(String str : rooms) {
			
			str = str.replaceAll("\\[", "");
			str = str.replaceAll("\\]", " ");
			String [] temp = str.split(" ");
			map.put(temp[0], new ArrayList<String>());
			
		}
		
		for(String str : rooms) {
			
			str = str.replaceAll("\\[", "");
			str = str.replaceAll("\\]", " ");
			
			String [] temp = str.split(" ");
			
			if(temp[1].contains(",")) {
				String[]dotTemp = temp[1].split(",");
				for(String s : dotTemp) map.get(temp[0]).add(s);
			}else {
				map.get(temp[0]).add(temp[1]);	
			}
			
		}
		
		for(String key : map.keySet()) {
			for(String str : map.get(key)) {
				if(!myMap.containsKey(str)) {
					myMap.put(str, new ArrayList<String>());					
				}
				myMap.get(str).add(key);
			}
		}
		String t = String.valueOf(target);
		ArrayList<String>remove = new ArrayList<>();
		
		for(String key : myMap.keySet()) {
				
		if(myMap.get(key).contains(t)) remove.add(key);
				
		}
				
				
		for(String str : remove) {
			myMap.remove(str);
		}
		

		System.out.println(myMap);
		
		for(int i=0;i<myMap.size();i++) {
			
			
			
		}
		
	
	}
	
	
}
