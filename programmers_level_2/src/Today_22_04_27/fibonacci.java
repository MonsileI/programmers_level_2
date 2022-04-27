package Today_22_04_27;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class fibonacci {
	
	public static void main(String[] args) {
	
		
		
	int [] fees= {120, 0, 60, 591};
	String [] records = {"16:00 3961 IN","16:00 0202 IN","18:00 3961 OUT","18:00 0202 OUT","23:58 3961 IN"};
		
	HashMap<String,Integer> map = new HashMap<>();
	TreeMap<String,Integer> tree = new TreeMap<>();
	for(String s : records) {
		
		String []temp = s.split(" ");
		int time = timeChange(temp[0]);
		String num = temp[1];
		String action = temp[2];
		
		if(action.equals("IN")) {
			if(!tree.containsKey(num)) tree.put(num, 0);
			map.put(num, time);
		}
		else {
			
			tree.put(num, tree.get(num) + (time - map.get(num)));
			map.remove(num);
		}
	}
		
	if(!map.isEmpty()) {
		for(String key : map.keySet()) {
			tree.put(key, tree.get(key) + (23*60+59) - map.get(key));
			
		}
	}
	
	ArrayList<Integer>answerList = new ArrayList<>();
	
	for(String key : tree.keySet()) {
		
		double time = tree.get(key);
		if(time<=fees[0]) {
			answerList.add(fees[1]);
		}else {
			time = time - fees[0];
			double cal = time/fees[2];
			int extraTime = (int) Math.ceil(cal);
			int fee = (extraTime * fees[3]) + fees[1];
			answerList.add(fee);			
		}
	}
		
	int[]answer = new int[answerList.size()];
	for(int i=0;i<answerList.size();i++)answer[i] = answerList.get(i);
	
	for(int i : answer)System.out.println(i);
		
	}
	static int timeChange(String str) {
		
		String[]temp = str.split(":");
		
		int hour = Integer.parseInt(temp[0]) * 60;
		int min = Integer.parseInt(temp[1]) + hour;
		
		return min;
		
		
	}
	
}
