
public class Solution_165 {
	public int compareVersion(String version1, String version2) {
		int num1, num2;
		String[] sp1 = version1.split("\\.");
		String[] sp2 = version2.split("\\.");
		int sp1_0 = Integer.parseInt(sp1[0]);
		int sp2_0 = Integer.parseInt(sp2[0]);
		if (sp1_0 > sp2_0) return 1;
		else if (sp1_0 < sp2_0) return -1;
		else {
			int sp1_1 = Integer.parseInt(sp1[1]);
			int sp2_1 = Integer.parseInt(sp2[1]);
			if (sp1_1 > sp2_1) return 1;
			else if (sp1_1 > sp2_1) return -1;
			else return 0;
		}	
	} 
	
	public static void main(String[] args) {
		String a = "123.11";
		String[] sp = a.split("\\.");
		System.out.println(Integer.parseInt(sp[0]) + " " + sp[1]);
	}
} 
