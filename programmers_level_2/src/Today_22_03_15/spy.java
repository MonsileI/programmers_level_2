package Today_22_03_15;

import java.util.HashMap;
import java.util.Iterator;

public class spy {
	
	public static void main(String[] args) {
		
		String[][] clothes = {{"yellowhat", "headgear"},
		                      {"bluesunglasses", "eyewear"},
		                      {"green_turban", "headgear"}};
		
	
		int answer = 1;
		
		HashMap<String,Integer> map = new HashMap<>();
		
		for(int i=0;i<clothes.length;i++) {
			
			String key = clothes[i][1];
			
			if(!map.containsKey(key)) {
				
				map.put(key, 1);
				
			}else {
				
				map.put(key, map.get(key)+1);
				
			}
			
		}
		
		
		Iterator<Integer> it = map.values().iterator();
		
		while(it.hasNext()) {
			
			answer *= it.next().intValue()+1;
		}
		
		System.out.println(answer-1);
		
	}

}
