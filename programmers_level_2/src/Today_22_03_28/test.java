package Today_22_03_28;

public class test {

	public static void main(String[] args) {
		
		String[]check = {">>",">>","<<",">>",">>",">>"};
		
		int answer = 0;
		
		
		int idx = 0;
		int count = 0;
		for(int i=0;i<check.length;i++) {
			
			idx = i;
			
			boolean flag = true;
			count = 0;
			while(0<=idx && idx<check.length) {
				
				if(check[idx].equals(">>")) idx++;
				else idx--;
				
				count++;
				
				if(count>check.length+10) {
					flag = false;
					break;
				}
				
			}
			
			if(flag) answer++;
			
			
		}
		
		
		System.out.println(answer);
		
	}
}
