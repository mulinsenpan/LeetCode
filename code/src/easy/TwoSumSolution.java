package easy;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.text.html.HTMLEditorKit.InsertHTMLTextAction;

/**
 * 题目描述：
 * Given an array of integers, return indices of the two numbers 
 * such that they add up to a specific target.
 * 
 * 核心问题：给定sum,  a[i] + a[j] = sum  i=1...n; j=1...n; i!=j
 * 问题背景：1、数组中肯定有两个数字之和等于该数字。
 * 		  2、数组无序
 * 		  3、是否有数组大小限制？
 * 		  4、是否存在多组满足条件的数字？
 * 		  5、是否可用辅助数据结构？
 * 		  6、result[0]<result[1]
 * 假设存在多组结果。
 * for i=0...n-1
 * 	for j=0...n-1 and i!=j
 * 		if(a[i] + a[i] == sum)
 * 			result = [i,j];
 * 			return result;
 * @author Chi
 *
 */

public class TwoSumSolution {
		
	/**
	 * 只允许使用数组结构
	 * @param nums
	 * @param target
	 * @return
	 */
	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		for(int i = 0;  i < nums.length; i++){
			for(int j = 0; j != i && j < nums.length; j++){
				if(nums[i] + nums[j] == target){
					result[0] = i;
					result[1] = j;
					return result;
				}
			}
			
		}
        throw new IllegalArgumentException("no two sum solution");
    }
	
	
	
	
	public static int[] twoSum2(int[] nums, int target){
		Map<Integer, Integer> table = new HashMap<>();
		int[] result = new int[2];
		for(int i = 0; i < nums.length; i++){
			int x = nums[i];
			if (table.containsKey(target-nums[i])) {
				return new int[]{table.get(target-x), i};
			}
			table.put(x, i);
			
		}
		
		throw new IllegalArgumentException("no two sum solution");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums =  {0,2,4,0};
		int target = 0;
		System.out.print(twoSum2(nums, target)[0]+" ");
		System.out.print(twoSum2(nums, target)[1]);
	}

}
