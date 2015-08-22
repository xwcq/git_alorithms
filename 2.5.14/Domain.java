import java.util.Arrays;
import java.util.Comparator;

public class Domain{
	
	private final String[] domain;
	
	public static final Comparator<String> DOMAIN_ORDER = new DomainComparator();
	
	public Domain(String q) {
		String[] list = q.split(" ");
		int length = list.length;
		domain = new String[length];
		String[] tmp;
		String getReverse;
		for (int i = 0; i < length; i++) {
			tmp = list[i].split("\\.");
			getReverse = tmp[tmp.length - 1];
			for (int j = tmp.length - 2; j >= 0; j--) {
				getReverse += "." + tmp[j];
			}
			domain[i] = getReverse;
		}
	}
	
	public void sort() {
		Arrays.sort(domain, DOMAIN_ORDER);
	}
	
	private static class DomainComparator implements Comparator<String> {
		public int compare(String a, String b) {
			return a.compareTo(b);
		}
	}
	
	public void show() {
		for (int i = 0; i < domain.length; i++) {
			System.out.println(domain[i]);
		}
	} 
	
	public static void main(String[] args) {
		String[] names = StdIn.readAllStrings();
		String a;
		a = names[0];
		for (int i = 1; i < names.length; i++) {
			a += " " + names[i];
		}
		Domain test = new Domain(a);
		test.sort();
		test.show();
	}
}





















