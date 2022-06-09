package p234_PalindromeLinkedList;

import java.util.ArrayList;

/*
 * Given the head of a singly linked list, return true if it is a palindrome
 * 
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class Solution {
	public boolean isPalindrome(ListNode head) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		ListNode curr = head;
		while(curr.next != null) {
			list.add(curr.val);
			curr = curr.next;
		}
		list.add(curr.val);
		
		for(int i = 0; i < list.size()/2; i++) {
			if(list.get(i) != list.get(list.size()-1-i)) return false;
		}
		
		return true;
	}
}
