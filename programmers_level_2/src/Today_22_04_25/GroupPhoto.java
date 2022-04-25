package Today_22_04_25;

public class GroupPhoto {
	
	static char[]member = {'A','C','F','J','M','N','R','T'};
	static int answer = 0;
	
	public static void main(String[] args) {
		
		int n = 2;
		String []data = {"N~F=0", "R~T>2"};
		boolean [] isVisited = new boolean[member.length];
		dfs("",data,isVisited);
		System.out.println(answer);
	}

	static void dfs(String now,String[]data,boolean[]isVisited) {
	
		if(now.length()==member.length) {
			if(check(now,data)) answer++;
		}
		
		
		for(int i=0;i<member.length;i++) {
			if(!isVisited[i]) {
				isVisited[i] = true;
				String newOne = now + member[i];
				dfs(newOne,data,isVisited);
				isVisited[i] = false;
			}
		}
		
		
	}
	static boolean check(String now, String[]datas) {
		
		for(String data : datas) {
			
			int pos1 = now.indexOf(data.charAt(0));
			int pos2 = now.indexOf(data.charAt(2));
			char ch = data.charAt(3);
			int idx = data.charAt(4)-'0';
			
			if(ch=='=') {
				if(!(Math.abs(pos1-pos2)==idx+1)) return false;
			}else if(ch=='<') {
				if(!(Math.abs(pos1-pos2)<idx+1)) return false;
			}else if(ch=='>') {
				if(!(Math.abs(pos1-pos2)>idx+1)) return false;
			}
			
		}
		
		return true;
		
	}
}
