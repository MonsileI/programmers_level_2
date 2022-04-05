package Today_22_04_05;

import java.util.HashMap;

public class no_3 {
	
	public static void main(String[] args) {
		
		String[]participant = {"mislav", "stanko", "mislav", "ana"};
		String[]completion = {"stanko", "ana", "mislav"};
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i=0;i<participant.length;i++) {
			
			map.put(participant[i],map.getOrDefault(participant[i],0)+1);
			
		}
		
		

		String answer = "";
		
		for(int i=0;i<completion.length;i++) {
			
			if(map.containsKey(completion[i])) {
				map.replace(completion[i], map.get(completion[i])-1);
			}
			
		}
		
		for(String s : map.keySet()) {
			if(map.get(s)!=0) answer=s;
		}
		
		System.out.println(answer);
	}

}
