package Today_22_04_06;

import java.util.ArrayList;


public class calculator {
	
	public static int answer = 0;
	public static ArrayList<Long> numlist = new ArrayList<Long>();
	public static ArrayList<Character> opList = new ArrayList<>();
	static char[]choice = new char[3];
	static boolean[]visit = new boolean[3];
	static char[]booho = {'+','-','*'};
	static long max = Long.MIN_VALUE;
	
	public static void main(String[] args) {
		
		String expression = "100-200*300-500+20";
		String s = "";
		for(char a : expression.toCharArray()) {
			if(a=='-'||a=='+'||a=='*') {
				opList.add(a);
				numlist.add(Long.parseLong(s));
				s="";
				continue;
			}
			else {
				s += a;
			}
		}
		numlist.add(Long.parseLong(s));
		
		

		
	}
	

}
