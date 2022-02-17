package first_22_02_15;


import java.util.Stack;


public class StringChangeDFS {
	
	public static void main(String[] args) {
		
		String p = "(()())()";
		if(!check(p)){
			System.out.println(p);
		}else {
			System.out.println(dfs(p));
		}
	
		
		
	}
	
	public static boolean check(String s) {
		Stack<Character> stack = new Stack<>();
		for(int i =0;i<s.length();i++) {
			char c = s.charAt(i);
				if(c=='(') {
					stack.add(c);
				}else {
					if(stack.isEmpty()) {
						return false;
					
					}else {
						stack.pop();
					}
				}
				if(stack.isEmpty()) {
					return false;
				}
			
		}
		return true;
	}
	
	public static String dfs(String w) {
		if(w.length()==0) {
			return "";
		}
		String u ="";
		String v ="";
		int cnt1 = 0;
		int cnt2 = 0;
		for(int i=0;i<w.length();i++) {
			char c = w.charAt(i);
			if(c=='(') {
				cnt1++;
			}else {
				cnt2++;
			}
			
			if((cnt1 != 0 && cnt2 != 0) && cnt1 == cnt2) {
				u = w.substring(0, i+1);
				if(i != w.length()-1) {
					v = w.substring(i+1, w.length());
				}
				break;
				
			}
		}
		
		if(!check(u)) {
			String tmp = "(" + dfs(v);
			tmp += ")";
			u = u.substring(1,u.length()-1);
			u = u.replace("(", ".");
			u = u.replace(")", "(");
			u = u.replace(".", ")");
			tmp += u;
			return tmp;
		}else {
			return u + dfs(v);
		}
	}
	
	
}
