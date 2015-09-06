
public class Solution_38 {
	public static String countAndSay(int n) {
		if (n == 1) return "1";
		String tmp = "1";
		String result = "";
		for (int i = 2; i <= n; i++) { // i<= n
			result = "";
			int length = tmp.length();
			int times = 1;
			for (int j = 0; j < length; j++) {
				char get = tmp.charAt(j);
				if (j + 1 < length && tmp.charAt(j + 1) == get) times++;
				else {
					result += (times + "" + get); // convert int into String
					times = 1;
				}
			}
			tmp = result;
		}
		return result;
	}
	
	public static void main(String[] args) {
		for (int i = 1; i < 6; i++)
			System.out.println(countAndSay(i));
		
	}
}
