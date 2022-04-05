package Today_22_04_05;

import java.util.ArrayList;
import java.util.HashMap;

public class no_1 {
	
	public static void main(String[] args) {
		
		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		for(int i=0;i<record.length;i++) {
			
			String[]check = record[i].split(" ");
			
			if(check.length<3) continue;
			String id = check[1];
			String nick = check[2];
			map.put(id, nick);
			
			
		}
		
		ArrayList<String> answer = new ArrayList<String>();
		
		for(int i=0;i<record.length;i++) {
			
			String []check = record[i].split(" ");
			
			String action = check[0];
			
			if(action.equals("Change")) continue;
			
			String nick = map.get(check[1]);
			
			String ans = nick + "님이 " + (action.equals("Enter") ? "들어왔습니다." : "나갔습니다.");
			
			answer.add(ans);
			
			
		}
		
		String [] result = new String[answer.size()];
		
		for(int i=0;i<answer.size();i++) result[i] = answer.get(i);
		
		for(String i : result)System.out.println(i);
		
	}

}
