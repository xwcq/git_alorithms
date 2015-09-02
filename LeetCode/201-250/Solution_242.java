import java.util.*;

public class Solution_242 {
	public static boolean isAnagram(String s, String t) {
		int[] p = new int[26];
		for (int i = 0; i < s.length(); i++) {
			p[s.charAt(i) - 'a'] ++;
		}
		for (int i = 0; i < t.length(); i++) {
			p[t.charAt(i) - 'a'] --;
		}
		for (int i = 0; i < p.length; i++) {
			if (p[i] != 0) return false;
		}
		return true;
		/*if (s.length() != t.length()) return false;
		int length = s.length();
		char[] s_char = new char[length];
		char[] t_char = new char[length];
		for (int i = 0; i < length; i++) {
			s_char[i] = s.charAt(i);
			t_char[i] = t.charAt(i);
		}
		Arrays.sort(s_char);
		Arrays.sort(t_char);
		for (int i = 0; i < length; i++) {
			if (s_char[i] != t_char[i]) return false;
		}
		return true;*/
	}
	
	public static void main(String[] args) {
		String s = "anagram";
		String t = "nagaram";
		Solution_242.isAnagram(s, t);
	}
}























