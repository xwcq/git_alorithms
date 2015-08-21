package algorithms_unit_2;

public class QuickSort {
	
	private QuickSort() {}
	
	public static void sort(Comparable[] p) {
		StdRandom.shuffle(p);
		sort(p, 0, p.length - 1);
	}
	
	private static void sort(Comparable[] p, int lo, int hi) {
		if (lo >= hi) return;
		int mid = partition(p, lo, hi);  
		sort(p, lo, mid - 1);
		sort(p, mid + 1, hi);
	} 
	
	private static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}
	
	private static int partition(Comparable[] p, int lo, int hi) {
		Comparable v = p[lo];
		int i = lo + 1, j = hi;
		while (true) {
			// the order of (i <= j ) and less(p[i], v) is important
			// if not, it may visit p[hi + 1] or such errors
			while (i <= j && less(p[i], v)) i++;  
			while (i <= j && less(v, p[j])) j--;
			if (i >= j) break;
			exch(p, i, j);
		} 
		exch (p, lo, j);
		return j;
	}
	
	private static void exch(Comparable[] p, int v, int w) {
		Comparable tmp = p[v];
		p[v] = p[w];
		p[w] = tmp;
	}
	
	public static void show(Comparable[] p) {
		for (int i = 0; i < p.length; i++) {
			System.out.print(p[i] + " ");
		}
		System.out.println();
	}
	
	public static boolean isSorted(Comparable[] p) {
		for (int i = 0; i < p.length - 1; i++) {
			if (p[i + 1].compareTo(p[i]) < 0) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Integer[] p = {3, 6, 10, 15, 11, 13, 1, 4, 2, 9, 7, 5, 8, 1};
		QuickSort.sort(p);
		System.out.println(QuickSort.isSorted(p));
		QuickSort.show(p);
	}
}















