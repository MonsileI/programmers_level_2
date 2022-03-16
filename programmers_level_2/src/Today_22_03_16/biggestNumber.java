package Today_22_03_16;

public class biggestNumber {

	static int answer = 0;

	public static void main(String[] args) {
	
		String number = "1231234";
		int k =3;
		
		int idx = 0;
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<number.length()-k;i++) {
			
			int comp = 0;
			for(int j=0;j<=i+k;j++) {
				
				if(comp<number.charAt(j)-'0') {
					comp =number.charAt(j)- '0';
					idx = j+1;
				}
				
			}
			
			sb.append(comp);
		}
		
		System.out.println(sb.toString());
		
	}
	
	
}
