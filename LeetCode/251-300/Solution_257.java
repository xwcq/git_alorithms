import java.lang.reflect.Array;
import java.util.*;

public class Solution_257 {
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	/*** not my answer ***/
	
	public static List<String> binaryTreePaths(TreeNode root) {
		List<String> answer = new ArrayList<String>();
		if (root != null) searchBT(root, "", answer);
		return answer;
	}
	
	private static void searchBT(TreeNode root, String path, List<String> answer) {
		if (root.left == null && root.right == null) answer.add(path + root.val);
		if (root.left != null) searchBT(root.left, path + root.val + "->", answer);
		if (root.right !=null) searchBT(root.right, path + root.val + "->", answer);
	}
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.right = new TreeNode(5);
		List<String> a = binaryTreePaths(root);
		for (Iterator i = a.iterator(); i.hasNext(); ) {
			System.out.println((String)i.next());
		}
	}
}



















