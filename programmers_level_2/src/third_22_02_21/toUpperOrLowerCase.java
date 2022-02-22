package third_22_02_21;

import java.util.Arrays;

public class toUpperOrLowerCase {

	public static void main(String[] args) {
		
		String s = "3people unFollowed me";
		
		StringBuilder sb = new StringBuilder();
		
		s = s.toLowerCase();
		
		sb.append(Character.toUpperCase(s.charAt(0)));
		
		for(int i=1;i<s.length();i++) {
			if(s.charAt(i) == ' ') {
				sb.append(" ");
			}else if(s.charAt(i-1)==' ') {
				sb.append(Character.toUpperCase(s.charAt(i)));
			}else {
				sb.append(s.charAt(i));
			}
			
			
		}
		
			
		System.out.println(sb.toString());
	
	}
}
