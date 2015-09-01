import javax.sound.midi.Track;


public class Solution_172 {
	public static int trailingZeroes(int n) {
		/*int num = 0;
		if (n < 5) return num;
		int tmp = n;
		while (tmp % 5 == 0) {
			++num;
			tmp = tmp / 5;
		}
		if (tmp != n) {
			n = n - 5;
			num += trailingZeroes(n);
			return num;
		}
		else {
			n--;
			num += trailingZeroes(n);
			return num;
		}*/
		int num = 0;
		while (n != 0) {
			num += n / 5;
			n = n / 5;
		}
		return num;
	}
	
	public static void main(String[] args) {
		int a = 1;
		for (int i = 1; i <= 18; i++) {
			a *= i;
		}
		/*System.out.println(a);
		System.out.println(Solution_172.trailingZeroes(6));
		System.out.println(Solution_172.trailingZeroes(10));*/
	}
}

















