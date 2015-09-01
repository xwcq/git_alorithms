
public class Solution_231 {
	public static boolean isPowerOfTwo(int n) {
		/* my answer */
		/*if (n == 2) return true;
		if (n % 2 != 0) return false;
		return isPowerOfTwo(n / 2);*/
		
		/***
		 *  power of 2 means there is only one bit is 1,
		 *  so n & (n - 1) can determine whether that is the case
		 */
		return ((n & (n - 1)) == 0 && n > 0);
	}
	
	public static void main(String[] args) {
		if (Solution_231.isPowerOfTwo(8)) {
			System.out.println(1);
		}
	}
}
