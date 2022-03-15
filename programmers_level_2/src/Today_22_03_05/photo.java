package Today_22_03_05;


public class photo {
	private static int answer =0;
	private static String[] friends = {"A","C","F","J","M","N","R","T"};
	
	public static void main(String[] args) {
	
		String[]data = {"N~F=0", "R~T>2"};
			
		boolean[]isVisited = new boolean[friends.length];
		dfs("",data,isVisited);
		
		System.out.println(answer);
	
		
	}
	
	public static void dfs(String names,String[]data,boolean[]isVisited) {
		
		if(names.length()==friends.length) {
			if(check(data,names)) answer++;
			
		}
		
		for(int i=0;i<friends.length;i++) {
			if(!isVisited[i]) {
				isVisited[i]=true;
				String name = names + friends[i];
				dfs(name,data,isVisited);
				isVisited[i] =false;
			}
		}
		
	}
	public static boolean check(String[]datas,String names) {
		
		for(String data : datas) {
			
			int pos1 = names.indexOf(data.charAt(0));
			int pos2 = names.indexOf(data.charAt(2));
			char op = data.charAt(3);
			int index = data.charAt(4)-'0';
			
			if(op=='=') {
				if(!(Math.abs(pos1-pos2)==index+1)) return false;
			}else if(op=='>') {
				if(!(Math.abs(pos1-pos2)>index+1)) return false;
			}else if(op=='<') {
				if(!(Math.abs(pos1-pos2)<index+1)) return false;
			}
			
		}
		
		return true;
	}
	
}
