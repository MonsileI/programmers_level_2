package Today_22_04_27;

public class ExpressionNumbers {
	
	static int answer = 0;
	
	public static void main(String[] args) {
		
	int n = 15;
	
	int []num = new int[n];
	
	for(int i=1;i<=n;i++) num[i-1] = i;

	int start = 0;
	
	while(start<=n) {
		
		int sum = 0;
		
		for(int i=start;i<=n;i++) {
			
			sum += i;
			
			if(sum==n) {
				answer++;
				start++;
			}else if(sum>=n) {
				start++;
				break;
			}
			
		}
		
		
	}

	if(n==1) answer = 1;
	System.out.println(answer);
	
	
		
	}
}
