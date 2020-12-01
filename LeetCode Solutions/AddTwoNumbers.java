
/*
 * 2. Add Two Numbers
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
 */


//  Definition for singly-linked list.
  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	int carry =0;
    	ListNode result = new ListNode();
    	ListNode curNode = result;
    	while(!(l1 == null && l2 == null)){
    		int res = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val ) +carry;
    		carry = res / 10;
    		res %= 10;
    		curNode.next = new ListNode(res);
    		curNode = curNode == null ? null: curNode.next;
    		l1 = l1 == null ? null : l1.next;
    		l2 = l2 == null ? null : l2.next;
    	}
    	if(carry != 0) {
    		curNode.next = new ListNode(carry);
    	}
    	return result.next;
    }
}

public class AddTwoNumbers {

	public static void main(String[] args) {
		ListNode head = new ListNode(5);
//		head.next = new ListNode(5);
//		head.next.next = new ListNode(3);
		ListNode head1 = new ListNode(5);
//		head1.next = new ListNode(5);
//		head1.next.next = new ListNode(3);
//		head1.next.next.next = new ListNode(4);
		Solution sol = new Solution();
		System.out.println(sol.addTwoNumbers(head, head1).next.val);
	}

}
