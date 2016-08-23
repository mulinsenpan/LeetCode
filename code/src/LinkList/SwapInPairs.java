package LinkList;

import javax.swing.plaf.metal.OceanTheme;

/**
 * Given a linked list, swap every two adjacent nodes and return its head.

For example,
Given 1->2->3->4, you should return the list as 2->1->4->3.
 * @author Chi
 * 
 * 问题背景：
1. 单链表：交换指针。
2. 每次交换一对ListNode。
3. 含有奇数个node时，最后一个node不交换。

核心问题：交换两个node
pre-->cur-->next
cur.next = pre;
pre.next = next;
继续进行下一次交换：pre = next, cur = next.next ,next = next.next
循环终止条件：pre != null && cur != null

当链表为空或者只有一个节点时，如何避免这些额外的限制？
技巧：使用dummuHead  

 *
 */
public class SwapInPairs {
	
	public static ListNode swapPairs(ListNode head) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode prev = dummyHead;
        ListNode pre = head;
        
        while(pre != null && pre.next != null){
            ListNode cur = pre.next, next = pre.next.next;
            prev.next = cur;
            cur.next = pre;
            pre.next = next;
            
            prev = pre;
            pre = next;
        }
        return dummyHead.next;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode one = new ListNode(1);
		ListNode two = new ListNode(2);
		ListNode three = new ListNode(3);
		ListNode four = new ListNode(4);
		ListNode five = new ListNode(5);
		ListNode six = new ListNode(6);
		
		one.next = two;
		two.next = three;
		three.next = four;
		four.next = five;
		five.next = six;
		
		
	
		
		
	}

}
