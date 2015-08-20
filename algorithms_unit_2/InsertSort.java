package algorithms_unit_2;

public class InsertSort {
	
	private InsertSort(){}    // this class cannot be initialized
	
	public static void sort(Double[] p) {
		
		/*for (int i = 1; i < p.length; i++) {
			int j;
			double tmp = p[i];
			for (j = i - 1; j >= 0 && less(tmp, p[j]); j--) {
				p[j + 1] = p[j];
			}
			p[j + 1] = tmp;
		}*/
		for (int i = 1; i < p.length; i++)
            for (int j = i; j > 1 && less(p[j], p[j-1]); j--)
                exch(p, j, j-1);
	}
	
	private static void exch(Double[] p, int i, int j){
		Double tmp = p[i];
		p[i] = p[j];
		p[j] = tmp;
	}
	
	private static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}
	
	public static void show(Double[] p) {
		for (int i = 0; i < p.length; i++) {
			System.out.print(p[i] + " ");
		}
	}
	
	public static boolean isSorted(Comparable[] p) {
		for (int i = 0; i < p.length - 1; i++) {
			if (less(p[i + 1], p[i])) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		int n = 10000;
		Double[] array = new Double[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = StdRandom.uniform();
		}
		Stopwatch timer = new Stopwatch();
		InsertSort.sort(array);
		double time = timer.elapsedTime();
		System.out.println(time);
		System.out.println(InsertSort.isSorted(array));
	}
}
























