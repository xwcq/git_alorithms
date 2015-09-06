import org.omg.Messaging.SYNC_WITH_TRANSPORT;


public class Solution_19 {
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode start = new ListNode(0); // to store the virtual-head node
		ListNode last;
		start.next = head;
		ListNode first = start;
		for (int i = 0; i < n; i++) {
			first= first.next;
		}
		last = start;
		while (first.next != null) {
			first = first.next;
			last = last.next;
		}
		last.next = last.next.next;
		return start.next;
	}
	
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		//head.next = new ListNode(2);
		ListNode tmp = removeNthFromEnd(head, 1);
		
		
		while (tmp != null) {
			System.out.print(tmp.val + " ");
			tmp = tmp.next;
		}
		
		/*ListNode head = new ListNode(1);
		ListNode tmp = head;
		for (int i = 2; i < 11; i++) {
			tmp.next = new ListNode(i);
			tmp = tmp.next;
		}
		tmp = head;
		while (tmp != null) {
			System.out.print(tmp.val + " ");
			tmp = tmp.next;
		}
		System.out.println();
		ListNode a = removeNthFromEnd(head, 7);
		tmp = head;
		while (tmp != null) {
			System.out.print(tmp.val + " ");
			tmp = tmp.next;
		}*/
	}
}


















