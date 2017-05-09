package q1_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PalindromePermutation {
	public static boolean isPalindrome(String s1) {
		HashMap<Character, Integer> counts = new HashMap<Character, Integer>();
		
		char[] s1Chars = s1.toLowerCase().toCharArray();
		
		for (int i = 0; i < s1Chars.length; i++) {
			char c1 = s1Chars[i];
			if (c1 == ' ') continue;
			if (counts.containsKey(c1)) {
				counts.put(c1, counts.get(c1) + 1);
			} else {
				counts.put(c1, 1);
			}
		}
		boolean hasOdd = false;
		for (Map.Entry<Character, Integer> entry : counts.entrySet()){
			Integer value = entry.getValue();
			if (value % 2 == 1) {
				if (hasOdd) {
					return false;
				} else {
					hasOdd = true;
				}
			}
		}
		return true;
	}
	public static boolean isPalFast(String str) {
		int countOdd = 0;
		// build a table of size of letters from z to a;
		// this table is the range for lower case since that is all 
		// that matters 
		int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
		char[] charArr = str.toLowerCase().toCharArray();
		for (char c : charArr) {
			int x = Character.getNumericValue(c);
			if (x != -1) {
				x -= Character.getNumericValue('a');
				table[x]++;
				if (table[x] % 2 == 1) {
					countOdd++;
				} else {
					countOdd--;
				}
			}
		}
		return countOdd <= 1;
	}
	public static void main(String[] args) {
		String str = "Tact Cowoza";
		System.out.println(isPalindrome(str));
		System.out.println(isPalFast(str));
	}
}
