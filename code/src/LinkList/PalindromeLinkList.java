package LinkList;

/**
 * 问题背景：
 * 
 * 列表：指针、值；对列表进行操作时，若要求不能使用其他辅助存储结构，首先考虑转换指针。 时间复杂度O(n)，表示最多只能对列表进行一次遍历。
 * 列表：只有一个next指针。 回文：从中间向两端扩展；从两端向中间聚集；逆转对比；找到中间点，逆转某一部分，对比。关键点：双指针
 * 单链表：逆转；找到中间节点，逆转。 问题：如何找到中间节点？
 * 双指针：slow，fast，fast的速度是slow的两倍，当fast跑到最后时，slow正好位于中间。
 * 当链表为空时，返回？
 * 是否需要恢复链表？
 * 逆转连标的方法：交换指针
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
		
		//是否可在寻找中间节点的过程进行逆转？可以节省一次遍历时间。
		ListNode slow = head, fast = head;
		while (fast != null || fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		if (fast != null) {
			slow = slow.next; // slow 位于中间节点
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
