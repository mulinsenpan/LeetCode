package ArrayAndString;

/**
 * Rotate an array of n elements to the right by k steps.
 * 
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to
 * [5,6,7,1,2,3,4].
 * 
 * Note: Try to come up as many solutions as you can, there are at least 3
 * different ways to solve this problem.
 * 
 * @author Chi 核心问题：数组向右移动k个长度。 问题背景：n=0、n=1、k=0，k>n等情况。 问题分析：
 * 
 */
public class RotateArray {

	public static void rotate(int[] nums, int k) {
		int length = nums.length;
		if (length==0 || length == 1) {
			return;
		}
		if (k==0||k==length) {
			return;
		}
		if (k>length) {
			k = k%length;
		}
		
		reserve(nums, 0, length-1);
		reserve(nums, 0, k-1);
		reserve(nums, k, length-1);

	}
	
	private static void reserve(int[] nums, int start, int end) {
		while(start < end){
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start += 1;
			end -= 1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4,5,6};
		rotate(nums, 8);
		
		for (int i : nums) {
			System.out.print(i+" ");
		}

	}

}
