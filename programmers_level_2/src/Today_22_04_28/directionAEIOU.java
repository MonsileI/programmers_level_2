package Today_22_04_28;

public class directionAEIOU {

	public static void main(String[] args) {
		
		String word = "EIO";
		int answer = word.length();
		
		//5개
		
		//5 * 5 * 5 * 5 * 5
		
		//A A A A A 
		
		int[]x = {781,156,31,6,1};
		String str = "AEIOU";
		for(int i=0;i<word.length();i++) {
			int idx = str.indexOf(word.charAt(i));
			answer += x[i] * idx;
			
		}
		
		System.out.println(answer);
	}
}
