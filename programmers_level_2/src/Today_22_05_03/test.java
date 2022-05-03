package Today_22_05_03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class test {

	public static void main(String[] args) {
		
		String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
		
		s = s.replaceAll("\\{", "");
		s = s.replaceAll("\\}", "");
		
		String [] temp = s.split(",");
		
		HashMap<String,Integer> map = new HashMap<>();
		
		
		for(int i=0;i<temp.length;i++) map.put(temp[i], map.getOrDefault(temp[i], 0)+1);
			
		System.out.println(map);
		
		ArrayList<Integer>answerList = new ArrayList<>();
	
		List<Map.Entry<String, Integer>> entryList = new LinkedList<>(map.entrySet());
		entryList.sort(((o1, o2) -> map.get(o2.getKey()) - map.get(o1.getKey())));
		for(Map.Entry<String, Integer> entry : entryList){
		    answerList.add(Integer.parseInt(entry.getKey()));
		}
		
		System.out.println(answerList);
		
			
		
		
	}
}
