package LinkList;

/**
 * 问题背景： 1. 链表有序 2. 返回一个新的链表 3. 两个链表长度是否相同。长度相同的情况，长度不同的情况如何处理？
 * 
 * 核心问题：已知两个节点A,B，添加哪个节点进入新链表，并进行下一步操作？
 *  if A.val > B.val ， A= A.next
 * ，A的值进入新链表。否则B=B.next。 
 * 循环结束条件 A == null && B==null 
 * 添加非空的链表。
 * if (l1 != null){ p.next = l1; } 
 * if (l2 != null){ p.next = l2; }
 * 
 * @author Chi
 *
 */

public class Merge2SortedLinkList {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode dummy = new ListNode(0);
		ListNode p = dummy;
		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				p.next = l1;
				l1 = l1.next;
			} else {
				p.next = l2;
				l2 = l2.next;
			}
			p = p.next;
		}
		if (l1 != null) {
			p.next = l1;
		}
		if (l2 != null) {
			p.next = l2;
		}
		return dummy.next;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
