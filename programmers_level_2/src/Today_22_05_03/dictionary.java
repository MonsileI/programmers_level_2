package Today_22_05_03;

public class dictionary {

	public static void main(String[] args) {
		
		String word = "I";
		int result =word.length();

		
		//1
		//6
		//31
		//156
		//781
		
		int [] arr = {781,156,31,6,1};
		
		String s = "AEIOU";
		
		for(int i=0;i<word.length();i++) {
			
			int idx = s.indexOf(word.charAt(i));
			
			result += arr[i]* idx;
			
		}
		
		System.out.println(result);
		
	}
	
	
}
