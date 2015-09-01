import java.util.*;

public class Solution_228 {
	public static List<String> summaryRanges(int[] nums) {
		/****** others answer  ******/
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < nums.length; i++) {
			int a = nums[i];
			while (i + 1 < nums.length && ((nums[i + 1] - nums[i]) == 1)) {
				i++;
			}
			if (a != nums[i]) {
				list.add(a + "->" + nums[i]);
			}
			else list.add(a + "");
		}
		return list;
		
		/*****   my solutin  ******/
		/*List<String> list = new ArrayList<String>();
		int tmp = 0;
		String a = null;
		int i = 1;
		for (i = 1; i < nums.length; i++) {
			if (nums[i] - nums[tmp] == i - tmp) continue;
			if (i - tmp == 1) {
				a = nums[tmp] + "";
				tmp = i;
				list.add(a);
			}
			else {
				a = nums[tmp] + "->" + nums[i - 1];
				tmp = i;
				list.add(a);
			}
		}
		if (i - tmp == 1) {
			a = nums[tmp] + "";
			tmp = i;
			list.add(a);
		}
		else {
			a = nums[tmp] + "->" + nums[i - 1];
			tmp = i;
			list.add(a);
		}
		return list;*/
	}
	
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 5, 6, 7, 9};
		List<String> al = Solution_228.summaryRanges(nums);
		for (Iterator i = al.iterator(); i.hasNext(); ) {
			System.out.println((String)i.next());
		}
	}
}





















