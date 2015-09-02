import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution_226 {
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	public static TreeNode invertTree(TreeNode root) {
		if (root == null) return root;
		if (root.left != null) root.left = invertTree(root.left);
		if (root.right != null) root.right = invertTree(root.right);
		TreeNode tmp = root.left;
		root.left = root.right;
		root.right = tmp;
		return root;
	} 
	
	/* just use this to test 
	 * level traverse
	 */
	 public static List<List<Integer>>  binaryTreePaths(TreeNode root) {
	        Queue<TreeNode> queue = new LinkedList<TreeNode>();
	        List<List<Integer>> wrapList = new LinkedList<List<Integer>>();

	        if(root == null) return wrapList;

	        queue.offer(root);
	        while(!queue.isEmpty()){
	            int levelNum = queue.size();
	            List<Integer> subList = new LinkedList<Integer>();
	            for(int i=0; i<levelNum; i++) {
	                if(queue.peek().left != null) queue.offer(queue.peek().left);
	                if(queue.peek().right != null) queue.offer(queue.peek().right);
	                subList.add(queue.poll().val);
	            }
	            wrapList.add(subList);
	        }
	        return wrapList;
	    }
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.right = new TreeNode(7);
		invertTree(root);
		List<List<Integer>> a = binaryTreePaths(root);
		for (Iterator i = a.iterator(); i.hasNext(); ) {
			List<Integer> q = (List<Integer>)i.next();
			for (Iterator j = q.iterator(); j.hasNext(); ) {
				System.out.print((Integer)j.next() + "  ");
			}
			System.out.println();
		} 
	}
}




















