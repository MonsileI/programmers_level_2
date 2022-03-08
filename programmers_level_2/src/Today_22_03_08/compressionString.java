package Today_22_03_08;


public class compressionString {

	public static void main(String[] args) {
		
		
		String s = "aabbcccc";
		
		int answer = Integer.MAX_VALUE;
		
		if(s.length()==1) answer = 1;
		
		for(int i=1;i<=s.length()/2;i++) {
			
			String str = "";
			String temp="";
			int count = 1;
			
			for(int j=0;j<s.length()/i;j++) {
				if(temp.equals(s.substring(j*i,(j*i)+i))) {
					count++;
					continue;
				}
				if(count >1) {
					str+= count+temp;
					count = 1;
				}else {
					str += temp;
				}
				temp=s.substring(j*i,(j*i)+i);
			}
			
			if(count > 1) {
				str+= count+temp;
				count = 1;
			}else {
				str += temp;
			}
			
			if(s.length()%i != 0) {
				str+= s.substring(s.length()-s.length()%i,s.length());
			}
			
			answer = answer > str.length() ? str.length() : answer;
			
		}
		
	System.out.println(answer);
		
	}
}
