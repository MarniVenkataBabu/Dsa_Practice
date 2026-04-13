package com.venkat.linkedlist;

import java.util.HashSet;

public class RemoveDuplicates {
	public Node deleteDups(SinglyLinkedList sl) {
		HashSet<Integer> set = new HashSet<>();
		Node current = sl.head;
		Node previous = null;
		while(current != null) {
			int curValue = current.value;
			if(set.contains(curValue)) {
				previous.next = current.next;
				current = current.next;
				sl.size--;
			}else {
				set.add(curValue);
				previous = current;
				current = current.next;
			}
		}
		
		
		
		return sl.head;
	}
}
