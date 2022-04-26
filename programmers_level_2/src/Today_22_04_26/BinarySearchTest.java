package Today_22_04_26;


import java.util.*;

	
public class BinarySearchTest {

	static HashMap<String,ArrayList<Integer>> map = new HashMap<>();
	
	public static void main(String[] args) {
		
	
	String [] info = {"java backend junior pizza 150","python frontend senior chicken 210","python frontend senior chicken 150","cpp backend senior pizza 260","java backend junior chicken 80","python backend senior chicken 50"};
	String [] query = {"java and backend and junior and pizza 100","python and frontend and senior and chicken 200","cpp and - and senior and pizza 250","- and backend and senior and - 150","- and - and - and chicken 100","- and - and - and - 150"};

	int[]answer = new int[query.length];
	
	for(String str : info) {
		String[]temp = str.split(" ");
		dfs(temp,0,"");
	}
	for(String key : map.keySet()) {
		Collections.sort(map.get(key));
	}
	
	for(int i=0;i<query.length;i++) {
		query[i] = query[i].replaceAll(" and ", "");
		String [] temp = query[i].split(" ");
		answer[i] = map.containsKey(temp[0]) ? binarySearch(temp[0], Integer.parseInt(temp[1])) : 0;
	}
	
	for(int i : answer)System.out.println(i);
	
	}
	static int binarySearch(String key,int score) {
		
		ArrayList<Integer> list = map.get(key);
		int start = 0,end = list.size()-1;
		
		while(start <=end) {
			int mid = (start+end)/2;
			if(list.get(mid)<score) {
				start = mid + 1;
			}else {
				end = mid-1;
			}
			
		}
		
		return list.size()-start;
		
		
		
	}
	
	static void dfs(String[]temp,int count,String str) {
		
		if(count==4) {
			if(!map.containsKey(str)) {
				ArrayList<Integer> list = new ArrayList<Integer>();
				map.put(str, list);
			}
			map.get(str).add(Integer.parseInt(temp[4]));
			return;
		}
		
		dfs(temp,count+1,str+"-");
		dfs(temp,count+1,str+temp[count]);
		
	}

}
	