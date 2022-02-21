package third_22_02_21;

public class versus {
	
	public static void main(String[] args) {

		int N=8;
		int A=4;
		int B=7;
		int answer = 0 ;
		//그림그려서 실행해보기!
		while(true){
			A = A / 2 + A%2;
			B = B / 2 + B%2;
			answer ++;
			if(A==B)break;
			
		}
		
		
	}

}
