package Today_22_06_13;

import java.util.HashMap;
import java.util.ArrayList;

public class no_4 {
	
	static HashMap<String,ArrayList<Integer>> infoMap = new HashMap<>();
	
	public static void main(String[] args) {
		
		String[] info = {"java backend junior pizza 150","python frontend senior chicken 210","python frontend senior chicken 150","cpp backend senior pizza 260","java backend junior chicken 80","python backend senior chicken 50"};
		String[] query = {"java and backend and junior and pizza 100","python and frontend and senior and chicken 200","cpp and - and senior and pizza 250","- and backend and senior and - 150","- and - and - and chicken 100","- and - and - and - 150"};
		int[]answer = new int[query.length];
		
		
		for(String str : info) {
			
			String[]temp = str.split(" ");
			
			
			dfs(temp,0,"");
			
		}
		
		
		
		for(int i=0;i<query.length;i++) {
			
			String[]temp = query[i].split(" and ");
			
			answer[i] = check(temp);
			
		}
		
		System.out.println(infoMap);
		
		for(int i : answer)System.out.println(i);
		
		
	}
	
	static int binarySearch(String str,String s) {
		
		int score = Integer.parseInt(s);
		
		ArrayList<Integer> arr = new ArrayList<>(infoMap.get(str));
		
		int start = 0;
		int end = arr.size();
		
		while(start<=end) {
			int mid = (start+end)/2;
			
			if(arr.get(mid) < score) end = mid-1;
			else start = mid+1;
			
			
		}
		
		
		return start;
		
		
	}
	
	
	static int check(String[]temp) {
		
		
		if(infoMap.containsKey(temp[0])) {
			return binarySearch(temp[0],temp[1]);
		}
		
		
		return 0;
		
		
	}
	
	
	static void dfs(String[]temp,int count,String now) {
		
		
		if(count==4) {
			if(!infoMap.containsKey(temp[4])) {
				infoMap.put(now, new ArrayList<>());
			}
			infoMap.get(now).add(Integer.parseInt(temp[4]));
			return;
		}
		
		
		for(int i=0;i<temp.length;i++) {
			dfs(temp,count+1,now + temp[count]);
			dfs(temp,count+1,now+"-");
		}
		
		
	}

}
