package Today_22_04_06;

public class joyStick {

	public static void main(String[] args) {
		
		
		String name = "JEROEN";
		int answer = 0;
		
		int LR = name.length()-1;
		
		for(int i=0;i<name.length();i++) {
			
			char ch = name.charAt(i);
			
			answer += Math.min(ch-'A',26 - (ch-'A'));
			
			int idxA = 0+i;
			
			while(idxA<name.length()&&name.charAt(idxA)=='A') {
				
				idxA++;
				
			}
			
			LR = Math.min(LR, (i*2) + name.length()-idxA);
			
		}
		
		System.out.println(answer+LR);
	
	}
}
