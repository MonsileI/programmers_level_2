package Today_22_05_03;

public class combination {
	
	static int num = 0;
	public static void main(String[] args) {
		
		int[]arr = {1,2,3,4};
		
		int n = arr.length;
		
		boolean[] visited = new boolean[n];
		
		
		for(int i=1;i<=n;i++) {
			System.out.println(n+"개 중에 " + i +"개 뽑아내기");
			combi(arr,visited,i,n,0);
		}
		
		System.out.println("============전체 경우의 수 뽑기==============");
		
		dfs("",arr,visited,n);
		
		System.out.println("전체 경우의 수 : " + num + "개");
		
	}
	
	static void dfs(String now,int[]arr,boolean[]visited,int n) {
		
		System.out.println(now);
		num++;
		for(int i=0;i<n;i++) {
			if(!visited[i]) {
				visited[i] = true;
				String next = now + arr[i];
				dfs(next,arr,visited,n);
				visited[i] = false;
			}
		}
	}
	

	static void combi(int[]arr,boolean[]visited,int r,int n,int start) {
		
		if(r==0) {
			print(arr,visited,n);
			
		}
		
		for(int i=start;i<n;i++) {
			visited[i] = true;
			combi(arr,visited,r-1,n,i+1);
			visited[i] = false;
		}
		
	}
	static void print(int[]arr,boolean[]visited,int n) {
		
		for(int i=0;i<n;i++) {
			if(visited[i]) System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		
	}
}
