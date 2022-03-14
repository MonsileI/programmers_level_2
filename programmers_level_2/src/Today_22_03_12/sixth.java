package Today_22_03_12;

import java.util.Stack;

public class sixth {

	public static void main(String[] args) {
		
		
		String s = "baabaa";
		int answer = 0;
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<s.length();i++) {
			
			char ch = s.charAt(i);
			
			if(!stack.isEmpty()) {
				
				if(stack.peek()==ch) {
					stack.pop();
				}else {
					stack.add(ch);
				}
				
				
			}else {
				stack.add(ch);
			}
			
			
			
			
		}
		
		if(!stack.isEmpty()) answer =1;
		
		System.out.println(answer);
		
		
	}
}
