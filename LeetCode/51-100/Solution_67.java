
public class Solution_67 {
	public static String addBinary(String a, String b) {
		String result = "";
		int i = a.length() - 1;
		int j = b.length() - 1;
		int carry = 0;
		while (i >= 0 || j >= 0 || carry == 1) {
			int aBit = (i >= 0) ? Character.getNumericValue(a.charAt(i--)) : 0;
			int bBit = (j >= 0) ? Character.getNumericValue(b.charAt(j--)) : 0;
			result = (aBit ^ bBit ^ carry) + result;
			carry = (aBit + bBit + carry) > 1 ? 1: 0; 
		}
		return result;
	}
	
	public static void main(String[] args) {
		String a = addBinary("101111", "10");
		System.out.println(a);
	}
}

















