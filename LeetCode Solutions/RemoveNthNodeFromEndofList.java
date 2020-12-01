 
/*
Given the head of a linked list, remove the nth node from the end of the list and return its head.

Follow up: Could you do this in one pass?

Example 1:

Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
Example 2:

Input: head = [1], n = 1
Output: []
Example 3:

Input: head = [1,2], n = 1
Output: [1]
 */


public class RemoveNthNodeFromEndofList {

	//  Definition for singly-linked list.
	class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}

	public int backtrack(ListNode list, int num, int counter) {
		if(list.next == null) {return ++counter;}
		counter = backtrack(list.next, num, counter);
		if(counter == num) {
			list.next = list.next.next;
		}
		return ++counter;
	}
	/*
	public ListNode removeNthFromEnd(ListNode head, int n) {
		if(head == null || n==0) return head;
		ListNode temp = head;
		int counter = backtrack(head, n, 0);
		if(counter == n) {
			head = head.next;
		}
		return head;
	}
	*/
	public ListNode removeNthFromEnd(ListNode head, int n) {
		if(head == null || n == 0) return head;
		ListNode dummy = new ListNode(0,head);
		ListNode first = dummy, second = dummy;
		for(int i=1; i<=n+1; i++)
			first = first.next;
		while(first != null) {
			first = first.next;
			second = second.next;
		}
		second.next = (second.next != null) ? second.next.next : null;
		return dummy.next;
	}
	public static void main(String[] args) {
		RemoveNthNodeFromEndofList parent = new RemoveNthNodeFromEndofList();
		ListNode list = parent.new ListNode(1,parent.new ListNode(2,parent.new ListNode(3,parent.new ListNode(4,parent.new ListNode(5)))));
		list = parent.removeNthFromEnd(list, 2);
		System.out.println(list.next.next.next.val);
	}

}
