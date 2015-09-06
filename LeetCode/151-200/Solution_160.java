import Solution_206.LinkNode;


public class Solution_160 {
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
			next = null;
		}
	}
	
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == null || headB == null) return null;
		
		ListNode headA_last = null;
		ListNode headB_last = null;
		if (headA_last.next == null && headB_last.next == null) {
			if (headA_last != headB_last) return null;
			
		}
	}
}













