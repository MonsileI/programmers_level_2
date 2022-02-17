package second_22_02_17;

public class phoneNumberListTimeOut {
	
	public static void main(String[] args) {
		
		
		String[]phone_book = {"119", "97674223", "1195524421"};
		
		boolean result = true;
		
		for(int i=0;i<phone_book.length;i++) {
			
			String temp = phone_book[i];
			
			for(int j=0;j<phone_book.length;j++) {
				
				String comp = phone_book[j];
				
				if(!temp.equals(comp)) {
					
					if(temp.length()>=comp.length()) {
						
						if(comp.equals(temp.substring(0,comp.length()))) {
							
							result = false;
							break;

					}
				}
				
					
				
					
					
				}
				
				
				
			}
			
		}
		
		
		System.out.println(result);
		
	}

}
