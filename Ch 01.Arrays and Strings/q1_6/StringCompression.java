package q1_6;

public class StringCompression {
	public static String strCompress(String s1) {
		if (s1.length() == 0) return "";
		int count = 1;
		String compressedString = "" + s1.charAt(0);
		for (int i = 1; i < s1.length(); i++) {
			Character c1 = s1.charAt(i - 1); // in java to get char at index use charAt unlike Python s[i]
			Character c2 = s1.charAt(i);
			if (c2 == c1){
				count++;
			} else {
				compressedString += Integer.toString(count) + c2;
				count = 1;
			}
		}
		compressedString += Integer.toString(count);
		return compressedString;
	}
	
	public static void main(String[] args){
		String s1 = "aabccccca";
		System.out.println(strCompress(s1));
	}
}
