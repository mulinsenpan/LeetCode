package ArrayAndString;

/**
 * Given an array of integers that is already sorted in ascending order, find
 * two numbers such that they add up to a specific target number.
 * 
 * The function twoSum should return indices of the two numbers such that they
 * add up to the target, where index1 must be less than index2. Please note that
 * your returned answers (both index1 and index2) are not zero-based. You may
 * assume that each input would have exactly one solution.
 * 
 * Input: numbers={2, 7, 11, 15}, target=9 Output: index1=1, index2=2
 * 
 * @author Chi
 *
 *
 * 问题背景：
 * (1)只有一组解 
 * (2)数组按照升序排列 :有哪些特性：二分查找O(logn)时间复杂度。
 * (3)第一个下标小于第二个下标
 * 
 * 在twosum无序数组中，使用两种方法：
 * 两次遍历：时间复杂度O(n^2)，空间复杂度O(1)，没有使用其他辅助数据结构
 * HashTable:时间复杂度O(n)，空间复杂度O(n)
 * 
 * 在本题中，使用Hashtable方法产生O(n)的空间复杂度，原因是没有充分利用数组有序的条件。
 * 根据Hashtable方法，需要找到target-nums[i]是否在数组中，如果在则返回下标+1，不在返回-1.
 * 在有序数组的查找方法中，二分查找的时间复杂度为O(logn)，
 * 总的时间复杂度为O(nlogn)，空间复杂度O(1)。
 * 
 * 另外一种分析方法：
 * 从nums中任选两个下标i和j，则nums[i]+nums[j] 与tartget的关系有以下三种：
 * nums[i]+nums[j] > target, 因为nums是升序排列的，因此j--；
 * nums[i]+nums[j] < target, i++；
 * nums[i]+nums[j] = target， 返回i和j。
 * 
 * 问题：如何选择初始的i和j。
 * 需要遍历整个nums，因此i=0，j=nums.length-1,
 * 问题：停止条件
 * 当i=j时，说明没有找到两个下标满足条件。
 */
public class TwoSumSorted {

	private static int bsearch(int[] nums, int key, int start) {
		int L = start;
		int R = nums.length-1;
		while(L<R){
			int M = (L+R)/2;
			if (nums[M] < key) {
				L = M + 1;
			}else{
				R = M;
			}
		}
		return (L == R && nums[L] == key)?L:-1;
	}
	
	public static int[] twoSum(int[] numbers, int target) {
		int[] result = new int[2];
		for(int i = 0; i < numbers.length; i++){
			int j = bsearch(numbers, target-numbers[i], i+1);
			if (j!=-1) {
				result[0] = i+1;
				result[1] = j+1;
				return result;
			}
		}
		throw new IllegalArgumentException("no two sum");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,4,7,9,10,17};
		System.out.println(twoSum(nums, 21)[0]);
	}

}
