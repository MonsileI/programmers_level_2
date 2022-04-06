package Today_22_04_06;

public class joyStick {

	public static void main(String[] args) {
		
		
		String name = "JEROEN";
		int answer = 0;
		
		
		int LR = name.length()-1;
		
		
		for(int i=0;i<name.length();i++) {
			
			char ch = name.charAt(i);
			
			answer += Math.min(Math.abs(ch-'A'), Math.abs('Z'-ch));
			
			int idx = i+1;
			
			while(idx<LR&&name.charAt(idx)=='A') idx++;
			
			LR = Math.min(LR, (i*2)+name.length()-idx);
		}
		
		
		System.out.println(answer+LR);
		
	}
}
