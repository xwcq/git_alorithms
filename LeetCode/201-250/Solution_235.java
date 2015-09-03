import java.util.LinkedList;
import java.util.Queue;


public class Solution_235 {
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (root == null) return null;
		if (root == p) return p;
		else if (root == q) return q;
		int flag = leftOrRight(root, p, q);
		if (flag == 0) return root;
		else if (flag > 0) return lowestCommonAncestor(root.right, p, q);
		else return lowestCommonAncestor(root.left, p, q);
	}
	
	// if p, q are in the different side, return 0, else if all in left, return -1, else return 1;
	private static int leftOrRight(TreeNode root, TreeNode p, TreeNode q) {
		if (root.left == null) return 1;
		if (root.right == null) return -1;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root.left);
		int p_get = 0, q_get = 0;
		while (!queue.isEmpty()) {
			TreeNode tmp = queue.poll();
			if (tmp == p) p_get = 1;
			else if (tmp == q) q_get = 1;
			if (q_get == 1 && p_get == 1) return -1;
			if (tmp.left != null) queue.offer(tmp.left);
			if (tmp.right != null) queue.offer(tmp.right);
		}  
		if (q_get  == 0 && p_get == 0) return 1;
		else return 0;
	}
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(6);
		TreeNode left = new TreeNode(2);
		TreeNode left_left = new TreeNode(0);
		TreeNode left_right = new TreeNode(4);
		TreeNode left_right_left = new TreeNode(3);
		TreeNode left_right_right = new TreeNode(5);
		TreeNode right = new TreeNode(8);
		TreeNode right_left = new TreeNode(7);
		TreeNode right_right = new TreeNode(9);
		root.left = left;
		root.left.left = left_left;
		root.left.right = left_right;
		root.left.right.left = left_right_left;
		root.left.right.right = left_right_right;
		root.right = right;
		root.right.left = right_left;
		root.right.right = right_right;
		TreeNode tmp = lowestCommonAncestor(root, left, left_right);
		System.out.println(tmp.val);
	}
}
























