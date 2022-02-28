package Today_22_02_27;

public class joyStick {
	
	public static void main(String[] args) {
		
		String name = "JEROEN";
		int answer = 0 ;
		
		char[] alpha = {'A','B','C','D','E',
						'F','G','H','I','J',
						'K','L','M','N','O','P'
						,'Q','R','S','T','U',
						'V','W','X','Y','Z'};
		
		for(int i=0;i<name.length();i++) {
			
			char ch = name.charAt(i);
			
			for(int j=0;j<alpha.length;j++) {
				
				if(ch >= 'N') {
					
					while(ch==0) {
						ch = ch--;
						answer++;
						
					}
		
				}else {
					break;
					
				}
				
			}
			
			
		}
		System.out.println(answer);
		
	}

}
