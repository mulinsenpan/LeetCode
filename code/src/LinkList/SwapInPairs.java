package LinkList;

import javax.swing.plaf.metal.OceanTheme;

/**
 * Given a linked list, swap every two adjacent nodes and return its head.

For example,
Given 1->2->3->4, you should return the list as 2->1->4->3.
 * @author Chi
 * 
 * ���ⱳ����
1. ����������ָ�롣
2. ÿ�ν���һ��ListNode��
3. ����������nodeʱ�����һ��node��������

�������⣺��������node
pre-->cur-->next
cur.next = pre;
pre.next = next;
����������һ�ν�����pre = next, cur = next.next ,next = next.next
ѭ����ֹ������pre != null && cur != null

������Ϊ�ջ���ֻ��һ���ڵ�ʱ����α�����Щ��������ƣ�
���ɣ�ʹ��dummuHead  

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
