package p876_MiddleOfTheLinkedList;

public class Solution {
	public ListNode middleNode(ListNode head) {
        ListNode curr = head;
        ListNode midNode = head;
        boolean changeMid = true;
		
        while(curr.next != null) {
        	curr = curr.next;
        	if(changeMid) midNode = midNode.next;
        	changeMid = !changeMid;
        }
		return midNode;
    }
}
