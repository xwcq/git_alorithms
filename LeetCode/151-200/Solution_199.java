import java.util.*;

import com.sun.org.apache.bcel.internal.generic.AALOAD;

public class Solution_199 {
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	// other's answer, dfs
	public static List<Integer> rightSideView(TreeNode root) {
		List<Integer> result = new ArrayList<Integer>(); 
		rightView(root, result, 0);
		return result;
	} 
	// using dfs always needs to pass other parameters to accomplish the conditions
	private static void rightView(TreeNode curr, List<Integer> result, int currDepth) {
		if (curr == null) return;
		if (currDepth == result.size()) result.add(curr.val);
		rightView(curr.right, result, currDepth + 1);
		rightView(curr.left, result, currDepth + 1);
	}
	
	// my answer, bfs
	
	/*public static List<Integer> rightSideView(TreeNode root) {
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		ArrayList<TreeNode> list = new ArrayList<TreeNode>();
		if (root == null) return arraylist;
		list.add(root);
		while (!list.isEmpty()) {
			// every turn all of the members in list should remove and add sons of them
			// in order to ensure that they are all in the same depth 
			int size = list.size();
			for (int i = 0; i < size; i++) {
				TreeNode tmp = list.remove(0);
				if (i == 0) arraylist.add(tmp.val);
				if (tmp.right != null) list.add(tmp.right);
				if (tmp.left  != null) list.add(tmp.left);
			}
		}
		return arraylist;
	}*/
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.right = new TreeNode(5);
		root.right.right = new TreeNode(4);
		root.left.left = new TreeNode(6);
		root.left.left.left = new TreeNode(7);
		ArrayList<Integer> arrayList = (ArrayList<Integer>)rightSideView(root);
		while (!arrayList.isEmpty()) {
			System.out.println(arrayList.remove(0));
		}
	}
}








