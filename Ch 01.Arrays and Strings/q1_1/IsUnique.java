package q1_1;

import java.util.HashMap;
// there is 128 character alphabet in java which means for a string to 
// not contain a value more than once the string must be smaller or equal to 128 in length

public class IsUnique {
	public static boolean isUnique(String str) {
		if (str.length() > 128) return false;
		
		boolean[] charSet = new boolean[128];
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if (charSet[val]) return false;
			charSet[val] = true;
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(isUnique("avia"));
	}
}

