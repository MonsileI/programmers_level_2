package third_22_02_21;

import java.util.Arrays;

public class MaxAndMinMine {

	public static void main(String[] args) {
		String s = "1 2 3 4";
		String answer = "";
		
		String[]arr = s.split(" ");
		int[]arrInt = new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			
			arrInt[i] = Integer.parseInt(arr[i]);
			
		}
		
		Arrays.sort(arrInt);
		
		answer += String.valueOf(arrInt[0]);
		answer += " ";
		answer += String.valueOf(arrInt[arrInt.length-1]);
		
		System.out.println(answer);
	}
}
