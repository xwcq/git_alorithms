import java.util.ArrayList;

import com.sun.org.apache.bcel.internal.generic.AALOAD;


public class Solution_14 {
	public String longestCommonPrefix(String[] strs) {
		/* firstly find all the common prefix of 2 strings
		 * and use some kind of dp 
		 */
		int length = strs.length;
		if (length == 0) return null;
		if (length == 1) return strs[0];
		
		// the first two common prefix
		ArrayList<String> list = new ArrayList<String>();
		
	}
}
