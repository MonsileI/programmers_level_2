package Today_22_04_28;

public class bracket {

	public static void main(String[] args) {
		
		String s = ")()(";
		boolean answer = false;
		int open = 0;
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			
			if(ch=='(') open++;
			else open--;
			
			if(open<0) break;
		}
		
		if(open==0) answer = true;
		
		System.out.println(answer);
		
		
	}
}
