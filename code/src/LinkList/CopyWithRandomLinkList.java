package LinkList;

import java.util.HashMap;
import java.util.Map;

/**
 * 问题背景： 1. [deep copy and shallow
 * coy](http://http://www.cs.utexas.edu/~scottm/cs307/handouts/deepCopying.htm)
 * 2. 核心问题：构建节点之间的映射关系，复制链表的结构。
 * 
 * 问题1：构建节点关系映射，同时创建新的节点（而非复制引用）以及复制链表的next。 ```
 *  while (p != null){ 
 *  q.next = new RandomListNode(p.label); 
 *  map.put(p, q.next); 
 *  p = p.next;
 *  q = q.next; } ```
 * 问题2：构建random关系 根据map或者当前节点random对应的新的节点，建立关系。
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
