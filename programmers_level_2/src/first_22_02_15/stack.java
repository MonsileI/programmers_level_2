package first_22_02_15;

import java.util.Stack;

public class stack {

	public static void main(String[] args) {

		String s = "baabaa";
		
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.add(1);
		stack.add(2);
		stack.add(3);
		stack.add(4);
		stack.add(5);
		stack.pop();
		stack.push(11111);
		System.out.println(stack);
		System.out.println(stack.peek());
		
	}
}
