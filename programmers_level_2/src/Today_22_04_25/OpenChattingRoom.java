package Today_22_04_25;

import java.util.HashMap;
import java.util.ArrayList;

public class OpenChattingRoom {

	public static void main(String[] args) {
		
		String[]record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		
		
		HashMap<String,String>user = new HashMap<>();
		
		ArrayList<String>answerList = new ArrayList<>();
		
		
		for(String str : record) {
			
			String[]temp = str.split(" ");
			
			String action = temp[0];
			
			if(action.equals("Leave"))continue;
			
			String id = temp[1];
			String nick = temp[2];
			
			
			user.put(id, nick);
			
		}
		
		
		for(String str  :record) {
			
			
			String[]temp = str.split(" ");
			
			String action = temp[0];
			
			if(action.equals("Change"))continue;
			
			String id = temp[1];
			String nick = user.get(id);
			
			String ans = "";
			
			ans = nick+"님이 " + (action.equals("Enter") ? "들어왔습니다." : "나갔습니다.");
			
			answerList.add(ans);
		}
		
		
		String[]answer = new String[answerList.size()];
		
		for(int i=0;i<answerList.size();i++) answer[i] = answerList.get(i);
		
		for(String s : answer)System.out.println(s);
		
	}
}
