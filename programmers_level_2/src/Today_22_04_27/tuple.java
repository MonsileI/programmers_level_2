package Today_22_04_27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class tuple {
	
	public static void main(String[] args) {
		
		String s ="{{1,2,3},{2,1},{1,2,4,3},{2}}";
		
		//숫자만 뽑아내서  map에 넣어서 갯수 정렬
		
		HashMap<String,Integer> map = new HashMap<>();
		
		
		s = s.replaceAll("\\{", "");
		s = s.replaceAll("\\}", "");
		
		String [] temp = s.split(",");
		
		for(String str : temp) map.put(str,map.getOrDefault(str, 0)+1);
		
		List<String> keySetList = new ArrayList<>(map.keySet());
        // 내림차순 //
        Collections.sort(keySetList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return map.get(o2).compareTo(map.get(o1));
            }
        });
        
        int[]answer = new int[keySetList.size()];
		
        for(int i=0;i<keySetList.size();i++){
            answer[i] = Integer.parseInt(keySetList.get(i));
        }
        
        System.out.println(keySetList);
	
	}

}
