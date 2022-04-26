package Today_22_04_26;

public class ChangeBracket {

	public static void main(String[] args) {
		String answer = "";
		String p = "()))((()";
		answer =convert(p);
		System.out.println(answer);
		
	}
	static String convert(String w) {
		if(w.equals("")) return "";
		
		int left = 0;
		int right =0;
		int i;
		for(i = 0 ;i<w.length();i++) {
			char s = w.charAt(i);
			if(s=='(') left++;
			else right++;
			
			if(left==right)break;
		}
		
		String u = w.substring(0,i+1);
		String v = w.substring(i+1);
		
		if(isRight(u)) {
			u += convert(v);
		}else {
			String emp = "(" + convert(v) + ")";
			u = u.substring(1,u.length()-1);
			u = u.replaceAll("\\(", "\\/").replaceAll("\\)", "\\(").replaceAll("\\/", "\\)");
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