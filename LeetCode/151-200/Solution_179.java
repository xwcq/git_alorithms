import java.util.Arrays;
import java.util.Comparator;

import com.sun.imageio.plugins.common.I18N;

public class Solution_179 {
	// something is wrong
	public static String largestNumber(int[] nums) {
		String result = "";
		int length = nums.length;
		if (length == 0) return result;
		Integer[] nums_copy = new Integer[length];
		for (int i = 0; i < length; i++) nums_copy[i] = nums[i];
		// select the numbers whose highest bits are 9, and these numbers should
		// be left-most, and 8, 7, 6, ... accordingly
		// then sort the numbers with the same highest bits,
		// first compare its second-left bits, 
		// one with a larger bit should be in front of the one with a smaller bit
		Arrays.sort(nums_copy, WTF);
		for (int i = length - 1; i >= 0; i--) {
			result += nums_copy[i];
		}
		return result;
	}
	
	public static final Comparator<Integer> WTF = new WTF();
	
	private static class WTF implements Comparator<Integer> {
		@Override
		public int compare(Integer o1, Integer o2) {
			boolean isBigger = true;
			int o1_tmp, o2_tmp;
			do {
				o1_tmp = o1 % 10;
				o2_tmp = o2 % 10;
				if (o1 / 10 != 0 ) o1 /= 10;
				if (o2 / 10 != 0 ) o2 /= 10;
				if (o1_tmp < o2_tmp) isBigger = false;
				else isBigger = true;
			}while (o1 / 10 != 0 && o2 / 10 != 0);
			if (isBigger) return 1;
			else return -1;
		}
	}
	
	//other's 
	// convert int a, b into String a, b and then compare (a+b) and (b+a) 
	
	public static void main(String[] args) {
		
		int[] a = {9,89};
		System.out.println(largestNumber(a));
		Integer o1 = 9, o2 = 89;
		boolean isBigger = true;
		int o1_tmp, o2_tmp;
		do {
			o1_tmp = o1 % 10;
			o2_tmp = o2 % 10;
			if (o1 / 10 != 0 ) o1 /= 10;
			if (o2 / 10 != 0 ) o2 /= 10;
			if (o1_tmp < o2_tmp) isBigger = false;
			else isBigger = true;
		}while (o1 / 10 != 0 && o2 / 10 != 0);
		System.out.println(isBigger);
	}
}
















