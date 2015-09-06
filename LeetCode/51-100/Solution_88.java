
public class Solution_88 {
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int i = m - 1;
		int j = n - 1;
		int sign = m + n - 1;
		while (j >= 0) {
			if (i < 0) 	nums1[sign--] = nums2[j--];
			else nums1[sign--] = nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
		}
		/*for (sign = m + n - 1; sign >= 0; sign--) {
			if (i < 0) {
				nums1[sign] = nums2[j--];
				continue;
			}
			if (j < 0) break;
			if (nums1[i] > nums2[j]) nums1[sign] = nums1[i--];
			else nums1[sign] = nums2[j--];
		}*/
	}
	
	public static void main(String[] args) {
		int[] nums1 = {0};
		int[] nums2 = {1};
		merge(nums1, 0, nums2, 1);
		for (int i = 0;i < nums1.length; i++) {
			System.out.print(nums1[i] + "  ");
		}
	}
}
