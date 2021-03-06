package Today_22_05_03;

public class apchuck {
	
	public static void main(String[] args) {
		
		String s = "aabbaccc";
		int answer = Integer.MAX_VALUE;
		
		if(s.length()<2) answer = 1;
		
		for(int i = 1;i<s.length()/2;i++) {
			String now, next = "",result = "";
			int hit = 1;
			for(int j=0;j<=s.length()/i;j++) {
				int start = j * i;
				int end = i*(j+1)>s.length()? s.length():i*(j+1);
				now = next;
				next = s.substring(start,end);
				
				if(now.equals(next)) {
					hit++;
				}else {
					result += (processHit(hit)+now);
					hit =1;
				}
			}
			result += (processHit(hit) + next);
			answer = Math.min(answer, result.length());
		}
		
		System.out.println(answer);
		
	}
	static String processHit(int hit) {
		return hit > 1 ? String.valueOf(hit) : "";
	}

}
