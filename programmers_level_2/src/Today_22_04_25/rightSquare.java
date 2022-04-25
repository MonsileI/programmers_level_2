package Today_22_04_25;

public class rightSquare {

	public static void main(String[] args) {
		
		long w = 8;
		long h = 12;
		
		//8 12 = 16 // (20 - 4) 합계 - 최대공약수
		//3 4 = 6 // (7 - 1) 합계 - 최대공약수
		
		long answer = (w*h) - (w+h - gcd(w,h));
		System.out.println(gcd(w,h));
		System.out.println(answer);
		
		
	}
	static long gcd(long a, long b) {
		
		long r = 0;
		long min = Math.min(a, b);
		long max = Math.max(a, b);
		
		while(min>0) {
			r = max%min;
			max = min;
			min = r;
		}
	
		return max;
	}
}
