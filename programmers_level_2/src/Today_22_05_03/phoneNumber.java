package Today_22_05_03;

import java.util.HashMap;

public class phoneNumber {

	
	public static void main(String[] args) {
		
		
		String [] phone_book = {"123", "456", "789"};
		
		boolean answer = true;
		
		HashMap<String,Integer>map = new HashMap<>();
		
		for(int i=0;i<phone_book.length;i++) {
			map.put(phone_book[i],i);
		}
		System.out.println(map);
		
		OuterLoop:
		for(int i=0;i<phone_book.length;i++) {
			for(int j=1;j<phone_book[i].length();j++) {
				System.out.println(phone_book[i].substring(0,j));
				if(map.containsKey(phone_book[i].substring(0,j))) {	
					answer = false;
					break OuterLoop;
				}
			}
		}
		
		
		
		System.out.println(answer);
	}
}
