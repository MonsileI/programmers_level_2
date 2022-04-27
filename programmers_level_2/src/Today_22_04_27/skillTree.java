package Today_22_04_27;

public class skillTree {

	public static void main(String[] args) {
		
		String skill ="CBD";
		String [] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
		
		int answer = 0;
		
		for(int i=0;i<skill_trees.length;i++) {
			
			
			String check = "";
			
			for(int j=0;j<skill_trees[i].length();j++) {
				if(skill.contains(""+skill_trees[i].charAt(j))) {
					check += skill_trees[i].charAt(j);	
				}
			}
			
			for(int j = skill.length();j>-1;j--) {
				String s = skill.substring(0,j);
				if(s.equals(check)) {
					answer++;
					break;
				}
			}
			
		}
		
		System.out.println(answer);
		
	}
}
