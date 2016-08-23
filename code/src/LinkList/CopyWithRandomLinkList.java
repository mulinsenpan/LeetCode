package LinkList;

import java.util.HashMap;
import java.util.Map;

/**
 * ���ⱳ���� 1. [deep copy and shallow
 * coy](http://http://www.cs.utexas.edu/~scottm/cs307/handouts/deepCopying.htm)
 * 2. �������⣺�����ڵ�֮���ӳ���ϵ����������Ľṹ��
 * 
 * ����1�������ڵ��ϵӳ�䣬ͬʱ�����µĽڵ㣨���Ǹ������ã��Լ����������next�� ```
 *  while (p != null){ 
 *  q.next = new RandomListNode(p.label); 
 *  map.put(p, q.next); 
 *  p = p.next;
 *  q = q.next; } ```
 * ����2������random��ϵ ����map���ߵ�ǰ�ڵ�random��Ӧ���µĽڵ㣬������ϵ��
 * while (p != null){
 * q.next.random = map.get(p.random); 
 * p = p.next; q = q.next; }
 * 
 * @author Chi
 *
 */

class RandomListNode {
	int label;
	RandomListNode next, random;

	RandomListNode(int x) {
		this.label = x;
	}
};

public class CopyWithRandomLinkList {
	public RandomListNode copyRandomList(RandomListNode head) {
		Map<RandomListNode, RandomListNode> map = new HashMap<>();
		RandomListNode dummy = new RandomListNode(0);
		RandomListNode p = head;
		RandomListNode q = dummy;
		while (p != null) {
			q.next = new RandomListNode(p.label);
			map.put(p, q.next);
			p = p.next;
			q = q.next;
		}

		p = head;
		q = dummy;
		while (p != null) {
			q.next.random = map.get(p.random);
			p = p.next;
			q = q.next;
		}
		return dummy.next;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
