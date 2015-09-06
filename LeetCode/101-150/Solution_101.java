
public class Solution_101 {
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	public static boolean isSymmetric(TreeNode root) {
		if (root == null) return true;
		return isSymmetric(root.left, root.right);
	} 
	
	private static boolean isSymmetric(TreeNode left, TreeNode right) {
		/*if (left == null && right == null) return true;
		else if (left == null || right == null) return false;*/
		if (left == null || right == null) return left == right;
		
		if (left.val != right.val) return false;
			/*boolean outSide = isSymmetric(left.left, right.right);
			if (outSide == false) return false;
			boolean inSide = isSymmetric(left.right, right.left);
			if (inSide == false) return false;*/
		/* code above can be replaced by */
		return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
		
	}
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(2);
		//root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(3);
		//root.right.left = new TreeNode(4);
		root.right.right = new TreeNode(3);
		System.out.println(isSymmetric(root));
	}
}








