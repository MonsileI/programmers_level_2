package Today_22_04_25;

import java.util.Stack;

public class coupleEraze {

	public static void main(String[] args) {
		
		String s = "cdcd";
		int answer = 0;
		
		Stack<Character> stack = new Stack<>();
		
		for(int i=0;i<s.length();i++) {
			
			if(stack.isEmpty()) {
				stack.add(s.charAt(i));
			}else {
				if(stack.peek() == s.charAt(i))stack.pop();
				else stack.add(s.charAt(i));	
			}
			
			
		}
		
		if(!stack.isEmpty()) answer = 0;
		else answer = 1;
		
		System.out.println(answer);
		
	}
}
