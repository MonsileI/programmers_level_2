package Today_22_04_28;

public class ExpressionNumber {

	
	public static void main(String[] args) {
		
		int n = 15;
		int answer = 0;
		
		int[]arr = new int[n];
		
		int start = 1;
		
		while(start<=n) {
			
			int sum = 0;
			for(int i=start;i<=n;i++) {
				sum += i;
				if(sum==n) {
					answer++;
					start++;
					break;
				}else if(sum>n) {
					start++;
					break;
				}
				
			}
		}
		
			if(n==1)answer=1;
			System.out.println(answer);
		
		
		
	}
}
