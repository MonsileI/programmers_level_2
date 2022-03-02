package Today_22_02_28;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class openChattingOthers {
	
	public static void main(String[] args) {
		
		String [] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		
		HashMap<String, String> hash = new HashMap<String, String>();
		
		for(String s : record) {
			
			String[]input = s.split(" ");
			
			if(input[0].equals("Enter")||input[0].equals("Change")) hash.put(input[1], input[2]);
			
		}
		
		ArrayList<String> answer = new ArrayList<>();
	
		for(int i=0;i<record.length;i++) {
			
			String[]input = record[i].split(" ");
			
			if(input[0].equals("Change")) continue;
			
			
			String ID = input[1];
			String Nick = hash.get(ID);
			
			String ans = Nick+"님이 "+ (input[0].equals("Enter") ? "들어왔습니다." : "나갔습니다.");
			
			answer.add(ans);
			
		}
		
		String[]result = new String[answer.size()];
		result = answer.toArray(result);
		
		for(String s : result) System.out.println(s);
		
	}

}
