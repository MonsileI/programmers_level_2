package Today_22_03_16;


import java.util.HashMap;
import java.util.HashSet;


public class EnglishWord {

	public static void main(String[] args) {
		
		String[]words = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
		int n = 5;
		int person = 2;
		int round = 1;
		int[]answer = new int[2];
		HashSet<String> set = new HashSet<String>();
		
		set.add(words[0]);
		char last = words[0].charAt(words[0].length()-1);
		
		for(int i = 1;i<words.length;i++) {

			String now = words[i];
			char first = words[i].charAt(0);
			
			if(set.contains(words[i])||
				last!=first	) break;
			
			last = words[i].charAt(words[i].length()-1);
			set.add(now);
			person++;
			
			if(person>n) {
				person = 1;
				round++;
			}
		}
		
		System.out.println(set.size());s
		System.out.println(words.length);
		if(set.size()==words.length) {
			answer[0]= 0;
			answer[1]= 0;
		}else {
			answer[0] = person;
			answer[1] = round;
		}
		
		System.out.println(answer[0]+","+answer[1]);
	}
}
