package medium;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

/**
 * Given an array S of n integers, are there elements 
 * a, b, c in S such that a + b + c = 0? 
 * Find all unique triplets in the array which gives the sum of zero.
 * @author Chi
 * 
 * 1�����ⱳ����
 * 		nums�����ظ�Ԫ�أ����ظ�������������ʱ���᷵���ظ��Ľ��
 * 		nums����
 * 2�����������
 *
 */
public class ThreeSum {
	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> results = new ArrayList<>();
		
		
		
		
		return results;    
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {-1, 0, 1, 2, -1, -4};
		List<List<Integer>> results = threeSum(nums);
		for (List<Integer> list : results) {
			for (Integer integer : list) {
				System.out.print(integer + " ");
			}
			System.out.println();
		}

	}

}
