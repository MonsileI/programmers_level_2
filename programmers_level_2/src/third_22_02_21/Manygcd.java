package third_22_02_21;

public class Manygcd {


	
	public static void main(String[] args) {
		
	
	
		int[]arr = {2,6,8,14};
	
		int answer = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			
			int gcd = gcd(answer,arr[i]);
			
			answer = answer * arr[i] / gcd;
		}
		
		System.out.println(answer);
		
		}
	
	public static int gcd(int a,int b) {
		
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		
		while(min>0) {
			int r = max%min;
			max = min;
			min = r;
		}
		
		return max;
		
		
	}
		
	}


