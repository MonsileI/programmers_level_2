package Today_22_03_26;

public class inThePastEnterPriseTest {
	
	public static void main(String[] args) {
		
		String[]robot = {"<<","<<",">>","<<",">>"};
		int [] index = new int[robot.length];
		
		int count = 0;
		
		
		for(int i=0;i<robot.length;i++) {
			
			int nowIndex = i;
			int check = 0;
			boolean flag = false;
			while(true) {
				
				if(robot[nowIndex].equals(">>")) {
					nowIndex++;
					
				}else if(robot[nowIndex].equals("<<")) {
					nowIndex--;
					
				}
				
				
				
				if(check>100) {
					flag = true;
					break;
				}
				
				if(nowIndex>robot.length-1||nowIndex<0) break;
				
				check++;
			}
			
			
			if(!flag) count++;
			
			
			
		}
	
		System.out.println(count);
	
	}

}
