
public class Solution_28 {
	public static int strStr(String haystack, String needle) {
		int length_haystack = haystack.length();
		int length_needle = needle.length();
		if (length_haystack < length_needle) return -1;
		/* nextIndex is used to find where the next possible sub-array would be
		 *  it detects the first appear char of the needle and store 
		 *  so that i can change into nextIndex which might save some time
		 */
		for (int i = 0; i <= length_haystack - length_needle;) {
			int nextIndex = i;
			int j = i;
			for (; j < i + length_needle; j++) {
				char hay = haystack.charAt(j);
				if (j != i && hay == needle.charAt(0) && nextIndex == i) nextIndex = j;
				if (hay == needle.charAt(j - i)) continue;  // j - i = 0, 1, 2, ...
				else break; 
			}
			if (j == i + length_needle) return i;
			i = ((nextIndex != i) ? nextIndex : j + 1);
		}
		return -1;
	}
	
	public static void main(String[] args) {
		System.out.println(strStr("mississippi", "iss"));
	}
}





