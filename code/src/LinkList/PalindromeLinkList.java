package LinkList;

/**
 * ���ⱳ����
 * 
 * �б�ָ�롢ֵ�����б���в���ʱ����Ҫ����ʹ�����������洢�ṹ�����ȿ���ת��ָ�롣 ʱ�临�Ӷ�O(n)����ʾ���ֻ�ܶ��б����һ�α�����
 * �б�ֻ��һ��nextָ�롣 ���ģ����м���������չ�����������м�ۼ�����ת�Աȣ��ҵ��м�㣬��תĳһ���֣��Աȡ��ؼ��㣺˫ָ��
 * ��������ת���ҵ��м�ڵ㣬��ת�� ���⣺����ҵ��м�ڵ㣿
 * ˫ָ�룺slow��fast��fast���ٶ���slow����������fast�ܵ����ʱ��slow����λ���м䡣
 * ������Ϊ��ʱ�����أ�
 * �Ƿ���Ҫ�ָ�����
 * ��ת����ķ���������ָ��
 * 
 * @author Chi
 *
 */
class ListNode {
	int val;
	ListNode next;

	public ListNode(int x) {
		// TODO Auto-generated constructor stub
		val = x;
	}
}

public class PalindromeLinkList {
	public boolean isPalindrome(ListNode head) {
		if (head == null || head.next == null) {
			return true;
		}
		
		//�Ƿ����Ѱ���м�ڵ�Ĺ��̽�����ת�����Խ�ʡһ�α���ʱ�䡣
		ListNode slow = head, fast = head;
		while (fast != null || fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		if (fast != null) {
			slow = slow.next; // slow λ���м�ڵ�
		}

		ListNode right = reverse(slow);
		ListNode left = head;
		while (right != null) {
			if (left.val != right.val) {
				return false;
			}
			left = left.next;
			right = right.next;
		}
		return true;
	}

	private static ListNode reverse(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode pre = null;
		ListNode cur = head;
		while (cur != null) {
			ListNode next = cur.next;
			cur.next = pre;
			pre = cur;
			cur = next;
		}
		return pre;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
