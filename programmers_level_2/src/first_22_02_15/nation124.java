package first_22_02_15;

public class nation124 {

	public static void main(String[] args) {
		//공부많이해야돼
		int n = 10;
		 
	      String[] num = {"4","1","2"};
	      String answer = "";
	      
	      while(n>0) {
	    	  
	    	  answer = num[n%3] + answer;
	    	  n = (n-1)/3;
	    	  
	      }
	      
	      System.out.println(answer);
	}
}
