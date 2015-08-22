import java.util.*;

public class California implements Comparable<California>{
	public String sentence;
	
	public California() {
		sentence = null;
	}
	
	public California(String sentence) {
		//this.sentence = sentence;   // maybe cause some problem
		this.sentence = new String(sentence);
	}
	
	public String toString() {
		return sentence;
	}
	
	private static String order = "RWQOJMVAHBSGZXNTCIEKUPDYFL";
	
	public int compareTo(California that) {
		int this_length = this.sentence.length();
		int that_length = that.sentence.length();
		int lessLength = this_length < that_length ? this_length : that_length;
		for (int i = 0; i < lessLength; i++) {
			int this_index = order.indexOf(this.sentence.charAt(i));
			int that_index = order.indexOf(that.sentence.charAt(i));
			if (this_index > that_index) return 1;
			else if(this_index < that_index) return -1;
		}
		if (this_length > that_length) return 1;
		else if (this_length < that_length) return -1;
		else return 0;
	}
	
	public static void main(String[] args) {
		String a = "RAB WQOA RABWA RWA SDFV SEDCD EIKV";
		String[] list = a.split(" ");
		California[] people = new California[list.length];
		for (int i = 0; i < list.length; i++) {
			people[i] = new California(list[i]);
		}
		Arrays.sort(people);
		for (int i = 0; i < people.length; i++) {
			System.out.println(people[i].toString());
		}
	}
}

























