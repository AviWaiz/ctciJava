package q1_3;

public class URLify {
	public static void urlStr(char[] str, int trueLength) {
		int spaceCounts = 0, index;
		
		// count the number of spaces in the string
		for (int i = 0; i < trueLength; i++) if(str[i] == ' ') spaceCounts++;
		
		index = trueLength + spaceCounts * 2;
		if (trueLength < str.length) str[trueLength] = '\0';
		for (int i = trueLength - 1; i >= 0; i--) {
			char c = str[i];
			if (c == ' ') {
				str[index - 1] = '0';
				str[index - 2] = '2';
				str[index - 3] = '%';
				index -= 3;
			} else {
				str[index - 1] = c;
				index -= 1;
			}
		}
	}
	
	public static void main(String[] args) {
		String s = "Mr John Smith    "; 
		char[] str = s.toCharArray();
		int len = 13;
		urlStr(str, len);
		System.out.println(str);
	}
}
