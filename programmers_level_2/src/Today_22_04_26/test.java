package Today_22_04_26;

public class test {
	
	public static void main(String[] args) {
		
	
		String p = "()))((()";
		
		String answer = first(p);
		
		System.out.println(answer);
		
	}
	
	static String first(String w) {
		
		if(w.isEmpty()) return "";
		
		int right = 0;
		int left = 0;
		
	
		int i;
		for(i=0 ;i<w.length();i++) {
			
			if(w.charAt(i)=='(') right++;
			else left++;
			
			if(right==left) break;	
		}
		
		String u = w.substring(0,i+1);
		String v = w.substring(i+1);
		
		if(isRight(u)) {
			u += first(v);
		}else {
			String emp = "(" + first(v) + ")";
			u = u.substring(1,u.length()-1);
			u = u.replaceAll("\\(","\\/").replaceAll("\\)","\\(").replaceAll("\\/","\\)");
			emp += u;
			return emp;
		}
		return u;
		
	}
	static boolean isRight(String u) {
		while(!u.equals("")) {
			if(u.charAt(0)==')') {
				return false;
			}
			u = u.replaceAll("\\(\\)", "");
		}
		return true;
	
	}

}
