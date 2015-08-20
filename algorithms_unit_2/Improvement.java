package algorithms_unit_2;

public class Improvement {
private static Comparable[] aux;
	
	private Improvement() {}
	
	public static void sort(Comparable[] p) {
		int length = p.length;
		aux = new Comparable[length];
		sort(p, 0, length - 1);
	}
	
	private static void sort(Comparable[] p, int lo, int hi) {
		if (lo >= hi) return;
		if (hi - lo < 7) {
			insertSort(p, lo, hi);
			return;
		}
		int mid = lo + (hi - lo) / 2;
		sort(p, lo, mid);
		sort(p, mid + 1, hi);
		if (less(p[mid], p[mid + 1])) return;
		merge(p, lo, mid, hi);
	}
	
	private static void insertSort(Comparable[] p, int lo, int hi) {
		for (int i = lo; i <= hi; i++) {
			int j;
			Comparable tmp = p[i];
			for (j = i - 1; j >= lo && less(tmp, p[j]); j--) {
				p[j + 1] = p[j];
			}
			p[j + 1] = tmp;
		}
		/*for (int i = lo; i <= hi; i++)
            for (int j = i; j > lo && less(a[j], a[j-1]); j--)
                exch(a, j, j-1);*/
	}
	
	private static void exch(Object[] a, int i, int j) {
        Object swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
	
	public static void show(Comparable[] p) {
		for (int i = 0; i < p.length; i++) {
			System.out.print(p[i] + "  ");
		}
		System.out.println();
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
	
	public static boolean isSorted(Comparable[] p) {
		for (int i = 0; i < p.length - 1; i++) {
			if (less(p[i + 1], p[i])) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		/*int n = 10;
		Integer[] array = {2, 4, 7, 1, 3, 9, 8, 5, 0, 6};
		System.out.println(Improvement.isSorted(array));
		Improvement.sort(array);
		Improvement.show(array);
		System.out.println(Improvement.isSorted(array));*/
		int n = 1000000;
		int m = 10;
		Double[] array = new Double[n];
		double time = 0;
		for (int j = 0; j < m; j++) {
			
			for (int i = 0; i < array.length; i++) {
				array[i] = StdRandom.uniform();
			}
			Stopwatch timer = new Stopwatch();
			Improvement.sort(array);
			time += timer.elapsedTime();
		}
		System.out.println(Improvement.isSorted(array));
		System.out.println("Improvement_MergesertSort:  " + n + "   doubles," + m + " times"+ "  time is  " + time);
	}
}
