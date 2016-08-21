package easy;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.text.html.HTMLEditorKit.InsertHTMLTextAction;

/**
 * ��Ŀ������
 * Given an array of integers, return indices of the two numbers 
 * such that they add up to a specific target.
 * 
 * �������⣺����sum,  a[i] + a[j] = sum  i=1...n; j=1...n; i!=j
 * ���ⱳ����1�������п϶�����������֮�͵��ڸ����֡�
 * 		  2����������
 * 		  3���Ƿ��������С���ƣ�
 * 		  4���Ƿ���ڶ����������������֣�
 * 		  5���Ƿ���ø������ݽṹ��
 * 		  6��result[0]<result[1]
 * ������ڶ�������
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
	 * ֻ����ʹ������ṹ
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
