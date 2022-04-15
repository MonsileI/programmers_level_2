package Today_22_04_12;

public class nQueen {

	static int answer = 0;
	static int n = 3;
	static int[]rows = new int[n];
	static int[]cols = new int[n];
	
	public static void main(String[] args) {
		
		back(0,n);
	
		System.out.println(answer);
	}
	
	public static void back(int idx,int n) {
		
		if(idx==n) {
			answer++;
			return;
		}
		
		for(int i=0;i<n;i++) {
		
			if(rows[i]==0) {
				rows[i] = 1;
				cols[idx] = i;
				if(check(idx)) back(idx+1,n);
				rows[i] = 0;
				
			}
			
		}
		
	}
	public static boolean check(int idx) {
		
		for(int i=0;i<idx;i++) {
			if(cols[i]==cols[idx]) return false;
			else if(Math.abs(i-idx)==Math.abs(cols[i]-cols[idx])) return false;
		}
		
		return true;
	}
	
}


