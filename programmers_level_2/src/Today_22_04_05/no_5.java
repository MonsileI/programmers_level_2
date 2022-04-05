package Today_22_04_05;

import java.util.HashMap;

public class no_5 {
	
	public static void main(String[] args) {
		
	String[][]clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
	
	HashMap<String,Integer>map = new HashMap<>();
	
	for(int i=0;i<clothes.length;i++) {
		String sort = clothes[i][1];
		
		map.put(sort, map.getOrDefault(sort, 0)+1);
	}
	
	int answer = 1;
	
	for(String s : map.keySet()) {
		
		answer *= map.get(s) + 1;
		
	}
	
	System.out.println(answer-1);
	
	}

}
