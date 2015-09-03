import java.util.List;


public class Solution_206 {
	public static class LinkNode {
		int val;
		LinkNode next;
		LinkNode(int x) { val = x; }
	}
	
	public static LinkNode reverseList(LinkNode head) {
		if (head == null || head.next == null) return head;
		/*LinkNode new_head = reverseList(head.next);
		LinkNode tmp = new_head;
		while (tmp.next != null) tmp = tmp.next;
		tmp.next = head;
		head.next = null;
		return new_head;*/
		
		/* code above can be replaced by this */
		/* use variable last to store the last node instead of using while
		 * to get the tail of the list
		 */
		LinkNode last = head.next;
		LinkNode new_head = reverseList(last);
		last.next = head;
		head.next = null;
		return new_head;
	}
	
	public static void show(LinkNode head) {
		LinkNode tmp = head;
		while (tmp != null) {
			System.out.print(tmp.val + " ");
			tmp = tmp.next;
		}
	}
	
	public static void main(String[] args) {
		LinkNode head = new LinkNode(1);
		head.next = new LinkNode(2);
		head.next.next = new LinkNode(3);
		head = reverseList(head);
		show(head);
	}
}













