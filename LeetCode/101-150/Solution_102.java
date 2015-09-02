import java.util.*;

public class Solution_102 {
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	/* Queue使用时要尽量避免Collection的add()和remove()方法，
	 * 而是要使用offer()来加入元素，使用poll()来获取并移出元素。
	 * 它们的优点是通过返回值可以判断成功与否，
	 * add()和remove()方法在失败的时候会抛出异常。
	 */
	
	/**  first solution */
	
	/* use one queue and use levelNum to count the num of each level, kind of bfs */
	
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
	
	/** my answer **/
	/*  use two queues */
	/*public static List<List<Integer>> binaryTreePaths(TreeNode root) {
		Queue<TreeNode> queue_1 = new LinkedList<TreeNode>();
		Queue<TreeNode> queue_2 = new LinkedList<TreeNode>();
		List<Integer> short_list = new ArrayList<Integer>();
		List<List<Integer>> long_list = new ArrayList<List<Integer>>();
		if (root == null) return long_list;
		queue_1.add(root);
		int i = 1;
		Queue<TreeNode> queue_in, queue_out;
		while (!queue_1.isEmpty() || !queue_2.isEmpty()) {
			if (i % 2 == 0) {
				queue_in = queue_1;
				queue_out = queue_2;
			}
			else {
				queue_in = queue_2;
				queue_out = queue_1;
			}
			short_list = new ArrayList<Integer>();
			while (!queue_out.isEmpty()) {
				TreeNode tmp = queue_out.poll();
				short_list.add(tmp.val);
				if (tmp.left != null) {
					queue_in.add(tmp.left);
				}
				if (tmp.right != null) queue_in.add(tmp.right);
			}
			long_list.add(short_list);
			i++;
		}
		return long_list;
	}*/
	    
	/** third solution **/
	    
	    /* dfs */
	    /*public List<List<Integer>> levelOrder(TreeNode root) {
	        List<List<Integer>> res = new ArrayList<List<Integer>>();
	        levelHelper(res, root, 0);
	        return res;
	    }

	    public void levelHelper(List<List<Integer>> res, TreeNode root, int height) {
	        if (root == null) return;
	        if (height >= res.size()) {
	            res.add(new LinkedList<Integer>());
	        }
	        res.get(height).add(root.val);
	        levelHelper(res, root.left, height+1);
	        levelHelper(res, root.right, height+1);
	    }*/
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		List<List<Integer>> a = new ArrayList<List<Integer>>();
		a = binaryTreePaths(root);
		for (Iterator i = a.iterator(); i.hasNext(); ) {
			List<Integer> q = (List<Integer>)i.next();
			for (Iterator j = q.iterator(); j.hasNext(); ) {
				System.out.print((Integer)j.next() + "  ");
			}
			System.out.println();
		} 
	}
}







































