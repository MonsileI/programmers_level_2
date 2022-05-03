package Today_22_05_03;

import java.util.HashMap;

public class nGame {
	
	public static void main(String[] args) {
	
		int n = 2;
		int t = 4;
		int m = 2;
		int p = 1;
		
		int num = 0;
		int turn = 0;
		String answer = "";
		
		OuterLoop:
		while(true) {
			String converted = getConverStr(num, n);
			
			if(converted.length()==0) {
				converted = "0";
			}
			
			for(int i=0;i<converted.length();i++) {
				if(turn % m+1  ==p) { //여기가 이해하기 어려운 부분
					answer += converted.charAt(i);
					
					if(answer.length()>=t) {
						break OuterLoop;
					}
				
				}
				turn ++; //순서대로 말해야 하기 때문에 여기서 올려준다(두글자일 경우, 세글자일 경우)
			}
			num++;
			
		}
		System.out.println(answer);
		
		
	}
	static String getConverStr(int num,int n) {
		
		StringBuilder builder = new StringBuilder();
		
		HashMap<Integer,String> map = new HashMap<>();
		map.put(10,"A");
		map.put(11,"B");
		map.put(12,"C");
		map.put(13,"D");
		map.put(14,"E");
		map.put(15,"F");
		
		while(num>=1) {
			int tmp = num%n;
			builder.insert(0, tmp < 10 ? tmp : map.get(tmp));
			num /= n;
		}
		return builder.toString();
	}

}
