
public class MergeSort {
        // don't know what to do
	private static Comparable[] aux;
	
	private MergeSort() {}
	
	public static void sort(Comparable[] p) {
		int length = p.length;
		aux = new Comparable[length];
		sort(p, 0, length - 1);
	}
	
	private static void sort(Comparable[] p, int lo, int hi) {
		if (lo >= hi) return;
		int mid = lo + (hi - lo) / 2;
		sort(p, lo, mid);
		sort(p, mid + 1, hi);
		merge(p, lo, mid, hi);
	}
	
	public static void show(Comparable[] p) {
		for (int i = 0; i < p.length; i++) {
			System.out.print(p[i] + "  ");
		}
	}
	
	private static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}
	
	private static void merge(Comparable[] p, int lo, int mid, int hi) {
		for (int i = lo; i <= hi; i++) {
			aux[i] = p[i];
		}
		int i = lo, j = mid + 1;
		for (int k = lo; k <= hi; k++) {
			if (i > mid) p[k] = aux[j++];
			else if (j > hi) p[k] = aux[i++];
			else if (less(aux[i], aux[j])) p[k] = aux[i++];
			else p[k] = aux[j++];
		}
	}
	
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int m = Integer.parseInt(args[1]);
		Double[] array = new Double[n];
		double time = 0;
		for (int j = 0; j < m; j++) {
			
			for (int i = 0; i < array.length; i++) {
				array[i] = StdRandom.uniform();
			}
			Stopwatch timer = new Stopwatch();
			MergeSort.sort(array);
			time += timer.elapsedTime();
		}
		System.out.println("MergesertSort:  " + n + "   doubles," + m + " times"+ "  time is  " + time);
	}
}



























