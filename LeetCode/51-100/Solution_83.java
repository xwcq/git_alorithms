
public class Solution_83 {
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
	public static ListNode deleteDuplicates(ListNode head) {
		if (head == null || head.next == null) return head;
		ListNode tmp = head;
		while (tmp.next != null) {
			if (tmp.val == tmp.next.val) tmp.next = tmp.next.next;
			else tmp = tmp.next;
		}
		return head;
	}
	
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(1);
		head.next.next = new ListNode(2);
		head = deleteDuplicates(head);
		ListNode tmp = head;
		while (tmp != null) {
			System.out.print(tmp.val + " ");
			tmp = tmp.next;
		}
	}
}
