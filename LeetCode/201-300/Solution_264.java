/*
 * 	Write a program to find the n-th ugly number.

	Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.
	
	For example, 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 is the sequence of the first 10 ugly numbers.

	Note that 1 is typically treated as an ugly number.

Hint:

	1   The naive approach is to call isUgly for every number until you reach the nth one. 
		Most numbers are not ugly. Try to focus your effort on generating only the ugly ones.
	2   An ugly number must be multiplied by either 2, 3, or 5 from a smaller ugly number.
	3   The key is how to maintain the order of the ugly numbers. 
	    Try a similar approach of merging from three sorted lists: L1, L2, and L3.
	4   Assume you have Uk, the kth ugly number. Then Uk+1 must be Min(L1 * 2, L2 * 3, L3 * 5).
 */

import java.math.*;

public class Solution_264 {
	public static int nthUglyNumber(int n) {
		int index2 = 2;
		int index3 = 3;
		int index5 = 5;
		int num = 1;
		int smallest = 1;
		while (num != n){
			smallest = Math.min(index2, Math.min(index3, index5));
			num ++;
			if (smallest == index2) index2 = smallest * 2;
			else if (smallest == index3) index3 = smallest * 3;
			else index5 = smallest * 5;
			System.out.println(index2 + " " + index3 + " " + index5);
		}
		return smallest;
	}
	
	public static void main(String[] args) {
		/*for (int i = 1; i < 10; i++) {
			System.out.print(Solution_264.nthUglyNumber(i) + " ");
		}*/
			Solution_264.nthUglyNumber(10);
		
	}
}


















