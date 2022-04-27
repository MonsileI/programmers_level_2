package Today_22_04_27;

public class wasThatSong {
	
	public static void main(String[] args) {
		
		String m = "ABC";
		String [] musicinfos = {"12:00,12:14,HELLO,C#DEFGAB", "13:00,13:05,WORLD,ABCDEF"};
		String answer = "";
		
		String[]sharp = {"C#","D#","E#","F#","G#","A#","B#"};
		String[]change = {"c","d","e","f","g","a","b"};
		
		for(int i =0;i<sharp.length;i++) m = m.replaceAll(sharp[i], change[i]);
		
		
		for(String s : musicinfos) {
			
			String [] temp = s.split(",");
			String title = temp[2];
			String melody = temp[3];
			int time = check(temp[0],temp[1]);
			
			for(int i=0;i<sharp.length;i++) melody = melody.replaceAll(sharp[i], change[i]);
			
			String str = "";
			
		
			for(int i=0;i<time;i++) {
				str += melody.charAt(i%melody.length());
			}
			
			
			if(str.contains(m)) {
				answer = title;
				break;
			}
				
				
			
			
		}
		
		System.out.println(answer);
		
		
	}
	static int check(String start,String end) {
		
		String[]startTemp = start.split(":");
		String[]endTemp = end.split(":");
		
		int hour = Integer.parseInt(endTemp[0])*60 -Integer.parseInt(startTemp[0])*60;
		int min = Integer.parseInt(endTemp[1])-Integer.parseInt(startTemp[1])+hour;
		
		return min;
	}

}
