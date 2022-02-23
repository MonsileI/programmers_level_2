package third_22_02_21;

public class nextBiggerNumber {
	
	public static void main(String[] args) {
		
		int n = 15;
		int answer = n+1;
		
		String strN = Integer.toBinaryString(n);

		int countN = 0;
		for(int i=0;i<strN.length();i++) {
			
			if(strN.charAt(i)=='1') countN++;
		
		}
		
		
		
		while(true) {
			String strA = Integer.toBinaryString(answer);
			int countA = 0;
			
			for(int i=0;i<strA.length();i++) {
				if(strA.charAt(i)=='1') countA++;
			}
			
			if(countA==countN) {
				break;
			}
			answer++;
			
		}
		
		System.out.println(answer);

	}

}
