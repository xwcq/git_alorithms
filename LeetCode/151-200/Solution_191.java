
public class Solution_191 {
	public static int hammingWeight(int n) {
		int nums = 0;
		while (n != 0) {
			if ((n & 1) == 1) nums++;
			n = n >>> 1;  /*  >>> is right shift for unsigned int */ 
		}
		return nums;
	} 
	
	public static void main(String[] args) {
		System.out.println(hammingWeight(1244));
	}
}
