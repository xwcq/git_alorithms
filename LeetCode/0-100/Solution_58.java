
public class Solution_58 {
	public static int lengthOfLastWord(String s) {
		String[] p = s.split(" ");
		int length = p.length;
		if (length == 0) return 0;
		return p[length - 1].length();
	}
	
	public static void main(String[] args) {
		String s = "hello world";
		System.out.println(Solution_58.lengthOfLastWord(s));
	}
}
