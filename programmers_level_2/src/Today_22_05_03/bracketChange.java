package Today_22_05_03;

public class bracketChange {

	
	public static void main(String[] args) {
		
		
		String p = ")(";
		
		String answer = convert(p);
		
		System.out.println(answer);
		
		
	}


	static String convert(String w) {
		
	if(w.equals("")) return "";
		
	int i;
	int right = 0;
	int left = 0;
	for(i=0;i<w.length();i++) {
		char ch = w.charAt(i);
		
		if(ch=='(')left++;
		else right++;
		
		if(right==left)break;
	}
	
	String u = w.substring(0,i+1);
	String v = w.substring(i+1);
	
	if(isRight(u)) {
		u += convert(v);
	}else {
		String str = "(" + convert(v) + ")";
		u = u.substring(1,u.length()-1);
		u = u.replaceAll("\\)", ".");
		u = u.replaceAll("\\(", ")");
		u = u.replaceAll("\\.", "(");
		str += u;
		return str;
	}
	return u;
		
	}
	static boolean isRight(String u) {
		while(!u.equals("")) {
			if(u.charAt(0)==')')return false;
			
			u = u.replaceAll("\\(\\)", "");
		}
		return true;
	}
}
