
public class Solution_66 {
	public static int[] plusOne(int[] digits) {
		
		int length = digits.length;
		int[] result;
		int i;
		for (i = 0; i < length; i++) {
			if (digits[i] != 9) break;
		}
		if (i == length) {
			result = new int[length + 1];
			result[0] = 1;
			for (int j = 1; j < length + 1; j++) result[j] = 0;
			return result;
		}
		int n = length - 1;
		result = new int[length];
		
		while (n >= 0) {
			int tmp = digits[n] + 1;
			if (tmp <= 9) {
				result[n] = tmp;
				break;
			}
			result[n] = tmp - 10;
			n--;
		}
		for (int j = 0; j < n; j++) {
			result[j] = digits[j];
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] array =  {9};
		int[] result = plusOne(array);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]);
		}
	}
}

























