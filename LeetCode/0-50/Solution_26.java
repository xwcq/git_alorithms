
public class Solution_26 {
	public static int removeDuplicates(int[] nums) {
		int length = nums.length;
		if (length == 0) return 0;
		int length_mark = 0;
		for (int traverse = 1; traverse < length; traverse++){
			if (nums[length_mark] != nums[traverse]) exch(nums, ++length_mark, traverse);
		}
		return ++length_mark;
	}
	
	private static void exch(int[] nums, int m, int n) {
		int tmp = nums[m];
		nums[m] = nums[n];
		nums[n] = tmp;
	}
	
	
	public static void main(String[] args) {
		int[] nums = { 1,1,2,2,2,3,4,4,4};
		System.out.println(removeDuplicates(nums));
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		
	}
}





















