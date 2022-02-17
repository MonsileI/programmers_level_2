package second_22_02_17;

import java.util.Arrays;

public class phoneNumberList {

	public static void main(String[] args) {
		
		
		String[]phone_book = {"119", "97674223", "1195524421"};
		
		boolean answer = true;
		
		Arrays.sort(phone_book);
		
		String check = phone_book[0];
		
		for(int i=1;i<phone_book.length;i++) {
			
			if(phone_book[i].startsWith(check)) {
				answer = false;
				break;
			}
		}
		
		System.out.println(answer);
	}
	
}
