package third_22_02_21;


public class Fibonacci {
	
	public static void main(String[] args) {
		
		int n = 3;
		int a = 0;
		int b = 1;
		int temp = 0;
	
		for(int i=2;i<=n;i++) {
			temp = (a+b)%1234567;
			a = b;
			b = temp;
			
		}
		
		System.out.println(temp);
	}

}
