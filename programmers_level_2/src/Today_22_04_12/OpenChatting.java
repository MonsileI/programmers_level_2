package Today_22_04_12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OpenChatting {

	public static void main(String[] args) {
		
		
		String[]record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		
		List<String> result = new ArrayList<>();
		
		HashMap<String,String> idAndNick = new HashMap<>();
		
		
		for(int i=0;i<record.length;i++) {
			
			String[]temp = record[i].split(" ");
			
			String action = temp[0];
			
			if(action.equals("Leave")) continue;
			
			String id = temp[1];
			String nick = temp[2];
			idAndNick.put(id,nick);
			
		}
		
		
		for(int i=0;i<record.length;i++) {
			
			String[]temp = record[i].split(" ");
			
			String action = temp[0];
			
			if(action.equals("Change")) continue;
			
			String id = temp[1];
			String nick = idAndNick.get(id);
			
			String ans = nick+"님이 " + (action.equals("Enter") ? "들어왔습니다." : "나갔습니다.");
			result.add(ans);
		}
		
		String[]answer = new String[result.size()];
		
		for(int i=0;i<result.size();i++) answer[i] = result.get(i);
		
		for(String s : answer)System.out.println(s);
	}
}
