package third_22_02_21;

public class bitCountUsing {
	
	public static void main(String[] args) {
		
		int n = 78;
		int compare = n+1;
		int answer = bit(n,compare);
		
		System.out.println(answer);
		
	}
	public static int bit(int n,int compare) {
		
		int a = Integer.bitCount(n);
		
		while(true) {
			int b = Integer.bitCount(compare);
			if(a==b)break;
			compare++;
		}
		
		return compare;
	}

}
