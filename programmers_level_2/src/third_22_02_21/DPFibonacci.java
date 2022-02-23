package third_22_02_21;

public class DPFibonacci {


	public static void main(String[] args) {
		
		int fibo = 40;
		int[]arr = new int[fibo+1];

		arr[0] = 0;
		arr[1] = 1;
		
		if(fibo>1) {
			for(int i=2;i<=fibo;i++) {
				arr[i] = arr[i-2] + arr[i-1];
			}
		}
		
		
		System.out.println(arr[fibo]);
	}
}
