import java.util.Arrays;
import java.util.Comparator;

public class answer {
	// just define a compare-method
    public static final Comparator<String> CANDIDATE_ORDER = new CandidateComparator();

    private static class CandidateComparator implements Comparator<String> {
        private static String order = "RWQOJMVAHBSGZXNTCIEKUPDYFL";
        public int compare(String a, String b) {
            if (a == b) return 0;
            int n = Math.min(a.length(), b.length());
            for (int i = 0; i < n; i++) {
                int aindex = order.indexOf(a.charAt(i));
                int bindex = order.indexOf(b.charAt(i));
                if      (aindex < bindex) return -1;
                else if (aindex > bindex) return +1;
            }
            // more precise than if(a.length - b.length>0 ......)
            return a.length() - b.length();
        }
    }

    // test client
    public static void main(String[] args) {
    	String a = "RAB WQOA RABWA RWA SDFV SEDCD EIKV";
    	String[] candidates = a.split(" ");
        //String[] candidates = StdIn.readAll().toUpperCase().split("\\n+");
        int N = candidates.length;
        Arrays.sort(candidates, answer.CANDIDATE_ORDER);
        for (int i = 0; i < N; i++)
            StdOut.println(candidates[i]);
    }

}