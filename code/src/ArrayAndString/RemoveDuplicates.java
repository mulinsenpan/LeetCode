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
 *         问题背景： （1）数组有序 技术：双指针，一个指针慢，一个指针快。 0--第一个指针：无重复 第一个指针+1--第二个指针：重复数字
 *         第二个指针+1--最后：为访问数字。
1. 双指针技术：
0--first：无重复元素
first+1 --second:：重复元素
second+1--最后：尚未访问元素。

2. 如何想到双指针技术
（如何从一个子序列产生另外一个子序列）
	题目需要返回无重复数字的个数，一种很自然的想法是使用hashtable结构，key=nums.value。但题目要求不能使用辅助数据结构，只能在原地址上进行修改。对nums的一个从0开始到i结束的子数组subnums，假设submus不含重复元素,结束下标i.对于任意一个下标j>i，存在以下两种关系，nums[j]=nums[i]或者nums[i]>nums[i]。当相等时，i不变，j向右移动一位。当不等时，nums[j] 与nums[i+1]交换，并且i=i+1，j=j+1。
	
3. 双指针本质是进行数组元素交换？
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
