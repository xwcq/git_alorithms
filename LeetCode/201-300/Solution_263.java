import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

/*
 *  Write a program to check whether a given number is an ugly number.

	Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. 
	
	For example, 6, 8 are ugly while 14 is not ugly since it includes another prime factor 7.

	Note that 1 is typically treated as an ugly number.
 */

public class Solution_263 {
	public static boolean isUgly(int num) {
		if (num <= 0) return false;
		while (num != 1) {
			if (num % 2 == 0) num = num / 2;
			else if (num % 3 == 0) num = num / 3;
			else if (num % 5 == 0) num = num / 5;
			else break;
		}
		/*if (num == 1) return true;
		return false;*/
		return num == 1;
	}
	
	public static void main(String[] args) {
		System.out.println(Solution_263.isUgly(6));
		System.out.println(Solution_263.isUgly(8));
		System.out.println(Solution_263.isUgly(14));
		System.out.println(Solution_263.isUgly(1));
	}
}
