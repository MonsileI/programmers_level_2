package Today_22_04_12;

public class song {
	
	public static void main(String[] args) {
		
		String m = "ABC";
		String[]musicinfos = {"12:00,12:14,HELLO,C#DEFGAB", "13:00,13:05,WORLD,ABCDEF"};
	
		String answer = "";
		
		String[]sharp = {"C#","D#","E#","F#","G#","A#","B#"};
		String[]change = {"c","d","e","f","g","a","b"};
		
		
		for(int i=0;i<sharp.length;i++) {
			
			m = m.replace(sharp[i], change[i]);
		
			
		}
		for(int i=0;i<musicinfos.length;i++) {
			
			String [] temp = musicinfos[i].split(",");
			String melody = temp[3];
			
			for(int j=0;j<sharp.length;j++) {
			
				melody = melody.replaceAll(sharp[j], change[j]);
				
				
			}
			
			musicinfos[i] = temp[0] + "," + temp[1] + "," + temp[2] + "," + melody;
			
			System.out.println(musicinfos[i]);
		}
		
		
		
		for(String s : musicinfos) {
			
			String[]temp = s.split(",");
			int time = check(temp[1]) - check(temp[0]);
			String title = temp[2];
			String melody = temp[3];
			
			String tempMel = "";
			
			
			for(int i=0;i<time;i++) {
				
				tempMel += melody.charAt(i%melody.length());
				
			}
			
			
			if(tempMel.contains(m)) answer = title;
		}
		
		System.out.println(answer);
	}

	public static int check(String s) {
		
		String []temp = s.split(":");
		
		int hour = Integer.parseInt(temp[0]) * 60;
		int minute = Integer.parseInt(temp[1]) + hour;
		
		return minute;
		
	}
}
