
public class Solution_198 {
	public static int rob(int[] nums) {
		
		/* excellent idea */
		int a = 0, b = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i % 2 == 0) a = Math.max(a + nums[i], b);
			else b = Math.max(a, b + nums[i]);
		}
		return Math.max(a, b);
	}
		
		/*
		 * my answer, but actually there is no need to use an array to store money in all n sizes
		 * it only needs two variables 
		 */
		/*int length = nums.length;
		int[] MoneyGet = new int[length];
		MoneyGet[0] = nums[0];
		boolean[] ifGetMoney = new boolean[length];
		ifGetMoney[0] = true;
		if (length >= 2) {
			MoneyGet[1] = Math.max(nums[0], nums[1]);
			ifGetMoney[1] = nums[0] < nums[1];
		}
		for (int i = 2; i < length ; i++) {
			if (!ifGetMoney[i - 1]) {
				MoneyGet[i] = MoneyGet[i - 1] + nums[i];
				ifGetMoney[i] = true;
			}
			else {
				int a = MoneyGet[i - 1];
				int b = MoneyGet[i - 2] + nums[i];
				MoneyGet[i] = a > b ? a : b;
				ifGetMoney[i] = b > a;
			}
		}
		return MoneyGet[length - 1];
	}*/
	
	public static void main(String[] args) {
		int[] money = {1, 3, 1};
		rob(money);
	}
}













