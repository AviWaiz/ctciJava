package q1_9;


// if a string is rotated into two sections x and y such that 
// s = x + y and rotation = y + x
// than a rotation of x must be a substring of 2s =>
// 2s = x + y + x + y which contains y + x as a substring 
// so check of s2 is a substring of 2s
public class StringRotation {
	public static boolean isRotation(String s1, String s2) {
		if (s2.length() != s1.length()) return false;
		String bigString = s1 + s1;
		return isSub(bigString, s2);
	}
	
	public static boolean isSub(String big, String small) {
		int bIdx = 0, sIdx = 0;
		while (bIdx < big.length()) {
			if (small.charAt(sIdx) == big.charAt(bIdx)) {
				bIdx++;
				sIdx++;
				if (sIdx == small.length()) return true;
			} else {
				sIdx = 0;
				bIdx++;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		String big = "Avinoam";
		String small = "oamAvin";
		System.out.println(isRotation(big, small));
	}
}
