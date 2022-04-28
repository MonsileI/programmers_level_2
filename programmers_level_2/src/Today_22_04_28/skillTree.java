package Today_22_04_28;

public class skillTree {
	
	public static void main(String[] args) {
		
		String skill = "CBD";
		String[]skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
		int answer = 0;
		//BCD
		
		//CBD
		
		for(int i=0;i<skill_trees.length;i++) skill_trees[i] = skill_trees[i].replaceAll("[^"+skill+"]","");
		
		for(int i=0;i<skill_trees.length;i++) {
			
			String temp = "";
			
			for(int j=skill.length();j>-1;j--) {
				
				temp = skill.substring(0,j);
				if(temp.equals(skill_trees[i])) {
					answer++;
					break;
				}
			}
			
			
			
		}
		
		System.out.println(answer);
		
	}

}
