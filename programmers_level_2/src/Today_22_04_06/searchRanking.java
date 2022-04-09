package Today_22_04_06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class searchRanking {
	
	static HashMap<Integer,ArrayList<String>> map = new HashMap<>(); 
	
	
	public static void main(String[] args) {
		
		
		String[]info = {"java backend junior pizza 150","python frontend senior chicken 210","python frontend senior chicken 150","cpp backend senior pizza 260","java backend junior chicken 80","python backend senior chicken 50"};
		String[]query = {"java and backend and junior and pizza 100","python and frontend and senior and chicken 200","cpp and - and senior and pizza 250","- and backend and senior and - 150","- and - and - and chicken 100","- and - and - and - 150"};
		int[]result = new int[query.length];
		
		for(String s : info) {
			
			String[]check= s.split(" ");
			int score = Integer.parseInt(check[4]);
			map.put(score, new ArrayList<String>());
			map.get(score).add(check[0]);
			map.get(score).add(check[1]);
			map.get(score).add(check[2]);
			map.get(score).add(check[3]);
		}
		
		for(int i=0;i<query.length;i++) {
			
			query[i] = query[i].replaceAll("and", "");
			query[i] = query[i].replaceAll("  ", " ");
			String[]check = query[i].split(" ");
			
			int score = Integer.parseInt(check[4]);
			int count = 0;
			for(Integer key : map.keySet()) {
				
				if(key>=score) {
					ArrayList<String>temp = new ArrayList<>(map.get(key));
					System.out.println(temp);
					if(temp.get(0).equals(check[0])||check[0].equals("-"))
						if(temp.get(1).equals(check[0])||check[1].equals("-"))
							if(temp.get(2).equals(check[0])||check[2].equals("-"))
								if(temp.get(3).equals(check[0])||check[3].equals("-")) {
									count++;
								}
				}
			}
			
			result[i] = count;
			
		}
				
		for(int i : result)System.out.println(i);
	}

}
