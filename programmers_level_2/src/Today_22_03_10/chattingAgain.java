package Today_22_03_10;

import java.util.ArrayList;
import java.util.HashMap;

public class chattingAgain {

	public static void main(String[] args) {
		
		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		String []result = {};
		
		
		HashMap<String,String>map = new HashMap<>();
		
		for(String s : record) {
			
			String[]check = s.split(" ");
			
			if(check[0].equals("Leave")) continue;
			
			map.put(check[1], check[2]);
			
		}
		
		ArrayList<String>list = new ArrayList<>();
		
		for(String s : record) {
			
			String[]check = s.split(" ");
			
			if(check[0].equals("Change")) continue;
			
			String id = check[1];
			String nick = map.get(id);
			
			String answer = nick + "님이 " + (check[0].equals("Enter") ? "들어왔습니다." : "나갔습니다.");
			list.add(answer);
			
		}
		
		result = list.toArray(result);
		
		for(String s : result) System.out.println(s);
		
	}
}
