package Today_22_03_17;

import java.util.HashSet;

public class English_words_again {
	
	public static void main(String[] args) {
	
		
		//set는 어려우니까 눈뜨자마자 다시 복습해봅시다 ㅠㅠ
		int n = 5;
		String[]words = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
		
		//첫번째 넣고 시작하니까 사람은 두번째 사람부터 돌자
		int person = 2;
		int round = 1;
		
		HashSet<String>set = new HashSet<String>();
		
		set.add(words[0]);
		
		char last = words[0].charAt(words[0].length()-1);
		
		for(int i=1;i<words.length;i++) {
			
			String word = words[i];
			
			char first = words[i].charAt(0);
			
			if(set.contains(word)||last!=first) break;
			
			set.add(word);
			
			last = words[i].charAt(words[i].length()-1);
			//이부분 순서 잘 생각해! 컴퓨터처럼 생각해봅시다!
			person++;

			if(person>n) {
			
				
				person = 1;
				round++;
			}
			
			
			
			
		}
		
		int[]answer = new int[2];
		
		if(set.size()==words.length) {
			answer[0] = 0;
			answer[1] = 0;
		}else {
			answer[0] = person;
			answer[1] = person;
		}
		
		System.out.println(answer[0]+","+answer[1]);
		
	}

}
