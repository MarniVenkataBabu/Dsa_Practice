package com.venkat.linkedlist;

/*
 * Input: head = [1,2,3,4,5]
	Output: [5,4,3,2,1]
 */
public class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
		ListNode current = head;
		ListNode previous = null;
		while(current != null) {
			ListNode next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		
        return previous;
    }
}
