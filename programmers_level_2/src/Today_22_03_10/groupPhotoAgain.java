package Today_22_03_10;

public class groupPhotoAgain {

	static int answer = 0;
	static 	String[]member = {"A","C","F","J","M","N","R","T"};
	
	
	public static void main(String[] args) {
		
		String[]data = {"N~F=0", "R~T>2"};
		boolean[]visited = new boolean[member.length];
		dfs("",data,visited);
		System.out.println(answer);
		
		
	}
	public static void dfs(String names, String[]data,boolean[]visited) {
		
		if(names.length()==member.length) {
			if(check(names,data)) answer++;
		}
		
		for(int i=0;i<8;i++) {
			if(!visited[i]) {
				visited[i] = true;
				String name = names + member[i];
				dfs(name,data,visited);
				visited[i] = false;
			}
			
			
		}
		
		
	}
	public static boolean check(String names,String[]data) {
		
		for(String s : data) {
			
			int pos1 = names.indexOf(s.charAt(0));
			int pos2 = names.indexOf(s.charAt(2));
			char op = s.charAt(3);
			int idx = s.charAt(4)-'0';
			
			if(op=='=') {
				if(!(Math.abs(pos1-pos2)==idx+1)) return false;
			}else if(op=='>') {
				if(!(Math.abs(pos1-pos2)>idx+1)) return false;
			}else if(op=='<') {
				if(!(Math.abs(pos1-pos2)<idx+1)) return false;
			}
			
		}
		
		
		return true;
	}
}
