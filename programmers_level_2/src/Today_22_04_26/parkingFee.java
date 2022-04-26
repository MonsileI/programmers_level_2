package Today_22_04_26;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class parkingFee {
	
	public static void main(String[] args) {

		int[]fees = {180, 5000, 10, 600};
		
		String [] records = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
		
		TreeMap<String,Integer> tree = new TreeMap<>();
		HashMap<String,Integer>map = new HashMap<>();
		ArrayList<Integer>answerList = new ArrayList<Integer>();
		for(String s : records) {
			
			String [] temp = s.split(" ");
			
			int time = time(temp[0]);
			String num = temp[1];
			String action = temp[2];
			
			if(action.equals("IN")) map.put(num, time);
			else {
				
				if(tree.containsKey(num)) tree.put(num, tree.get(num) + (time - map.get(num)));
				else tree.put(num, time - map.get(num));
					
				map.remove(num);
			}
		}
		
		if(!map.isEmpty()) {
			for(String key : map.keySet()) {
				tree.put(key, tree.get(key) + (23*60+59) - map.get(key));
				
			}
		}
		map.clear();
		
		
		for(String key : tree.keySet()) {
			if(tree.get(key)<=fees[0]) {
				answerList.add(fees[1]);
			}else {
				double time = tree.get(key)- fees[0];
				int answer = fees[3]*(int)Math.ceil(time/fees[2]);
				answer += fees[1];
				answerList.add(answer);
			}
		}
		
		System.out.println(answerList);
		
	}
	static int time(String s) {
		
		String [] temp = s.split(":");
		int hour = Integer.parseInt(temp[0]) * 60;
		int min = Integer.parseInt(temp[1]) + hour;
		
		return min;
	}

}
