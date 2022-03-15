package Today_22_03_15;

public class photo_Again_DFS {
	
	static int answer = 0;
	
	public static void main(String[] args) {
	
		String[]member = {"A", "C", "F", "J", "M", "N", "R", "T"};
		
		String[] data = {"N~F=0", "R~T>2"};
		
		boolean[]isVisited = new boolean[member.length];
		
		
		dfs(member,data,"",isVisited);
		
		System.out.println(answer);
	}
	
	public static void dfs(String[]member,String[]data,
							String depth,boolean[]isVisited) {

		if(depth.length()==member.length) {
			
			if(check(data,depth)) answer++;
			
		}
			for(int i=0;i<member.length;i++) {
				if(!isVisited[i]) {
					isVisited[i] = true;
					String name = depth + member[i];
					dfs(member,data,name,isVisited);
					isVisited[i] = false;
					
				
				
			}
			
			
		}
	
		
		
	}
	public static boolean check(String[]datas,String depth) {
		
		for(String data : datas) {
			
			int pos1 = depth.indexOf(data.charAt(0));
			int pos2 = depth.indexOf(data.charAt(2));
			char op = data.charAt(3);
			int idx = data.charAt(4) - '0';
			
			
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
