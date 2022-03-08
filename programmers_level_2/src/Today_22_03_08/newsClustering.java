package Today_22_03_08;

import java.util.ArrayList;

public class newsClustering {
	
	public static void main(String[] args) {
		
		String str1 = "FRANCE";
		String str2 = "FRENCH";
		int answer =0;
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		ArrayList<String> kyo = new ArrayList<String>();
		ArrayList<String> hap = new ArrayList<String>();
	
		for(int i=0;i<str1.length()-1;i++) {
			char f = str1.charAt(i);
			char s = str1.charAt(i+1);
			if(String.valueOf(f).matches("[a-z]")&&
			   String.valueOf(s).matches("[a-z]")) {
				list1.add(f+""+s);
			}
				
		}

		for(int i=0;i<str2.length()-1;i++) {
			char f = str2.charAt(i);
			char s = str2.charAt(i+1);
			if(String.valueOf(f).matches("[a-z]")&&
			   String.valueOf(s).matches("[a-z]")) {
				list2.add(f+""+s);
			}
				
		}
		for(String s : list1) {
			
			if(list2.remove(s)) {
				kyo.add(s);
			}
			hap.add(s);
			
		}
		
		hap.addAll(list2);
		
		double kyo_len = kyo.size();
		double hap_len = hap.size();
		
		
		
		if(kyo_len==0) {
			answer = 16384;
		}else {
			
			answer = (int)(kyo_len/hap_len*65536);
		}
		
		System.out.println(answer);
		
		
	}

}
