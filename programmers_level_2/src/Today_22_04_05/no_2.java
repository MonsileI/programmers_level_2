package Today_22_04_05;

import java.util.ArrayList;

public class no_2 {
	
	
	public static void main(String[] args) {

		String str1 = "france";
		String str2 = "french";
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		ArrayList<String> arr1 = new ArrayList<String>();
		ArrayList<String> arr2 = new ArrayList<String>();
		
		for(int i=0;i<str1.length()-1;i++) {
			if(str1.charAt(i)>='a'&&str1.charAt(i)<='z'&&
				str1.charAt(i+1)>='a'&&str1.charAt(i+1)<='z') {
				arr1.add(str1.charAt(i)+""+str1.charAt(i+1));
			}
		}
		for(int i=0;i<str1.length()-1;i++) {
			if(str2.charAt(i)>='a'&&str2.charAt(i)<='z'&&
				str2.charAt(i+1)>='a'&&str2.charAt(i+1)<='z') {
				arr2.add(str2.charAt(i)+""+str2.charAt(i+1));
			}
		}
		
		System.out.println(str1);
		System.out.println(str2);
		double gyo = 0;
		double hap  =0;
		for(int i=0;i<arr1.size();i++) {
			for(int j=0;j<arr2.size();j++) {
				if(arr1.get(i).equals(arr2.get(j))) {
					gyo++;
					break;
				}
			}
		}
		
		hap = arr1.size()+arr2.size()-gyo;
		int answer = 0;
		double jaka = gyo/hap  * 65536;
		
		
		answer = (int) jaka;
		
		if(answer==0) answer=65536;
		
		System.out.println(answer);
		
	}
}