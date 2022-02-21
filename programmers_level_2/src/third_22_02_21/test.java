package third_22_02_21;

import java.util.Stack;

public class test {

	static int answer = 0;
	
	public static void main(String[] args) {
		
		String s = "baabaa";
		int answer = 0;
		
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(!stack.isEmpty()&&stack.peek()==ch) {
				stack.pop();
			}else {
				stack.push(ch);
			}
			
		}
		if(stack.isEmpty()) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		
		
		
	}
}