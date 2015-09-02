
public class Solution_110 {
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	
	/*******  my answer, top-down method  *******/
	/*public static boolean isBalanced(TreeNode root) {
		if (root == null) return true;
		if(Math.abs(getSize(root.left) - getSize(root.right)) <= 1) {
			if (isBalanced(root.left) && isBalanced(root.right)) {
				return true;
			}
		}
		return false;
	}
	
	private static int getSize(TreeNode root) {
		if (root == null) return 0;
		/*int size_left = 1, size_right = 1;
		if (root.left != null) size_left = 1 + getSize(root.left);
		if (root.right != null) size_right = 1 + getSize(root.right);
		return size_left > size_right ? size_left : size_right;*/
		
		/**** code above can be changed like this  ****/
		/*return Math.max(getSize(root.left), getSize(root.right)) + 1;
	}*/
	
	/*******   others' answer, bottom-up method  ********/
	private static int dfsHeight(TreeNode root) {
		if (root == null) return 0;
		
		int left_height = dfsHeight(root.left);
		if (left_height == -1) return -1;
		
		int right_height = dfsHeight(root.right);
		if (right_height == -1) return -1;
		
		if (Math.abs(left_height - right_height) > 1) return -1;
		return Math.max(left_height,right_height) + 1; 
	}
	
	public static boolean isBalanced(TreeNode root) {
		return dfsHeight(root) != -1;
	}
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(3);
		//System.out.println(getSize(root));
		//System.out.println(getSize(root.left));
		//System.out.println(getSize(root.right));
		root.left.right = new TreeNode(4);
		//root.left.left.left = new TreeNode(4);
		root.right = new TreeNode(5);
		if (isBalanced(root)) {
			System.out.println(1);
		}
		System.out.println(~1);
	}
}


























