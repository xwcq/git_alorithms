
public class Solution_219 {
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		int length = nums.length;
		for (int i = 0; i < length; i++) {
			
		}
		
		// low efficiency
		/*int length = nums.length;
		for (int i = 0; i < length; i++) {
			int j = (i - k > 0) ? (i - k) : 0;
			for (; j <= i + k && j < length; j++) {
				if (i == j) continue;
				if (nums[i] == nums[j]) return true;
			}
		} 
		return false;*/
	}
	
	public static void main(String[] args) {
		int[] nums = {1};
		System.out.println(containsNearbyDuplicate(nums, 1));
	}
}
