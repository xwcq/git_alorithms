
public class GPA {
	private static String[] letter ;
	private static double[] mark ;
	
	private GPA() { }
	
	public static double getMark(String s) {
		int i;
		for (i = 0; i < 11; i++) {
			if (letter[i].equals(s)) break;
		}
		return mark[i];
	}
	 
	static {   // static module will be run once 
		letter = new String[] {"A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D", "F"};
		mark = new double[] {4.33, 4.00, 3.67, 3.33, 3.00, 2.67, 2.33, 2.00, 1.67, 1.00, 0.00};
	}
	
	public static void main(String[] args) {
		String[] a = {"A+", "B", "F"};
		double mark = 0;
		int length = a.length;
		for (int i = 0; i < length; i++) {
			mark += GPA.getMark(a[i]);
		}
		System.out.println(mark / length);
	}
}
















