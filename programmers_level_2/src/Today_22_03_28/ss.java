package Today_22_03_28;

import java.util.ArrayList;
import java.util.Arrays;

public class ss {

	 public static void main(String[] args) {
		
		 int[] seulki = {3,5,8,1,2,1,7};
		 int m = 8;
		 int n = seulki.length-1;
		 Arrays.sort(seulki);
		 int start = 0;
		 int end = n;
		 int sum = 0;
		 ArrayList<int[]> list = new ArrayList<>();
		 
		 while(start<end) {
			 
			 sum = seulki[start] + seulki[end];
			 
			 if(sum==m) list.add(new int[] {seulki[start] , seulki[end]});
			 
			 if(sum<=m) start++;
			 else end--;
			 
			 
		 }
		 
		 for(int i=0;i<list.size();i++) {
			 System.out.println(list.get(i)[0]+","+list.get(i)[1]);
			
		 }
		 
	}
}
