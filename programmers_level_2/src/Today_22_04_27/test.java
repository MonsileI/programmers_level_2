package Today_22_04_27;

public class test {
	
	public static void main(String[] args) {
		
		//"[^" + skill + "]"
	
	String skill = "CBD";
	String[]skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
	int answer = 0;
	for(int i=0;i<skill_trees.length;i++) skill_trees[i] = skill_trees[i].replaceAll("[^" + skill + "]", "");
		
	for(int i=0;i<skill_trees.length;i++) {
		
		String check = skill_trees[i];
		
		for(int j=skill.length();j>-1;j--) {
			String s = skill.substring(0,j);
			if(s.equals(check)) {
				answer++;
				System.out.println(check);
				break;
			}
			
			
		}
		
	}
	
	System.out.println(answer);
	
	
	}

}
