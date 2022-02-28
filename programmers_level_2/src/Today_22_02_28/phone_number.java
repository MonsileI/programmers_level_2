package Today_22_02_28;

import java.util.Arrays;

public class phone_number {

	public static void main(String[] args) {
		
		String[] phone_book = {"12","123","1235","567","88"};
		boolean answer = true;
		
		Arrays.sort(phone_book);
		
		String comp = phone_book[0];
		
		for(int i=1;i<phone_book.length;i++) {
			
			if(phone_book[i].startsWith(comp)) {
				answer =false;
				break;
			}
		}
		
		System.out.println(answer);
	}
}
