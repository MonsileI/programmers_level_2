package Today_22_04_05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class no_4 {
	
	public static void main(String[] args) {
		
	String [] genres = {"classic", "pop", "classic", "classic", "pop"};
	int [] plays = {500,600,150,800,2500};
	
	HashMap<String,Integer> map = new HashMap<String, Integer>();
	
	for(int i=0;i<genres.length;i++) {
		
		map.put(genres[i], map.getOrDefault(genres[i], 0)+plays[i]);
		
	}
	
	ArrayList<String> genre = new ArrayList<>();
	
	for(String key : map.keySet()) {
		genre.add(key);
	}
	
	Collections.sort(genre,(o1,o2)->map.get(o2)-map.get(o1));
	
	ArrayList<Integer> answer = new ArrayList<Integer>();
	
	for(int i =0;i< genre.size();i++) {
		
		String g = genre.get(i);

		int max = 0;
		int firstidx = -1;
		
		for(int j=0;j<genres.length;j++) {
			
			if(g.equals(genres[j])) {
				if(max<plays[j]) {
					max = plays[j];
					firstidx = j;
				}
			}
			
			
		}
		
		max = 0;
		int secondidx = -1;
		for(int j=0;j<genres.length;j++) {
			
			if(g.equals(genres[j])) {
				if(max<plays[j] && firstidx != j) {
					max = plays[j];
					secondidx = j;
				}
			}
			
		}
		
		answer.add(firstidx);
		if(secondidx!=-1) answer.add(secondidx);
		
	
	}
	
	int[]result = new int[answer.size()];
	
	for(int i=0;i<answer.size();i++) result[i] = answer.get(i);
	
	for(int i : result)System.out.println(i);
	
	}

}
