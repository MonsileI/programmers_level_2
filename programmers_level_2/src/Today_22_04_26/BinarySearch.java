package Today_22_04_26;

import java.util.Arrays;

public class BinarySearch {

	
	public static void main(String[] args) {
		
		int[]arr = {5,3,6,10,2,79};
		int num = 3;
		
		Arrays.sort(arr);
		
		int answer = binarySearch(arr,num);
		
		System.out.println("Index Number = " +answer);
	
	}
	
	static int binarySearch(int[]arr,int num) {
		
		int start = 0, end = arr.length-1;
		int answer = 0;
		while(start<=end) {
			int mid = (start+end)/2;
			
			if(arr[mid]<num) {
				start = mid+ 1 ;
			}else {
				end = mid - 1;
			}
			if(arr[mid]==num) {
				answer = mid;
				break;
			}
		}
		
		return answer;
	}
	
}