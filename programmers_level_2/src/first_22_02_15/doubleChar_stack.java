package first_22_02_15;

import java.util.Stack;

public class doubleChar_stack {

	public static void main(String[] args) {
		
		String s = "cdcd";
		
		soo soo = new soo();
		
		System.out.println(soo.stack(s));
		
	}
}

class soo{
	
	public static int stack(String s) {
		
		Stack<Character>stack = new Stack<>();
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(!stack.isEmpty()&&stack.peek()==ch) {
				stack.pop();
			}else {
				stack.push(ch);
			}
			
		}
		
		if(stack.isEmpty()) {
			return  -1;
		}else {
			return 0;
		}
		
		
	}
}
