package Today_22_04_12;

public class rightSquare {

	public static void main(String[] args) {
		
		int w = 8;
		int h = 12;
		int result = 0;
		
		result = (w*h) - ((w+h) - (gcd(w,h)));
		
		System.out.println(result);
		
		
	}
	public static int gcd(int w, int h) {
		
		int max = Math.max(w, h);
		int min = Math.min(w, h);
		int r = 0;
		while(max>0) {
			r = max%min;
			min = max;
			max = r;
		}
		
		
		return min;
		
	}
}
