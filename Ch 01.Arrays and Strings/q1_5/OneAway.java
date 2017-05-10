package q1_5;

// logic is as follows 
// separate the strings to long and short and keep indices for both
// iterate both string while both the indices  are less than the length
// for every iteration move the longer string 
// if there is a mismatch is characters not that a difference was found 
// and move the shorter string
// if the strings match just increment the short and as usual the long is always incremented 
// if two differences are found return false else 
// if the end of one of the string is reached then a a true is returned 
public class OneAway {
	public static boolean oneAway(String first, String second) {
		if (Math.abs(first.length() - second.length()) > 1) return false;
		String s1 = first.length() > second.length() ? first : second;
		String s2 = first.length() > second.length() ? second : first;
		int idx1 = 0, idx2 = 0;
		boolean foundDiff = false;
		while (idx1 < s1.length() && idx2 < s2.length()) {
			if (s1.charAt(idx1) != s2.charAt(idx2)) {
				if (foundDiff) return false;
				foundDiff = true;
				
				if (s1.length() == s2.length()) idx2++; // one replace/edit move shorter pointer
			} else {
				idx2++; // if matching move shorter 
			}
			idx1++; // Always move longer;
		}
		return true;
	}
	public static void main(String[] args) {
		String[] first =  {"pale", "pales", "pale", "pale"};
 		String[] second =  {"ple", "pale", "bale", "bae"};
 		for (int i = 0; i < second.length; i++) {
			System.out.println(oneAway(first[i], second[i]));
		}
	}
}
