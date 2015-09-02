
public class Solution_9 {
	public static boolean isPalindrome(int x) {
		int num = (x > 0) ? x : -x;
		int length = 0;
		int tmp = num;
		while (tmp != 0) {
			tmp /= 10;
			length++;
		}
		int getFirstNum = 1;
		for (int i = 1; i < length; i++) getFirstNum *= 10;
		while (num / 10 != 0) {
			System.out.println(num + "  " + getFirstNum);
			if (num / getFirstNum == 0) return false;
			if (num / getFirstNum == num % 10) {
				num = (num % getFirstNum) / 10;
				getFirstNum /= 100;
			}
			else return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		if (isPalindrome(1000021)) {
			System.out.println(1);
		}
	}
}
