package LinkList;

/**
 * 问题背景： 
 * 1. k个有序的链表。类似归并排序的合并阶段：采用分治策略？每次合并两个链表 
 * 2.
 * 
 * @author Chi
 *
 */

public class MergeKSortedLinkList {
	public ListNode mergeKLists(ListNode[] lists) {
		if (lists.length == 0) {
			return null;
		}
		int end = lists.length - 1;
		while (end > 0) {
			int begin = 0;
			while (begin < end) {
				lists[begin] = mergeTwoLists(lists[begin], lists[end]);
				begin++;
				end--;
			}
		}
		return lists[0];

	}

	private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
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
