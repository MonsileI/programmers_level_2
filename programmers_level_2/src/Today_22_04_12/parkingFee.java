package Today_22_04_12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class parkingFee {

	public static void main(String[] args) {
		
		
		int[]fees = {180, 5000, 10, 600};
		String [] records = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
	
		HashMap<String,Integer> map = new HashMap<>();
		TreeMap<String,Integer> tree = new TreeMap<>();
		
		for(String s : records) {
			
			String []temp = s.split(" ");
			
			int minute = change(temp[0]);
			String carNum = temp[1];
			String action = temp[2];
			
			if(action.equals("IN")) {
				
				map.put(carNum, minute);
				
				if(!tree.containsKey(carNum)) tree.put(carNum, 0); 
				
		
				
			}else if(action.equals("OUT")) {
				
				tree.put(carNum, tree.get(carNum) + minute - map.get(carNum));
				
				map.remove(carNum);
			}
			
			
			
		}
		
		if(!map.isEmpty()) {
			
			for(String key : map.keySet()) {
				
				tree.put(key, tree.get(key)+ ((23*60+59) - map.get(key)));
				map.remove(key);
			}
		}
		
		
		ArrayList<Integer> temp  = new ArrayList<>(tree.values());
		
		int [] result = new int[temp.size()];		
		
		for(int i=0;i<temp.size();i++) {
			
			double check = temp.get(i);
			
			if(check<=fees[0]) {
				result[i] = fees[1];
			}else {
				
				result[i] += fees[1];
				check -= fees[0];
				double extra = fees[2];
				double time = Math.ceil(check/extra);
				
				result[i] += fees[3] *time;
			}
		}
		
		for(int i : result)System.out.println(i);
		
	}
	public static int change(String time) {
		
		
		String []temp = time.split(":");
		
		int hour = Integer.parseInt(temp[0]);
		int min = Integer.parseInt(temp[1]) + hour*60;
		
		return min;
		
		
	}
}
