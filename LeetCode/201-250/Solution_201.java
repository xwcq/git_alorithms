
public class Solution_201 {
	public static int rangeBitWiseAnd(int m, int n) {
		//other's answer
		int i = 0;
		while (m != n) {
			m >>= 1;
			n >>= 1;
			i++;
		}
		return m << i;
		
		// my answer
		
		//if (m == 0) return 0;
		//if (m == n) return m;
		// can be replaced by this
		/*if (m == 0 || m == n) return m;
		int m_copy = m, n_copy = n;
		int length_m = 0, length_n = 0;
		for (; m_copy != 0; m_copy >>= 1) ++length_m;
		for (; n_copy != 0; n_copy >>= 1) ++length_n;
		if (length_n > length_m) return 0;
		int i;
		for (i = 1; i < length_m; i++) {
			m >>= 1;
			n >>= 1;
			if (m == n) break;
		}
		return m << i;*/
	}
	
	public static void main(String[] args) {
		int m = 1, n = 4;
		System.out.println(Integer.toBinaryString(m));
		System.out.println(Integer.toBinaryString(n));
		System.out.println(Integer.toBinaryString(rangeBitWiseAnd(m, n)));
	}
}
