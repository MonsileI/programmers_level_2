package second_22_02_17;

public class permutation {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3};
		
		per(arr,0,arr.length);
	}
	
	public static void per(int[]arr,int depth,int r) {
		
		if(depth==r) {
			
			for(int i=0;i<r;i++) {
				
				System.out.print(arr[i] + ", ");
			}
			System.out.println();
		}
		
		
		for(int i=depth;i<r;i++) {
			swap(arr,depth,i);
			per(arr,depth+1,r);
			swap(arr,depth,i);
			//딥하게 들어갔다가 나오는 기분...
			
		}
		
	}
	public static void swap(int[]arr,int depth,int i) {
		int temp = arr[depth];
		arr[depth] = arr[i];
		arr[i] = temp;
		
		
	}

}
