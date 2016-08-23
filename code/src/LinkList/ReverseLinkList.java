package LinkList;

public class ReverseLinkList {
	public ListNode reverseRec(ListNode head) {
	    /* recursive solution */
	    return reverseList(head, null);
	}

	private ListNode reverseList(ListNode head, ListNode newHead) {
	    //边界条件
		if (head == null)
	        return newHead;
		// 递推
	    ListNode next = head.next;
	    head.next = newHead;
	    
	    return reverseList(next, head);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
