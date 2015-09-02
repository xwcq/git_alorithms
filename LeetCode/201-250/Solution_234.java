
public class Solution_234 {
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
	public static boolean isPalindrome(ListNode head) {
		
	} 
	
	private static ListNode helper(ListNode head) {
		
	}
	
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(2);
		if (isPalindrome(head)) {
			System.out.println(1);
		}
	}
}












