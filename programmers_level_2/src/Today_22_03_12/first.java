package Today_22_03_12;

import java.util.ArrayList;
import java.util.HashMap;

public class first {

	public static void main(String[] args) {
		
		
		String [] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		
		HashMap<String,String> hash = new HashMap<>();
		
		for(String s : record) {
			
			String[]check = s.split(" ");
			
			if(check[0].equals("Leave")) continue;
			
			
			hash.put(check[1], check[2]);
			
		}
		
		ArrayList<String> list = new ArrayList<String>();
		
		for(String s : record) {
			
			String[]check = s.split(" ");
			
			if(check[0].equals("Change")) continue;
			
			String id = check[1];
			String nick = hash.get(id);
			
			String str = nick+"님이 " + (check[1].equals("Enter") ? "들어왔습니다." : "나갔습니다.");
			
			list.add(str);
			
			
		
			
		}
		String [] result = {};
		result = list.toArray(result);
		
		for(String s : result) System.out.println(s);
		
	}
}
