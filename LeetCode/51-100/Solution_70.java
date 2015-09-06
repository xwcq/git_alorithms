
public class Solution_70 {
	public static int climbStairs(int n) {
		if (n == 1) return 1;
		if (n == 2) return 2;
		int[] array = new int[n + 1];
		array[1] = 1;
		array[2] = 2;
		for (int i = 3; i <= n; i++) {
			array[i] = array[i - 1] + array[i - 2];
		}
		return array[n];
	}
	
	public static void main(String[] args) {
		System.out.println(climbStairs(4));
	}
}
