
public class Solution_190 {
	public static int reverseBits(int n) {
		int nums = 0;
		for (int i = 0; i < 32; i++) {
			/*if ((n & 1) == 1) nums = (nums << 1) | 1;
			else nums = nums << 1;*/
			// code above can be replaced by only one statement
			nums = nums << 1 | (n & 1);
			n >>>= 1;
		}
		return nums;
	}
	
	public static void main(String[] args) {
		System.out.println(reverseBits(43261596));
		// 964176192
	}
}	
