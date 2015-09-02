import java.util.*;
public class Solution_223 {
	public static int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
		int x, y;
		if (E >= C || G <= A || F >= D || H <= B) x = y = 0;
		else {
			x = Math.min(C, G) - Math.max(A, E);
            y = Math.min(D, H) - Math.max(B, F);
		}
		int areaOfA = Math.abs((A - C) * (B - D)); 
		int areaOfB = Math.abs((E - G) * (F - H)); 
		return areaOfA + areaOfB - x * y;
	}
	
	public static void main(String[] args) {
		computeArea(-2, -2, 2, 2, -1, -1, 1, 1);
	}
}
