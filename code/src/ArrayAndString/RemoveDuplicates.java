package ArrayAndString;

import javax.print.attribute.standard.NumberUpSupported;

/**
 * Given a sorted array, remove the duplicates in place such that each element
 * appear only once and return the new length.
 * 
 * Do not allocate extra space for another array, you must do this in place with
 * constant memory.
 * 
 * For example, Given input array nums = [1,1,2],
 * 
 * Your function should return length = 2, with the first two elements of nums
 * being 1 and 2 respectively. It doesn't matter what you leave beyond the new
 * length.
 * 
 * @author Chi
 *
 *         ���ⱳ���� ��1���������� ������˫ָ�룬һ��ָ������һ��ָ��졣 0--��һ��ָ�룺���ظ� ��һ��ָ��+1--�ڶ���ָ�룺�ظ�����
 *         �ڶ���ָ��+1--���Ϊ�������֡�
1. ˫ָ�뼼����
0--first�����ظ�Ԫ��
first+1 --second:���ظ�Ԫ��
second+1--�����δ����Ԫ�ء�

2. ����뵽˫ָ�뼼��
����δ�һ�������в�������һ�������У�
	��Ŀ��Ҫ�������ظ����ֵĸ�����һ�ֺ���Ȼ���뷨��ʹ��hashtable�ṹ��key=nums.value������ĿҪ����ʹ�ø������ݽṹ��ֻ����ԭ��ַ�Ͻ����޸ġ���nums��һ����0��ʼ��i������������subnums������submus�����ظ�Ԫ��,�����±�i.��������һ���±�j>i�������������ֹ�ϵ��nums[j]=nums[i]����nums[i]>nums[i]�������ʱ��i���䣬j�����ƶ�һλ��������ʱ��nums[j] ��nums[i+1]����������i=i+1��j=j+1��
	
3. ˫ָ�뱾���ǽ�������Ԫ�ؽ�����
 */
public class RemoveDuplicates {
	public static int removeDuplicates(int[] nums) {
		int first = 0;
		int second = 1;
		while (second < nums.length) {
			if (nums[first] == nums[second]) {
				second += 1;
			} else {
				if (first + 1 == second) {
					first += 1;
					second += 1;
				} else {
					int temp = nums[first + 1];
					nums[first + 1] = nums[second];
					nums[second] = temp;
					first += 1;
					second += 1;
				}
			}
		}
		return first + 1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 2, 3, 4, 5, 5, 6, 6 };
		System.out.println(removeDuplicates(nums));
	}

}
