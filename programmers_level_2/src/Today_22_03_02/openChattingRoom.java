package Today_22_03_02;

import java.util.ArrayList;

public class openChattingRoom {
	
	public static void main(String[] args) {
		
		String[] record = {	"Enter uid1234 Muzi", 
							"Enter uid4567 Prodo",
							"Leave uid1234",
							"Enter uid1234 Prodo",
							"Change uid4567 Ryan"};
	
		ArrayList<String> list = new ArrayList<>();
		
		//맨~~뒤에 값으로 다 바꿔준다 5 4 3 2 1 이미 바뀌었으니까, 어차피 같은 값으로 입력됨
		
		for(int i=record.length-1;i>=0;i--) {
			
			if(record[i].contains("Change")||record[i].contains("Enter")) {
				String[] change = record[i].split(" ");
				for(int j=i-1;j>=0;j--) {
					if(record[j].contains(change[1])) {
						String[] newRec = record[j].split(" ");
						record[j] = newRec[0] + " " + newRec[1] + " " + change[2];
					
					}
				}
				
			}
			
		}
		
		for(int i=0; i<record.length;i++) {
			
			String[]result = record[i].split(" ");
			
			if(result[0].equals("Enter")) {
				String come = result[2]+"님이 들어왔습니다.";
				list.add(come);
			}else if(result[0].equals("Leave")) {
				String come = result[2]+"님이 나갔습니다.";
				list.add(come);
			}
			
		}
		
		String[]result = new String[list.size()];
		
		for(int i=0;i<list.size();i++) {
			
			result[i] = list.get(i);
		}
	
		for(String s : result) System.out.println(s);
	
	}
	
	

}
