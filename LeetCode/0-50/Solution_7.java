
public class Solution_7 {
	public static int reverse(int x) {
		//if (x == Integer.MIN_VALUE) return 0;
		int tmp = x;
		int num = 0;
		while (tmp != 0) {
			//if (num > Integer.MAX_VALUE / 10 - (tmp % 10) / 10 ) return 0;
			int tail = tmp % 10;
			int new_num = num * 10 + tail;
			// when comes to overflow
			if ((new_num - tail) / 10 != num) return 0;
			num = new_num;
			tmp /= 10;
		}
		return num;
	}
	
	/* overflow problem */
	public static void main(String[] args) {
		System.out.println(reverse(-2147483648));
		System.out.println(reverse(-23141));
		//System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
	}
}
