package LinkList;

/**
 * ���ⱳ���� 1. �������� 2. ����һ���µ����� 3. �����������Ƿ���ͬ��������ͬ����������Ȳ�ͬ�������δ���
 * 
 * �������⣺��֪�����ڵ�A,B������ĸ��ڵ������������������һ��������
 *  if A.val > B.val �� A= A.next
 * ��A��ֵ��������������B=B.next�� 
 * ѭ���������� A == null && B==null 
 * ��ӷǿյ�����
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
