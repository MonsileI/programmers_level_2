package Today_22_04_12;

public class dfs {

	static char[]member = {'A','C','F','J','M','N','R','T'};
	static int answer = 0;
	static boolean[]isVisited = new boolean[member.length];
	
	public static void main(String[] args) {
		
		int n = 2;
		String[]data = {"M~C<2", "C~M>1"};
		
		dfs(data,"",member,isVisited);
	
		System.out.println(answer);
	}
	public static void dfs(String[]data,String now,char[]member,boolean[]isVisited) {
		
		if(now.length()==member.length) {
			if(check(data,now)) answer++;
		}
		
		
		for(int i=0;i<member.length;i++) {
			
			if(!isVisited[i]) {
				isVisited[i] = true;
				String combination = now + member[i];
				dfs(data,combination,member,isVisited);
				isVisited[i] = false;
			}
			
		}
		
	}
	public static boolean check(String[]data,String now) {
		
		for(String d : data) {
			
			int firstP = now.indexOf(d.charAt(0));
			int secondP = now.indexOf(d.charAt(2));
			char ch = d.charAt(3);
			int idx = d.charAt(4)-'0';
					
			
			if(ch=='=') {
				if(!(Math.abs(firstP-secondP)==idx+1)) return false;
			}else if(ch=='>') {
				if(!(Math.abs(firstP-secondP)>idx+1)) return false;
			}else if(ch=='<') {
				if(!(Math.abs(firstP-secondP)<idx+1)) return false;
			}
			
			
		}
		
		
		return true;
	};
	
}
