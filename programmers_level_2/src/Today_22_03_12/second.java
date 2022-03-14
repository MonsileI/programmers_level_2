package Today_22_03_12;

public class second {
	
	static int answer = 0;

	public static void main(String[] args) {
		
		String [] data = {"N~F=0", "R~T>2"};
		
		String [] member = {"A", "C", "F", "J", "M", "N", "R", "T"};
		
		boolean [] isVisited = new boolean[member.length];
		
		dfs("",data,member,isVisited);
		
		System.out.println(answer);
		
		
	}
	public static void dfs(String names,String[]data,String[]member, boolean[] isVisited) {
	
		
		if(names.length()==member.length) {
			if(check(names,data)) answer++;
		}
		
		for(int i=0;i<member.length;i++) {
			
			if(!isVisited[i]) {
				isVisited[i] = true;
				String name = names + member[i];
				dfs(name,data,member,isVisited);
				isVisited[i] = false;
			}
			
		}
		
		

	}
	public static boolean check(String names, String []data) {
		
		for(String s : data) {
			
			int pos1 = names.indexOf(s.charAt(0));
			int pos2 = names.indexOf(s.charAt(2));
			char ph = s.charAt(3);
			int index = s.charAt(4) - '0';
			
			
			if(ph=='=') {
				if(!(Math.abs(pos1-pos2)==index+1)) return false;
			}else if(ph=='>') {
				if(!(Math.abs(pos1-pos2)>index+1)) return false;
			}if(ph=='<') {
				if(!(Math.abs(pos1-pos2)<index+1)) return false;
			}
			
		}
		
		return true;
	}
}
