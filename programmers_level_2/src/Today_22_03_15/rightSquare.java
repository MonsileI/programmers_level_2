package Today_22_03_15;

public class rightSquare {
	
	public static void main(String[] args) {
		
		long w = 12;
		long h = 8;
		long answer = 0;
		
		
		answer = (w*h)-(w+h - gcd(w,h));
		
		System.out.println(answer);
		
	}
	
	public static long gcd(long w, long h) {
		
		long r = 0;
		while(h>0) {
			r = w%h;
			w = h;
			h = r;
			
			
		}
		
		return w;
		
	}

}
