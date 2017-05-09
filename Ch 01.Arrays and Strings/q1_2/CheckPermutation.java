package q1_2;

import java.util.HashMap;

public class CheckPermutation {
	private static boolean isPermuatation(String s1, String s2) {
		if (s1.length() != s2.length()) return false;
		
		HashMap<Character, Integer> counts = new HashMap<Character, Integer>();
		char[] s1Chars = s1.toCharArray();
		char[] s2Chars = s2.toCharArray();
		for (char c : s1Chars) {
			if (counts.containsKey(c)) counts.put(c, counts.get(c) + 1);
			else counts.put(c, 1);	
	 	}
		
		for (char c : s2Chars) {
			if (counts.containsKey(c)) {
				counts.put(c, counts.get(c) - 1);
				if (counts.get(c) == 0) counts.remove(c);
			} else return false;	
		}
		
		if (counts.isEmpty()) return true;
		return false;
	}
	
	public static void main(String[] args) {
		String s1 = "avi";
		String s2 = "iva";
		System.out.println(isPermuatation(s1, s2));
	}
}
