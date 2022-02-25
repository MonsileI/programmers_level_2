package Today_22_02_25;

public class jumpAndTeleport {
	
	public static void main(String[] args) {
		
	
		int N = 5;
		int result = 0;
		
		while(N!=0) {
			if(N%2==0) {
				N /= 2;
			}else {
				N--;
				result++;
			}
			
		}
		
		System.out.println(result);
		
	}

}
